package com.firebase.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SPController {
	
	@RequestMapping("/porta")
	public String teste(){
		return "Teste de portas";
	}

}
