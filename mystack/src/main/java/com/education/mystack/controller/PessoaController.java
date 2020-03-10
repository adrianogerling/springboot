package com.education.mystack.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@GetMapping(value = "/pessoa-mystack", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPessoaMyStack() {
		return "Pessoa_Education_MyStack";
	}
	
}
