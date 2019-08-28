package com.hamza.stock.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.hamza.stock.dao.IMouvementStockDao;
import com.hamza.stock.entities.MouvementStock;
import com.hamza.stock.services.IMouvementStockService;


@Transactional
public class MouvementStockServiceImpl implements IMouvementStockService{
	
	private IMouvementStockDao dao;
	
	

	public void setDao(IMouvementStockDao dao) {
		this.dao = dao;
	}

	@Override
	public MouvementStock save(MouvementStock mouvementStock) {
		// TODO Auto-generated method stub
		return dao.save(mouvementStock);
	}

	@Override
	public MouvementStock update(MouvementStock mouvementStock) {
		// TODO Auto-generated method stub
		return dao.update(mouvementStock);
	}

	@Override
	public List<MouvementStock> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<MouvementStock> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortField, sort);
	}

	@Override
	public MouvementStock getById(Long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
		
	}

	@Override
	public MouvementStock findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MouvementStock findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramName, paramValue);
	}
	
	

}
