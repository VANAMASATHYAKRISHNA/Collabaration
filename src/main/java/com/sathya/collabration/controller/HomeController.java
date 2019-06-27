package com.sathya.collabration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@RequestMapping("/testing")
	public String test()
	{
		return "hello";
		
	}

}
