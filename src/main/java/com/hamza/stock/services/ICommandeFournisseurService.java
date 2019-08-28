package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.CommandeFournisseur;

public interface ICommandeFournisseurService {
	
	
	public CommandeFournisseur save(CommandeFournisseur commandeFournisseur);
	
	public CommandeFournisseur update(CommandeFournisseur commandeFournisseur);
	
	public List<CommandeFournisseur> selectAll();
	
	public List<CommandeFournisseur> selectAll(String sortField,String sort);
	
	public CommandeFournisseur getById(Long id);
	
	public void remove(Long id);
	
	public CommandeFournisseur findOne(String paramName,Object paramValue);
	
	public CommandeFournisseur findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
