package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.ICategorieDao;
import com.hamza.stock.entities.Categorie;
import com.hamza.stock.services.ICategorieService;


@Transactional
public class CategorieServiceImpl implements ICategorieService{
	
	private ICategorieDao dao;
	
	

	public void setDao(ICategorieDao dao) {
		this.dao = dao;
	}

	@Override
	public Categorie save(Categorie categorie) {
		// TODO Auto-generated method stub
		return dao.save(categorie);
	}

	@Override
	public Categorie update(Categorie categorie) {
		// TODO Auto-generated method stub
		return dao.update(categorie);
	}

	@Override
	public List<Categorie> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<Categorie> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Categorie getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public Categorie findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Categorie findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
