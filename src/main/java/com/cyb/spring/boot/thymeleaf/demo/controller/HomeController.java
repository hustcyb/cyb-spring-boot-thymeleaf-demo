package com.cyb.spring.boot.thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("name", "Guest");
		return "home";
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}
}
