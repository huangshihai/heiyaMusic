package com.heiya123.music.util;

import java.security.MessageDigest;

public class CommonUtils {

    /**
     * JSONP转JSON
     *
     * @param str
     * @return
     */
    public static String jsonp2Json(String str) {
        if (str != null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            String string = stringBuilder.reverse().toString();
            int i = str.indexOf("{");
            int j = string.indexOf("}");
            return i != -1 && j != -1 && i < str.length() - j ? str.substring(i, str.length() - j) : null;
        }
        return null;
    }

    public static String getMD5(String s) {
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] bytes = md.digest(s.getBytes("utf-8"));
            return toHex(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String toHex(byte[] bytes) {

        final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
        StringBuilder ret = new StringBuilder(bytes.length * 2);
        for (int i=0; i<bytes.length; i++) {
            ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
            ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
        }
        return ret.toString();
    }
}
