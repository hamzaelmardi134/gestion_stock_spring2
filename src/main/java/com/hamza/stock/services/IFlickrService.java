package com.hamza.stock.services;

import java.io.InputStream;

public interface IFlickrService {
	
	public String savePhoto(InputStream stream,String fileName) throws Exception;

}
