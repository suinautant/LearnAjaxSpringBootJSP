package com.suinautant.LearnAjaxSpringBootJSP.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.suinautant.LearnAjaxSpringBootJSP.object.Post;

@Controller
public class JspController {
	
	@GetMapping("/jsp")
	public String jsp(Model model) {
		System.out.println("##### JSP CONTROLLER #####");
		Post post1 = new Post(1, "lee", "book1");
		Post post2 = new Post(2, "choi", "book2");
		Post post3 = new Post(3, "kim", "book3");
		List<Post> list = new ArrayList<Post>();
		list.add(post1);
		list.add(post2);
		list.add(post3);
		model.addAttribute("list", list);
		return "test";
	}

}
