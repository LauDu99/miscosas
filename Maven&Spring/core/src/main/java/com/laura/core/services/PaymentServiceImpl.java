package com.laura.core.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laura.core.dao.PaymentDAO;

@Service
public class PaymentServiceImpl implements PaymentService {

	//le dice a spring que esta dependencia debe ser inyectada automaticamente
	//at runtime
	@Autowired
	private PaymentDAO dao;

	public PaymentDAO getDao() {
		return dao;
	}

	public void setDao(PaymentDAO dao) {
		this.dao = dao;
	}
}
