package com.example.resultmaker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.resultmaker.entity.StudentDetails;


@Controller
public class FormController {

	@GetMapping("/form")
	
	public String form(Model model) {
		model.addAttribute("StudentDetails", new StudentDetails());
		return "form";
	}
	
	@PostMapping("/result")
	public String result(@ModelAttribute("StudentDetails") StudentDetails studentDetails, Model model) {
		
//		model.addAttribute("name", studentDetails);
		System.out.println(studentDetails);
		return "result";
	}
	
}
