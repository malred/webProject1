package com.malred.webproject.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author malguy-wang sir
 * @create ---
 */
@ControllerAdvice
public class myException {
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)//表示拦截所有异常
    public ModelAndView fileUploadException(Exception e){
        ModelAndView error = new ModelAndView("error");
        error.addObject("error",e.getMessage());
        return error;//跳转到error.ftl
    }
}