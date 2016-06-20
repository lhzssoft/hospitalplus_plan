package com.x.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.x.model.MissionModel;

@Transactional
public interface MissionRepository extends CrudRepository<MissionModel, Serializable> 
{
	
//	public <T> T  save ( AccountModel  model) ; 
}