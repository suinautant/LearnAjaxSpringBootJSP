package com.suinautant.LearnAjaxSpringBootJSP.payroll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/api")
public class ApiController {
	
	@GetMapping("/list")
	String list() {
		return "list";
	}
	
	@GetMapping("/list/{id}")
	String view(@PathVariable Long id, Model model) {
		model.addAttribute("id", id);
		return "view";
	}
	
	@GetMapping("/write")
	String write() {
		return "write";
	}
	
	@GetMapping("/modify")
	String modify(@RequestParam(value = "id", required = true)Long id, Model model) {
		model.addAttribute("id", id);
		return "modify";
	}

}
