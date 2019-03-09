package com.dahan.myespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@GetMapping("t1")
	public String myget(String s) {
		return s ;
	}
}
