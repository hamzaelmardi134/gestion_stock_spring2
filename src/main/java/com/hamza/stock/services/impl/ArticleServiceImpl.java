package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.IArticleDao;
import com.hamza.stock.entities.Article;
import com.hamza.stock.services.IArticleService;


@Transactional
public class ArticleServiceImpl implements IArticleService{
	
	private IArticleDao dao;
	
	

	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article article) {
		// TODO Auto-generated method stub
		return dao.save(article);
	}

	@Override
	public Article update(Article article) {
		// TODO Auto-generated method stub
		return dao.update(article);
	}

	@Override
	public List<Article> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Article getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
