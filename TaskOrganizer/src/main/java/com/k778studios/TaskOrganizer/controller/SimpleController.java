package com.k778studios.TaskOrganizer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SimpleController {

	@RequestMapping({"/", ""})
	public String getIndexPage(Model model)
	{
		
		model.addAttribute("helloWorld", "Hello World");
		
		return "/simplePage";
	}
	
}
