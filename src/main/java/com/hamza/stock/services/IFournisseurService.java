package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.Fournisseur;

public interface IFournisseurService {
	
	
	public Fournisseur save(Fournisseur fournisseur);
	
	public Fournisseur update(Fournisseur fournisseur);
	
	public List<Fournisseur> selectAll();
	
	public List<Fournisseur> selectAll(String sortField,String sort);
	
	public Fournisseur getById(Long id);
	
	public void remove(Long id);
	
	public Fournisseur findOne(String paramName,Object paramValue);
	
	public Fournisseur findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
