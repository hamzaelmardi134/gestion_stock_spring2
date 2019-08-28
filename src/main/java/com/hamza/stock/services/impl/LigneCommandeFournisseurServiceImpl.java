package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.ILigneCommandeFournisseurDao;
import com.hamza.stock.entities.LigneCommandeFournisseur;
import com.hamza.stock.services.ILigneCommandeFournisseurService;


@Transactional
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService{
	
	private ILigneCommandeFournisseurDao dao;
	
	

	public void setDao(ILigneCommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur ligneCommandeFournisseur) {
		// TODO Auto-generated method stub
		return dao.save(ligneCommandeFournisseur);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur ligneCommandeFournisseur) {
		// TODO Auto-generated method stub
		return dao.update(ligneCommandeFournisseur);
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public LigneCommandeFournisseur getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
