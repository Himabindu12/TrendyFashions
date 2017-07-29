package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.Dao.UserDao;
import com.niit.model.User;

@Repository("userDao")
@EnableTransactionManagement
@Transactional
public class UserDaoImpl implements UserDao{

	@Autowired
	SessionFactory sessionFactory;

	public UserDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public boolean saveorupdate(User user) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		return true;
	}
	@Transactional
	public boolean delete(User user){
		sessionFactory.getCurrentSession().delete(user);
		return true;
	}
	@Transactional
	public User get(String userid) {
		String p1 = "from User where userId='" + userid + "'";
		Query w = sessionFactory.getCurrentSession().createQuery(p1);
		List<User> list = (List<User>) w.list();
		if (list == null || list.isEmpty()) 
		{
			return null;
		}
		   return list.get(0);
	   }
	
	@Transactional
	public List <User> list(){
		List<User> users = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return users;

		
	}
	
}


