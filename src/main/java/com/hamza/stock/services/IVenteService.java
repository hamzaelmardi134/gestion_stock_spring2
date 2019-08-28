package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.Vente;

public interface IVenteService {
	
	
	public Vente save(Vente vente);
	
	public Vente update(Vente vente);
	
	public List<Vente> selectAll();
	
	public List<Vente> selectAll(String sortField,String sort);
	
	public Vente getById(Long id);
	
	public void remove(Long id);
	
	public Vente findOne(String paramName,Object paramValue);
	
	public Vente findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
