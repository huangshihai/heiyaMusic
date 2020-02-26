package com.heiya123.music.util;

import com.alibaba.fastjson.JSON;
import okhttp3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 网络请求工具类
 */
public class OkHttpUtils {
    private static final byte[] LOCKER = new byte[0];
    private static OkHttpUtils mInstance;
    private static OkHttpClient mOkHttpClient;
    private static Logger logger = LoggerFactory.getLogger(OkHttpUtils.class);

    static {
        okhttp3.OkHttpClient.Builder ClientBuilder = new okhttp3.OkHttpClient.Builder();
        ClientBuilder.readTimeout(30, TimeUnit.SECONDS);//读取超时
        ClientBuilder.connectTimeout(10, TimeUnit.SECONDS);//连接超时
        ClientBuilder.writeTimeout(60, TimeUnit.SECONDS);//写入超时
        mOkHttpClient = ClientBuilder.build();
    }

    /**
     * get方法获取实体bean
     *
     * @param reqUrl        UR连接
     * @param headersParams 请求头参数
     */
    public static String getRequest(String reqUrl, Map<String, String> headersParams) {
        String rsp = null;
        try {
            okhttp3.Request.Builder RequestBuilder = new okhttp3.Request.Builder();
            RequestBuilder.url(reqUrl);//添加URL地址
            RequestBuilder.headers(setHeaders(headersParams));//添加请求头
            Request request = RequestBuilder.build();
            Call call = mOkHttpClient.newCall(request);
            Response response = call.execute();
            rsp = response.body().string();
        } catch (Exception e) {
            logger.debug("GET请求出错,url={}", reqUrl);
        }
        return rsp;
    }

    /**
     * get方法获取实体bean
     *
     * @param reqUrl        UR连接
     * @param headersParams 请求头参数
     * @param params        请求参数
     */
    public static String getRequest(String reqUrl, Map<String, String> headersParams, Map<String, String> params) {
        return getRequest(reqUrl + setUrlParams(params), headersParams);
    }

    /**
     * get方法获取实体bean
     *
     * @param reqUrl        UR连接
     * @param headersParams 请求头参数
     * @param params        请求参数
     * @param rspClass      实体类 执行命令获取指定结构 rspClass : 所需转出的结构，例：UserBean.class
     */
    public static <T> T getRequest(String reqUrl, Map<String, String> headersParams, Map<String, String> params,
                                   final Class<T> rspClass) {
        T t = null;
        try {
            String rsp = getRequest(reqUrl, headersParams, params);
            if (!StringUtils.isEmpty(rsp)) {
                rsp = CommonUtils.jsonp2Json(rsp);
                t = rspClass.newInstance();
                t = JSON.parseObject(rsp, rspClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * post方法获取实体bean
     *
     * @param reqUrl        UR连接
     * @param headersParams 请求头参数
     * @param params        请求参数
     */
    public static String postRequest(String reqUrl, Map<String, String> headersParams, Map<String, String> params) {
        String rsp = null;
        try {
            okhttp3.Request.Builder RequestBuilder = new okhttp3.Request.Builder();
            RequestBuilder.url(reqUrl);//添加URL地址
            RequestBuilder.headers(setHeaders(headersParams));//添加请求头
            RequestBuilder.post(setRequestBody(params));//添加请求头
            Request request = RequestBuilder.build();
            Call call = mOkHttpClient.newCall(request);
            String json = "";
            Response response = call.execute();
            rsp = response.body().string();
        } catch (Exception e) {
            logger.debug("POST请求出错,url=\"{}\",params={}", reqUrl, JSON.toJSONString(params));
        }
        return rsp;
    }

    /**
     * post方法获取实体bean
     *
     * @param reqUrl        UR连接
     * @param headersParams 请求头参数
     * @param params        请求参数
     * @param rspClass      实体类 执行命令获取指定结构 rspClass : 所需转出的结构，例：UserBean.class
     */
    public static <T> T postRequest(String reqUrl, Map<String, String> headersParams, Map<String, String> params,
                                    final Class<T> rspClass) {
        T t = null;
        try {
            String rsp = postRequest(reqUrl, headersParams, params);
            if (!StringUtils.isEmpty(rsp)) {
                rsp = CommonUtils.jsonp2Json(rsp);
                t = rspClass.newInstance();
                t = JSON.parseObject(rsp, rspClass);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }

    /**
     * 设置请求头
     *
     * @param headersParams
     * @return
     */
    private static Headers setHeaders(Map<String, String> headersParams) {
        Headers headers = null;
        okhttp3.Headers.Builder headersbuilder = new okhttp3.Headers.Builder();

        if (headersParams != null) {
            Iterator<String> iterator = headersParams.keySet().iterator();
            String key = "";
            while (iterator.hasNext()) {
                key = iterator.next().toString();
                headersbuilder.add(key, headersParams.get(key));
            }
        }
        headers = headersbuilder.build();

        return headers;
    }

    /**
     * post请求参数
     *
     * @param BodyParams
     * @return
     */
    private static RequestBody setRequestBody(Map<String, String> BodyParams) {
        RequestBody body = null;
        FormBody.Builder builder = new FormBody.Builder();
        if (BodyParams != null) {
            Iterator<String> iterator = BodyParams.keySet().iterator();
            String key = "";
            while (iterator.hasNext()) {
                key = iterator.next().toString();
                builder.add(key, BodyParams.get(key));
            }
        }
        body = builder.build();
        return body;
    }

    /**
     * Post上传图片的参数
     *
     * @param BodyParams
     * @param fileParams
     * @return
     */
    private static RequestBody setFileRequestBody(Map<String, String> BodyParams, Map<String, String> fileParams) {
        //带文件的Post参数
        RequestBody body = null;
        okhttp3.MultipartBody.Builder MultipartBodyBuilder = new okhttp3.MultipartBody.Builder();
        MultipartBodyBuilder.setType(MultipartBody.FORM);
        RequestBody fileBody = null;

        if (BodyParams != null) {
            Iterator<String> iterator = BodyParams.keySet().iterator();
            String key = "";
            while (iterator.hasNext()) {
                key = iterator.next().toString();
                MultipartBodyBuilder.addFormDataPart(key, BodyParams.get(key));
            }
        }

        if (fileParams != null) {
            Iterator<String> iterator = fileParams.keySet().iterator();
            String key = "";
            int i = 0;
            while (iterator.hasNext()) {
                key = iterator.next().toString();
                i++;
                MultipartBodyBuilder.addFormDataPart(key, fileParams.get(key));
                fileBody = RequestBody.create(MediaType.parse("image/png"), new File(fileParams.get(key)));
                MultipartBodyBuilder.addFormDataPart(key, i + ".png", fileBody);
            }
        }
        body = MultipartBodyBuilder.build();
        return body;

    }

    /**
     * get方法连接拼加参数
     *
     * @param mapParams
     * @return
     */
    private static String setUrlParams(Map<String, String> mapParams) {
        String strParams = mapParams != null && mapParams.size() > 0 ? "?" : "";
        if (mapParams != null) {
            Iterator<String> iterator = mapParams.keySet().iterator();
            String key = "";
            while (iterator.hasNext()) {
                key = iterator.next().toString();
                if ("?".equals(strParams)) {
                    strParams += key + "=" + mapParams.get(key);
                } else {
                    strParams += "&" + key + "=" + mapParams.get(key);
                }
            }
        }
        return strParams;
    }
}
