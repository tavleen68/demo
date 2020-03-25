package com.DevOps.Capstone.Project.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController 
{
	@RequestMapping("/bankApp/login")
	public ModelAndView Display()
	{
		ModelAndView MVobj= new ModelAndView();
		MVobj.setViewName("Login");
		return MVobj;
	}
}
