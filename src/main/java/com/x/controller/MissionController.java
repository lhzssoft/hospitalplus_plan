package com.x.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.x.model.MissionModel;
import com.x.service.MissionService;


@RestController
public class MissionController 
{
	
	@Autowired
	private MissionService missionservice ;
	
	@RequestMapping(value="/mission", method=RequestMethod.GET)
	public Iterable<MissionModel> find()
	{
		return   this.missionservice.findAll() ;
	}
	
	@RequestMapping(value="/mission/{id}", method=RequestMethod.PUT)
	public MissionModel update( @PathVariable String id ,@RequestParam Integer period)
	{
	
		return   this.missionservice.update( id, period) ;
	}
 
}
