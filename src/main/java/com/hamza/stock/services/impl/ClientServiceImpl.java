package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.IClientDao;
import com.hamza.stock.entities.Client;
import com.hamza.stock.services.IClientService;


@Transactional
public class ClientServiceImpl implements IClientService{
	
	private IClientDao dao;
	
	

	public void setDao(IClientDao dao) {
		this.dao = dao;
	}

	@Override
	public Client save(Client client) {
		// TODO Auto-generated method stub
		return dao.save(client);
	}

	@Override
	public Client update(Client client) {
		// TODO Auto-generated method stub
		return dao.update(client);
	}

	@Override
	public List<Client> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<Client> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Client getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public Client findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Client findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
