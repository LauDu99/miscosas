package com.laura.product.bo;

import com.laura.product.dao.ProductDAO;
import com.laura.product.dao.ProductDAOImpl;
import com.laura.product.dto.Product;

public class ProductBOImpl implements ProductBO {

	// es la manera en que ´puedes implementar los metodos de
	// crear y buscar, dao es la base e datos estatica en este caso
	private static ProductDAO dao = new ProductDAOImpl();

	@Override
	public void create(Product product) {
		dao.create(product);
	}

	@Override
	public Product findProduct(int id) {
		return dao.read(id);
	}

}
