package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {

	public List<Load> getLoads();

	public Load getLoad(Long loadId);

	public Load addLoad(Load load);
	
	public Load updateLoad(Load load);
	
	public void deleteLoad(Long loadId);
}
