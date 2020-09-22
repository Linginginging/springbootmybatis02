package com.offcn.springbootmybatis.controller;

import com.offcn.springbootmybatis.pojo.User;
import com.offcn.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    /**
     * 获取所有用户
     * @return
     */
    @GetMapping("/")
    public List<User> getUserList(){
        return userService.getUserList();
    }

    @PostMapping("/")
    public String createUser(User user){
    userService.createUser(user);
    return "success";
    }

    @GetMapping("/{id}")
    public User fingOne(@PathVariable("id") Long id){

        return userService.getUser(id);

    }

    @PutMapping("/{id}")
    public String updUser(@PathVariable("id") Long id,User user){
        userService.updateUser(id,user);
        return "success";
    }

    @DeleteMapping("/{id}")
    public String delUser(@PathVariable("id") Long id){
        userService.deleteUser(id);
        return "success";
    }


}
