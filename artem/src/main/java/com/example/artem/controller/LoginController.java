package com.example.artem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.example.artem.mapper.UserMapper;
import com.example.artem.table.User;

@Controller
@RequestMapping("/test")
public class LoginController {

	@Autowired
	private UserMapper userMapper;

	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value="/check", method=RequestMethod.POST)
	public String loginCheck(@ModelAttribute("form")User user) {
		
		userMapper.isUserAccount(user.getLoginId(), user.getPassword());
		return "redirect:/test/login";
		
	}
}
