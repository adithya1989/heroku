package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Websample1Application {

	public static void main(String[] args) {
		SpringApplication.run(Websample1Application.class, args);
	}
	
	 @GetMapping("/")
	  public String hello() {
	    return "hello world!";
	  }
	 
	 @GetMapping("/name/{name}")
	  public String name(@PathVariable(value="name")String name) {
	    return "hello world! "+name;
	  }
}
