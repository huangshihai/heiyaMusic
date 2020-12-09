package com.heiya123.music.config;

import com.heiya123.music.util.JacksonUtil;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.io.InputStreamSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

/**
 * @author: huangsh
 * @date: 2020-12-19 14:15:36
 */
@Aspect
@Component
@Log4j2
public class LogAop {

  @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
  public void cutA() {
  }

  @Pointcut("@annotation(org.springframework.web.bind.annotation.PostMapping)")
  public void cutB() {
  }

  @Pointcut("@annotation(org.springframework.web.bind.annotation.PutMapping)")
  public void cutC() {
  }

  @Pointcut("@annotation(org.springframework.web.bind.annotation.PatchMapping)")
  public void cutD() {
  }

  @Pointcut("execution(* com.heiya123.music..*.*(..))")
  public void cutE() {
  }


  @Before("(cutA()||cutB()||cutC()||cutD()) && cutE()")
  public void before(JoinPoint joinPoint) {
    Object[] args = joinPoint.getArgs();
    if (args != null) {
      for (int i = 0; i < args.length; i++) {
        if (args[i] instanceof Errors) {
          args[i] = null;
        }
        if (args[i] instanceof ServletRequest) {
          args[i] = null;
        }
        if (args[i] instanceof ServletResponse) {
          args[i] = null;
        }
        if (args[i] instanceof InputStreamSource || args[i] instanceof InputStreamSource[]) {
          args[i] = null;
        }
        if (args[i] instanceof InputStream) {
          args[i] = null;
        }
        if (args[i] instanceof OutputStream) {
          args[i] = null;
        }
      }
    }
    log.info("请求参数：{}", JacksonUtil.write(args));
  }
}
