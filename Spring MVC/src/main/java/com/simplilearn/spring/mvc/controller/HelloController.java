package com.simplilearn.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

//	@RequestMapping("/view")
//	public String redirect() {
//		return "view";
//	}
//	
//	@RequestMapping("/final")
//	public String display() {
//		return "final";
//	}
	
	@RequestMapping("/view")
	public String display(@RequestParam("name")String username, @RequestParam("pass")String password, Model model) {
		
		
		if(password.equals("admin")) {
			String message = "Hello " + username;
			model.addAttribute("message", message);
			return "view";
		}
		else {
			String message = "Sorry " + username + ". You have entered an incorrect password.";
			model.addAttribute("message", message);
			return "error";
		}
	}
	
}
