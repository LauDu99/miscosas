package com.laura.product.bo;

import com.laura.product.dto.Product;

public interface ProductBO {

	void create(Product product);
	Product findProduct(int id);
	
}
