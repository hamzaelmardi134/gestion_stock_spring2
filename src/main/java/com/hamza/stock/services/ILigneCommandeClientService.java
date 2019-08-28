package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
	
	
	public LigneCommandeClient save(LigneCommandeClient ligneCommandeClient);
	
	public LigneCommandeClient update(LigneCommandeClient ligneCommandeClient);
	
	public List<LigneCommandeClient> selectAll();
	
	public List<LigneCommandeClient> selectAll(String sortField,String sort);
	
	public LigneCommandeClient getById(Long id);
	
	public void remove(Long id);
	
	public LigneCommandeClient findOne(String paramName,Object paramValue);
	
	public LigneCommandeClient findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
