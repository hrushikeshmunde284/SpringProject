package com.BikkadIT.WorkingWithGETReq.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.WorkingWithGETReq.model.Student;

@RestController
public class StudentController {
	
	@GetMapping(value="/getStudent",produces = { "application/xml","application/json"})
	
	public ResponseEntity<Student> getStudent (){
		
		
		Student stu = new Student ();
		
		stu.setSid(1);
		stu.setSname("Hrushi");
		stu.setSaddress("Pune");
		stu.setSage(23);
		
		return new ResponseEntity<Student>(stu,HttpStatus.OK);
		
		
		
		
	
	
	
	
	

}}
