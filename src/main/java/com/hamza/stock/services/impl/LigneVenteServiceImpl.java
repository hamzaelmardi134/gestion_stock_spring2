package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.ILigneVenteDao;
import com.hamza.stock.entities.LigneVente;
import com.hamza.stock.services.ILigneVenteService;


@Transactional
public class LigneVenteServiceImpl implements ILigneVenteService{
	
	private ILigneVenteDao dao;
	
	

	public void setDao(ILigneVenteDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneVente save(LigneVente ligneVente) {
		// TODO Auto-generated method stub
		return dao.save(ligneVente);
	}

	@Override
	public LigneVente update(LigneVente ligneVente) {
		// TODO Auto-generated method stub
		return dao.update(ligneVente);
	}

	@Override
	public List<LigneVente> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<LigneVente> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneVente getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public LigneVente findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
