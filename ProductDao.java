package com.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.example.model.Product;

public class ProductDao {

	public int insert(Product p) {
		int i=0;
		Session session=Dao.getSessionFactory().openSession();
		session.save(p);
		session.beginTransaction().commit();
		session.close();
		i=1;
		return i;
	}
	
	public List<Product> fetchByCategory(String category){
		Session session=Dao.getSessionFactory().openSession();
		Criteria cr=session.createCriteria(Product.class);
		Criterion c1=Restrictions.eq("category", category);
		cr.add(c1);
		return cr.list();

	}
	
}
