package com.pro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.dao.ProductDAO;
import com.pro.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDAO pd;

	public String addProduct1(Product product) {
		return pd.addProduct1(product);
		
	}

	public List<Product> displayProduct() {
		return pd.displayProduct();
	}

	public String deleteProduct(int id) {
		return pd.deleteProduct(id);
	}

	public String updateProduct(Product product) {
		return pd.updateProduct(product);
	}

	public Product getProduct(int id) {
		return pd.getProduct(id);
		
	}
	
	
}
