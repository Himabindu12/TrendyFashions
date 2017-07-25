package com.niit.TrendyBackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TrendyBackend.dao.ProductDao;
import com.niit.TrendyBackend.model.Product;

@Repository("productDao")
@EnableTransactionManagement
@Transactional
public class ProductDaoimpl implements ProductDao{
	
	@Autowired 
	SessionFactory sessionFactory;
	
	public ProductDaoimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	

	@Override
	public boolean saveorupdate(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	@Override
	public boolean delete(Product product) {
		sessionFactory.getCurrentSession().delete(product);
		return true;
	}

	@Override
	public Product getProduct(String productId) {
		String p="from Product where Product_Id='"+productId+"'";
		Query s= sessionFactory.getCurrentSession().createQuery(p);
		List<Product> list=(List<Product>)s.list();
		if(list==null||list.isEmpty())
		{
		return null;
	}
return list.get(0);
	}
}
