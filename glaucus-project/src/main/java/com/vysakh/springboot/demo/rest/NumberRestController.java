package com.vysakh.springboot.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vysakh.springboot.demo.service.NumberService;

@RestController

public class NumberRestController {
	
	private NumberService numberService;
	
	public NumberRestController(NumberService theNumberService)
	{
		numberService=theNumberService;
	}
	
	@PostMapping("/api")
	public String sayHello()
	{
		//System.out.println(""+theNumber.getNumber());
		numberService.save();
		return "Hello World!";
	}
	
	@GetMapping("/num")
	public String getURL(@RequestBody com.vysakh.springboot.demo.entity.Number theNumber)
	{
		System.out.println("abc "+theNumber.getNumber());
		return "Hello!!";
	}
}
