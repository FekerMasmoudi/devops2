package com.devops.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


		//creating a get mapping that retrieves all the books detail from the database   
		@GetMapping("/hello")  
		private String getHelloMessage()   
		{  
			return "Hello Jenkins Soretras :)" ;  
		}  
}
