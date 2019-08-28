package com.hamza.stock.services;

import java.util.List;

import com.hamza.stock.entities.Client;

public interface IClientService {
	
	public Client save(Client client);
	
	public Client update(Client client);
	
	public List<Client> selectAll();
	
	public List<Client> selectAll(String sortField,String sort);
	
	public Client getById(Long id);
	
	public void remove(Long id);
	
	public Client findOne(String paramName,Object paramValue);
	
	public Client findOne(String[] paramNames,Object[] paramValues);
	
	public int findCountBy(String paramName,String paramValue);

}
