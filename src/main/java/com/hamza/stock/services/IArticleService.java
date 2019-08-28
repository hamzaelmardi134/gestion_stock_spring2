package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.Article;

public interface IArticleService {
	
	
	public Article save(Article article);
	
	public Article update(Article article);
	
	public List<Article> selectAll();
	
	public List<Article> selectAll(String sortField,String sort);
	
	public Article getById(Long id);
	
	public void remove(Long id);
	
	public Article findOne(String paramName,Object paramValue);
	
	public Article findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
