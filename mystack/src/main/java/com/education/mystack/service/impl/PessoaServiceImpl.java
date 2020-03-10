package com.education.mystack.service.impl;

import org.springframework.stereotype.Service;

import com.education.mystack.service.PessoaService;

@Service
public class PessoaServiceImpl implements PessoaService {

	@Override
	public String getById(Integer id) {
		// TODO Auto-generated method stub
		return "Pessoa - Service Impl - ID ==> " + id;
	}

}
