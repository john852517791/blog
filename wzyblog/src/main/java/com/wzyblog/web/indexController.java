package com.wzyblog.web;/*
 *@Auther: wzy
 *@Date:2021/10/27 -10-27
 *@Descreption: com.wzyblog.web
 *@Version: 1.0
 */
import com.wzyblog.Exception.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class indexController {
    @GetMapping("/{name}/{id}")
    public String index(@PathVariable String name,@PathVariable Integer id){

//        假设场景:如果博客原文找不到了
//        String blog=null;
//        if(blog==null){
//            throw new BlogNotFoundException("博客原文消失了");
//        }
//        测试500
//        int a=9/0;



        return "index";
    }

}
