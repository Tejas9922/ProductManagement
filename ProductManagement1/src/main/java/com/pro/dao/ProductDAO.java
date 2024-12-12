package com.pro.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pro.entity.Product;

@Repository
public class ProductDAO {

	@Autowired
	SessionFactory sf;

	public String addProduct1(Product product) {
		try {
			Session ss = sf.openSession();
			Transaction tx = ss.beginTransaction();

			ss.save(product);
			tx.commit();

			String msg = "Data added successfully";
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			String msg = "Something wents wrong";
			return msg;
		}

	}

	public List<Product> displayProduct() {
		List<Product> list = null;

		try {
			Session ss = sf.openSession();
			list = ss.createCriteria(Product.class).list();

			String msg = "Data displayed successfully";
			System.out.println(msg);

			return list;
		} catch (Exception e) {
			e.printStackTrace();
			String msg = "Something wents wrong";
			System.out.println(msg);
			return list;
		}

	}

	public String deleteProduct(int id) {
		try {
			Session ss = sf.openSession();
			Transaction tx = ss.beginTransaction();

			Product product = ss.get(Product.class, id);

			if (product != null) {
				ss.delete(product);
			}
			ss.getTransaction().commit();
			String msg = "Data deleted Successfully";
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			String msg = "Something wents wrong";
			return msg;
		}

	}

	
	public Product getProduct(int id) {
		Product product=null;
		try {
			Session ss = sf.openSession();
			 product = ss.get(Product.class, id);
			
			return product;
		}catch(Exception e) {
			e.printStackTrace();
			return product;
		}
		
	}
	
public String updateProduct(Product product) {
		
		
		try {
			Session ss = sf.openSession();
			Transaction tx = ss.beginTransaction();
			
			ss.saveOrUpdate(product);
			
			tx.commit();
			String msg = "Data updated Successfully";
			return msg;
		}catch(Exception e) {
			e.printStackTrace();
			String msg = "Something wents wrong";
			return msg;
		}
		
	}

}
