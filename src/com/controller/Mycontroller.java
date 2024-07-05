package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Bo.Bo;
import com.model.Student;

@Controller
public class Mycontroller 
{
	@RequestMapping(value="/",method = RequestMethod.POST)
	public String index()
	{
		return "index";
	}
	@RequestMapping("/display")
	public String display()
	{
		return "display";
	}
	@RequestMapping("/insert")
	public String insert(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		Student s1=new Student();
		s1.setName(request.getParameter("uname"));
		s1.setAddress(request.getParameter("uaddress"));
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Bo bo=(Bo)context.getBean("bo");
		bo.insertStudent(s1);
		return "display";
	}

	

}
