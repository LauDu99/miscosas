package com.laura.spring.springorm.product.dao.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.laura.spring.springorm.product.dao.ProductDao;
import com.laura.spring.springorm.product.entity.Product;

import jakarta.transaction.Transactional;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {

	@Autowired
	HibernateTemplate hibernateTemplate;
	@Override
	@Transactional
	public int create(Product product) {
		Integer save = (Integer) hibernateTemplate.save(product);
		return save;
	}

}
