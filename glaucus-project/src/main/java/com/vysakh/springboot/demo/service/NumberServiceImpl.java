package com.vysakh.springboot.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vysakh.springboot.demo.dao.NumberDAO;

@Service
public class NumberServiceImpl implements NumberService {
	
	private NumberDAO numberDAO;
	

	public NumberServiceImpl(NumberDAO numberDAO) {
		this.numberDAO = numberDAO;
	}

	@Transactional
	public void save() {
		// TODO Auto-generated method stub
		//numberDAO.save(theNumber);
		numberDAO.save();
	}

}
