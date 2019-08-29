package com.hamza.stock.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

import com.flickr4java.flickr.FlickrException;
import com.hamza.stock.dao.impl.FlickrDaoImpl;

public class Test {

	public static void main(String[] args) throws IOException, FlickrException, ExecutionException, InterruptedException {
		
		
		FlickrDaoImpl flickrDaoImpl = new FlickrDaoImpl();
		
		//FlickrDaoImpl.auth();
		
		try {
			
			InputStream stream = new FileInputStream(new File("/Users/hamzaelmardi/Desktop/image.jpeg"));
			String url = flickrDaoImpl.savePhoto(stream, "myImage");
			System.out.println(url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
