package com.ultragain.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		System.out.println("hi home....");
		
		//return "home.jsp"; // when home.jsp is just inside webapp folder
		
		/* no need to put .jsp extension
		putted jsp inside pages folder and also put prefix and suffix entries inside application.properties file
		*/
		return "home"; 
	}

}
