package com.mani.pcfrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/demo")
public class RestdemoApplication {
	
	@Autowired
	private RestdemoService service;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}
	
	
	
	@RequestMapping(value = "/get/{id}", produces="application/json", method = RequestMethod.GET)
	
	public Orders index(@PathVariable Integer id)
	{
		return service.get(id);
	}
	
	
	
	@RequestMapping(value = "/add/{id}/{name}/{quantity}", method = RequestMethod.POST,consumes="application/json")
	
	public String add(@PathVariable String name,@PathVariable Integer id,@PathVariable Integer quantity)
	{
		service.save(name,id,quantity);
		return "SUCCESS";
						
	}
	
}
