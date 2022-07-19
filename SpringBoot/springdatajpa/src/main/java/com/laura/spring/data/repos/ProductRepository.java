package com.laura.spring.data.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.laura.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	//busca por dos caracteristicas usando el And
	List<Product> findByNameAndPrice(String name, Double price);
}
