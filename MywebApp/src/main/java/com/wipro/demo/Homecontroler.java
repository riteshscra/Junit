package com.wipro.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Homecontroler {
	
	@RequestMapping("home")
	
	public String home()
	{
		System.out.println("hiii");
		return "home.jsp";
	}

}
