package io.murad.cms.blog.controller;

import io.murad.cms.blog.model.User;
import io.murad.cms.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/userList")
    public String getUsers(Model model){
        List<User> users = userService.getAllUsers();
        model.addAttribute("users",users);
        return "admin/user/userList";
    }
    @GetMapping( "/createUser")
    public String createUser(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "admin/user/userForm";
    }

    @PostMapping( "/addUser")
    public String addUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:admin/user/userList";
    }
}
