package com.suinautant.LearnAjaxSpringBootJSP.controller;


import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public void hello(HttpServletResponse response) throws IOException {
		System.out.println("##### HELLO : TEST");
		response.getWriter().print("<h2>HELLO WORLD</h2>");
	}
}
