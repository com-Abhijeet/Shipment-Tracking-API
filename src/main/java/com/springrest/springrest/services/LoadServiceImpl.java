package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.Load;

@Service
public class LoadServiceImpl implements LoadService {
	
	@Autowired
	private LoadDao loadDao;
	
	public LoadServiceImpl() {
		
	}

	@Override
	public List<Load> getLoads() {
		return loadDao.findAll();
	}

	@Override
	public Load getLoad(Long loadId) {
		return loadDao.findById(loadId).get();

		
	}

	@Override
	public Load addLoad(Load load) {
		loadDao.save(load);
		return load;
	}

	@Override
	public Load updateLoad(Load load) {
		loadDao.save(load);
		
		return load;
	}

	@Override
	public void deleteLoad(Long loadId) {
	
		Load entity = loadDao.getReferenceById(loadId);
		loadDao.delete(entity);
	}

}
