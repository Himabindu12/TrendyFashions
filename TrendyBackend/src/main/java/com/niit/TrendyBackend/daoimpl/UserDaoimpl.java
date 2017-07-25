package com.niit.TrendyBackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TrendyBackend.dao.UserDao;
import com.niit.TrendyBackend.model.User;
@Repository("userDao")
@EnableTransactionManagement
@Transactional
public class UserDaoimpl implements UserDao {
	@Autowired
	SessionFactory sessionFactory;
	public UserDaoimpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Override
	public boolean saveorupdate(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
	}

	@Override
	public boolean delete(User user) {
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}
	@Override
	public User getUser(String userId) {
		String b="from User where User_ID='"+userId+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(b);
		List<User> list=(List<User>)w.list();
		if(list==null||list.isEmpty())
		{
			return null;
		}
		return list.get(0);
	}
}



		