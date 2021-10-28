package com.wzyblog.handler;/*
 *@Auther: wzy
 *@Date:2021/10/28 -10-28
 *@Descreption: com.wzyblog.handler
 *@Version: 1.0
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {


//    在工厂里面取出一个日志对象
    private Logger logger= LoggerFactory.getLogger(this.getClass());


    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request,Exception e) throws Exception {

        logger.error("RequestURL : {},Exception : {}",request.getRequestURL(),e.toString());
//        在控制台输出异常


//        如果在注解中找到了有关此异常的状态标注,那就丢给那个方法处理
        if((AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!=null)){
            throw e;
        }
//      反之如果没找到,统统交给这个handler处理


        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("requestURL",request.getRequestURL());
//        modelAndView.addObject("exception",e);
        modelAndView.setViewName("error/error");

        return  modelAndView;
    }

}
