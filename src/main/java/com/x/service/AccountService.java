package com.x.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.model.AccountModel;
import com.x.repository.AccountRepository;


@Service
public class AccountService
{
	@Autowired
	private AccountRepository accountrepository ;
	
	
	public  Object  save ( AccountModel  model)
	{
		return   this.accountrepository.save( model) ;
	}
	
	public Iterable<AccountModel> findAll() 
	{
		return this.accountrepository.findAll() ;
		
	}
	
	
}
