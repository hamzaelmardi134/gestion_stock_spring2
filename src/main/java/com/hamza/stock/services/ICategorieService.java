package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.Categorie;

public interface ICategorieService {
	
	public Categorie save(Categorie categorie);
	
	public Categorie update(Categorie categorie);
	
	public List<Categorie> selectAll();
	
	public List<Categorie> selectAll(String sortField,String sort);
	
	public Categorie getById(Long id);
	
	public void remove(Long id);
	
	public Categorie findOne(String paramName,Object paramValue);
	
	public Categorie findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);

}
