package com.suinautant.LearnAjaxSpringBootJSP.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.suinautant.LearnAjaxSpringBootJSP.object.Hobby;

@Controller
public class HobbyController {
	
	@GetMapping("/hobby")
	public String hobby(Model model) {
		Hobby hobby1 = new Hobby(1, "lee", "book");
		Hobby hobby2 = new Hobby(2, "choi", "music");
		Hobby hobby3 = new Hobby(3, "kim", "sports");
		List<Hobby> hobbys = new ArrayList<Hobby>();
		hobbys.add(hobby1);
		hobbys.add(hobby2);
		hobbys.add(hobby3);
		model.addAttribute("hobbys", hobbys);
		return "hobby";
	}

}
