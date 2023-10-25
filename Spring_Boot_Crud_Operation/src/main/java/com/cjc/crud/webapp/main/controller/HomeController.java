package com.cjc.crud.webapp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.crud.webapp.main.model.Student;
import com.cjc.crud.webapp.main.servicei.StudentServiceI;

@Controller
public class HomeController 
{
	@Autowired
	StudentServiceI si;

	@RequestMapping("/")
	public String prelogin()
	{
		return "login";
	}

	@RequestMapping("/create")
	public String register()
	{
		return "registration";
	}	

	@RequestMapping("/save")
	public String savedata(@ModelAttribute Student s)
	{
		si.savedata(s);
		
		return "login";
	}
	
	@RequestMapping("/logs")
	public String logincheck(@RequestParam ("username") String un, @RequestParam("password")String ps, Model m)
	{
		si.logincheck(un,ps);
		
		Iterable list = si.displayAllData();
		m.addAttribute("l", list);
		return "success";
	}
}
