package com.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;


@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model	model) {
		model.addAttribute("message", "Hello~~~~~~~");
		
		return "home";
	}

}
