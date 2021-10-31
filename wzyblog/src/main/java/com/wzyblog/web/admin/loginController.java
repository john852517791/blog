package com.wzyblog.web.admin;/*
 *@Auther: wzy
 *@Date:2021/10/31 -10-31
 *@Descreption: com.wzyblog.web.admin
 *@Version: 1.0
 */

import com.wzyblog.Util.MD5Utils;
import com.wzyblog.entity.User;
import com.wzyblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class loginController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String loginPage(){
        return "manage/login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession httpSession,
                        RedirectAttributes attributes){
        User user = userService.checkUser(username, MD5Utils.code(password));
        if(user==null){
            attributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/admin";
//            重定向访问url
        }else {
            user.setPassword(null);
//            将user对象传入session前先将密码置空，防止泄露
            httpSession.setAttribute("user",user);
            return "manage/index";
        }
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }

    @RequestMapping("/blogs")
    public String blogs(HttpSession session){

        return "manage/list";
    }


}
