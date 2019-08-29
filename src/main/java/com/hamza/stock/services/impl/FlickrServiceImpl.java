package com.hamza.stock.services.impl;

import java.io.InputStream;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.IFlickrDao;
import com.hamza.stock.services.IFlickrService;


@Transactional
public class FlickrServiceImpl implements IFlickrService{
	
	
	
	private IFlickrDao dao;
	
	

	public void setDao(IFlickrDao dao) {
		this.dao = dao;
	}



	@Override
	public String savePhoto(InputStream stream, String fileName) throws Exception {
		// TODO Auto-generated method stub
		return dao.savePhoto(stream, fileName);
	}
	
	
	
	

}
