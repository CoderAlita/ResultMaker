package com.example.resultmaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {

	@GetMapping("/form")
	
	public String form(Model model) {
		model.addAttribute("University", "Mumbai");
		return "form";
	}
	
	@PostMapping("/result")
	public String result(@ModelAttribute("University") String Result, Model model) {
		
		model.addAttribute("name", Result);
		System.out.println(Result);
		return "result";
	}
}
