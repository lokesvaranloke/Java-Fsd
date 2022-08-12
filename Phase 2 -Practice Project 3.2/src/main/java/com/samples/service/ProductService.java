package com.samples.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.samples.domain.Product;
import com.samples.utils.hibernateutil;

public class ProductService {

	public void addbook(Product product) {

		
		Session session = hibernateutil.getSessionFacatory().openSession();

		Transaction tn = session.getTransaction();

		try {

			tn.begin();
			
			session.save(product);
			
			tn.commit();

		} catch (Exception ex) {
			if (tn != null) {
				tn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
	}

	public List<Product> getProducts() {
		
		List<Product> products=null;

		Session session = hibernateutil.getSessionFacatory().openSession();

		Transaction tn = session.getTransaction();

		try {

			tn.begin();
			products = session.createQuery("from Product").list();
			tn.commit();

		} catch (Exception ex) {
			if (tn != null) {
				tn.rollback();
			}
			ex.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return products;
	}

}
