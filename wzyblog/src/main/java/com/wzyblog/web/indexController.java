package com.wzyblog.web;/*
 *@Auther: wzy
 *@Date:2021/10/27 -10-27
 *@Descreption: com.wzyblog.web
 *@Version: 1.0
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
    @GetMapping("/")
    public String index(){

//        int a=9/0;
        return "index";
    }

}
