package com.example.artem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TopController {

	@RequestMapping("/top")
	public String top() {
		return "top";
	}
}
