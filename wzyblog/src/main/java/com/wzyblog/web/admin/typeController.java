package com.wzyblog.web.admin;/*
 *@Auther: wzy
 *@Date:2021/11/1 -11-01
 *@Descreption: com.wzyblog.web.admin
 *@Version: 1.0
 */

import com.wzyblog.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class typeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/types")
    public String types(
            @PageableDefault(size=12, sort = {"id"},direction = Sort.Direction.DESC)Pageable pageable,
            Model model){
        model.addAttribute("page",typeService.listType(pageable));
        return "manage/types";
    }

}
