package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.ICommandeFournisseurDao;
import com.hamza.stock.entities.CommandeFournisseur;
import com.hamza.stock.services.ICommandeFournisseurService;


@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService{
	
	private ICommandeFournisseurDao dao;
	
	

	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public CommandeFournisseur save(CommandeFournisseur commandeFournisseur) {
		// TODO Auto-generated method stub
		return dao.save(commandeFournisseur);
	}

	@Override
	public CommandeFournisseur update(CommandeFournisseur commandeFournisseur) {
		// TODO Auto-generated method stub
		return dao.update(commandeFournisseur);
	}

	@Override
	public List<CommandeFournisseur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<CommandeFournisseur> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public CommandeFournisseur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public CommandeFournisseur findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
