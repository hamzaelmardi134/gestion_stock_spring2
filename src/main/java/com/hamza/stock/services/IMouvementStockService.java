package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.MouvementStock;

public interface IMouvementStockService {
	
	
	public MouvementStock save(MouvementStock mouvementStock);
	
	public MouvementStock update(MouvementStock mouvementStock);
	
	public List<MouvementStock> selectAll();
	
	public List<MouvementStock> selectAll(String sortField,String sort);
	
	public MouvementStock getById(Long id);
	
	public void remove(Long id);
	
	public MouvementStock findOne(String paramName,Object paramValue);
	
	public MouvementStock findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
