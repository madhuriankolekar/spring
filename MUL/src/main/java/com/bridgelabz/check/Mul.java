package com.bridgelabz.check;  


import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mul {
	@RequestMapping("/mul")
	public ModelAndView ModelAndView  (@RequestParam("num1") int i, @RequestParam("num2") int j, HttpServletRequest request,HttpServletResponse  response)
//	int i = Integer.parseInt(request.getParameter("num1"));
//	int j = Integer.parseInt(request.getParameter("num2"));
	{
	int f = i * j;
	ModelAndView mv = new ModelAndView();
	mv.setViewName("NewFile");
	mv.addObject("result", f);
	return mv;
	}
}

