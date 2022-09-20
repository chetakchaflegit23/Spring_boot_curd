package com.yash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yash.model.Student;
import com.yash.service.HomeService;

@RestController
public class HomeController {     
	
	@Autowired
	HomeService hs;
	
	@PostMapping("/poststudentdata")
	public Student setdata(@RequestBody Student s){
		return hs.savedata(s);
		
	}
	
	@GetMapping("/getstudentdata")
	public List<Student> getdata()
	{
		return hs.getdata();
		
	}
	
	@PutMapping("/updatestudentdata/{id}")
	public Student updatedata(@PathVariable int id, @RequestBody Student s)
	{
		return hs.updatedata(id,s);	
	}
	
	@DeleteMapping("/deletstudentdata/{id}")
	public String deletedata(@PathVariable int id)
    {
		return hs.deletedata(id);
    }
	
}
