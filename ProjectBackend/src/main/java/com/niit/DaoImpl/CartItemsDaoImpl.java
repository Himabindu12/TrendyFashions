package com.niit.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import com.niit.Dao.CartItemsDao;
import com.niit.model.CartItems;

@Repository("cartitemsDao")
@EnableTransactionManagement
@Transactional
public class CartItemsDaoImpl implements CartItemsDao{

	@Autowired
	SessionFactory sessionFactory;

	public CartItemsDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	@Transactional
	public boolean saveorupdate(CartItems carit) 
	{
		sessionFactory.getCurrentSession().saveOrUpdate(carit);
		return true;
	}
	@Transactional
	public boolean delete(CartItems carit){
		sessionFactory.getCurrentSession().delete(carit);
		return true;
	}
	@Transactional
	public CartItems get(String crtid) {
		String k1 = "from CartItems where caritId='" + crtid + "'";
		Query w = sessionFactory.getCurrentSession().createQuery(k1);
		List<CartItems> list = (List<CartItems>) w.list();
		if (list == null || list.isEmpty()) 
		{
			return null;
		}
		   return list.get(0);
	   }
	
	@Transactional
	public List <CartItems> list(){
		List<CartItems> cartitms = (List<CartItems>) sessionFactory.getCurrentSession().createCriteria(CartItems.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return cartitms;
	}
		

}
