package com.gdut.imis.controller;

import com.gdut.imis.pojo.User;
import com.gdut.imis.service.UserService;
import com.gdut.imis.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("")
public class UserController {
    @Autowired
    UserService userService;

@RequestMapping("admin_user_list")
    public String list(Model model, Page page){
    PageHelper.offsetPage(page.getStart(),page.getCount());
    List<User> us=userService.list();
    int total=(int) new PageInfo<>(us).getTotal();
    page.setTotal(total);
    model.addAttribute("us",us);
    model.addAttribute("page",page);
    return "admin/listUser";
}
@RequestMapping("admin_user_add")
    public String add(Model model,User us){
    userService.add(us);
    return  "redirect:admin_user_list";
}
@RequestMapping("admin_user_delete")
    public String delete(int id){
    User us =userService.get(id);
    userService.delete(id);
    return "redirect:admin_user_list";
}
    @RequestMapping("admin_user_edit")
    public String edit(int id,Model model) throws IOException {
        User us= userService.get(id);
        model.addAttribute("us", us);
        return "admin/editUser";
    }
    @RequestMapping("admin_user_update")
    public String update(User us){
    userService.update(us);
    return "redirect:admin_user_list";
    }
}
