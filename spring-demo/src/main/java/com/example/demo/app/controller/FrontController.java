package com.example.demo.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.object.User;
import com.example.demo.domain.service.UserService;

@Controller
public class FrontController {

	// FrontControllerが大きくなりすぎるのでUser用のコントローラ作ってそっちにサービス置くべき
	@Autowired
	  UserService userservice;

    @RequestMapping({ "/", "/index" })
    public String index(Model model) {
    	//return "index";
    	List<User> userlist = userservice.getAllUser();
    	model.addAttribute("user", userlist); // attribute:List<user>
    	return "userList";
    }

    @RequestMapping( "/login" )
    public String loginEntry(Model model) {
    	model.addAttribute("hello", "Hello World!"); // attribute:hello

        User user = userservice.getById(1001);
        model.addAttribute("user", user); // attribute:user
        return "userLogin";
    }


    @RequestMapping( "/userlist" )
    public String userList(Model model) {
    	List<User> userlist = userservice.getAllUser();
    	model.addAttribute("user", userlist); // attribute:List<user>
    	return "userList";

    }


}
