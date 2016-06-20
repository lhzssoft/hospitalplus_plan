package com.x.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.x.model.MissionModel;
import com.x.repository.MissionRepository;


@Service
public class MissionService
{
	@Autowired
	private MissionRepository missionrepository ;
	
	
	public  Object  save ( MissionModel  model)
	{
		return   this.missionrepository.save( model) ;
	}
	
	public Iterable<MissionModel> findAll() 
	{
		return this.missionrepository.findAll() ;
		
	}
	
	public  MissionModel update( String id ,Integer period)
	{
		MissionModel bean = this.missionrepository.findOne(id) ;
		bean.setPeriod(period);
		
		return  (MissionModel) this.save(bean) ;
	}
	
}
