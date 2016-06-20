package com.x.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.x.model.AccountModel;

@Transactional
public interface AccountRepository extends CrudRepository<AccountModel, Serializable> 
{
	
//	public <T> T  save ( AccountModel  model) ; 
}