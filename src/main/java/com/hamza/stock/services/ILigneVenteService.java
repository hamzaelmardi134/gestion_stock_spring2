package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.LigneVente;

public interface ILigneVenteService {
	
	
	public LigneVente save(LigneVente ligneVente);
	
	public LigneVente update(LigneVente ligneVente);
	
	public List<LigneVente> selectAll();
	
	public List<LigneVente> selectAll(String sortField,String sort);
	
	public LigneVente getById(Long id);
	
	public void remove(Long id);
	
	public LigneVente findOne(String paramName,Object paramValue);
	
	public LigneVente findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
