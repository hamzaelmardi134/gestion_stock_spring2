package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.CommandeClient;
import com.hamza.stock.entities.CommandeClient;

public interface ICommandeClientService {
	
	
	public CommandeClient save(CommandeClient commandeClient);
	
	public CommandeClient update(CommandeClient commandeClient);
	
	public List<CommandeClient> selectAll();
	
	public List<CommandeClient> selectAll(String sortField,String sort);
	
	public CommandeClient getById(Long id);
	
	public void remove(Long id);
	
	public CommandeClient findOne(String paramName,Object paramValue);
	
	public CommandeClient findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);
	
	

}
