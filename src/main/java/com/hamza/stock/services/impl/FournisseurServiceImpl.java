package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.IFournisseurDao;
import com.hamza.stock.entities.Fournisseur;
import com.hamza.stock.services.IFournisseurService;


@Transactional
public class FournisseurServiceImpl implements IFournisseurService{
	
	private IFournisseurDao dao;
	
	

	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournisseur save(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		return dao.save(fournisseur);
	}

	@Override
	public Fournisseur update(Fournisseur fournisseur) {
		// TODO Auto-generated method stub
		return dao.update(fournisseur);
	}

	@Override
	public List<Fournisseur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<Fournisseur> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public Fournisseur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public Fournisseur findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Fournisseur findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
