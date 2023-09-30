package com.khadri.spring.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

	@PostMapping("/store/student")
	@ResponseStatus(code = HttpStatus.CREATED, reason = "stored successfully")
	public void storeStudent() {

	}

	@GetMapping("/get/student")
	@ResponseStatus(code = HttpStatus.OK)
	public void getStudent() {

	}

}
