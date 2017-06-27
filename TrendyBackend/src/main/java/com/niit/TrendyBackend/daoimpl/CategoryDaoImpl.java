package com.niit.TrendyBackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TrendyBackend.dao.CategoryDao;
import com.niit.TrendyBackend.model.Category;

@Repository("categoryDao")
@EnableTransactionManagement
@Transactional
public class CategoryDaoImpl implements CategoryDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public CategoryDaoImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Override
	public boolean saveorupdate(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		return true;
	}

	@Override
	public boolean delete(Category category) {
		sessionFactory.getCurrentSession().delete(category);
		return false;
	}

	@Override
	public Category getCategory(String catId) {
		String q1="from Category where catId='"+catId+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		List<Category> list=(List<Category>)w.list();
		if(list==null||list.isEmpty())
		{
			return null;
		}
		return list.get(0);
	}

}
