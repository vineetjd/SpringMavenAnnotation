package com.pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/hello1")
	public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response, @ModelAttribute Addition a) {
		
		int n1=Integer.parseInt(request.getParameter("n1"));
		int n2=Integer.parseInt(request.getParameter("n2"));
		
		a.setN1(n1);
		a.setN2(n2);

		ModelAndView mv=new ModelAndView("display");
		mv.addObject("sum", a.sum());
		
		return mv;
	}
}
