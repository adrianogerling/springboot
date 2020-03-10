package com.education.mystack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.mystack.service.PessoaService;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

	@Autowired
	PessoaService pessoaService;
	
	@GetMapping(value = "/pessoa-mystack", produces = MediaType.APPLICATION_JSON_VALUE)
	public String getPessoaMyStack() {
		return pessoaService.getById(123);
	}
	
}
