//package com.niit.TrendyBackend.daoimpl;
//
//
//import java.util.List;
//
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.niit.TrendyBackend.dao.CartDao;
//import com.niit.TrendyBackend.model.Card;
//import com.niit.TrendyBackend.model.Cart;
//@Repository("cartDao")
//@EnableTransactionManagement
//@Transactional
//public class CartDaoimpl implements CartDao{
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	public CartDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//
//	@Override
//	public boolean saveorupdate(Cart cart) {
//		sessionFactory.getCurrentSession().saveOrUpdate(cart);
//		return true;
//	}
//
//
//	@Override
//	public boolean delete(Cart cart) {
//		sessionFactory.getCurrentSession().delete(cart);
//		return true;
//	}
//
//	@Override
//	public Cart getCart(String Cart_Id) {
//		String n1="from Cart where cart_Id='"+Cart_Id+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(n1);
//		List<Cart> list=(List<Cart>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//
//	@Override
//	public List<Cart> list() {
//		List<Cart> cart= (List<Cart>)sessionFactory.getCurrentSession().createCriteria(Cart.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//		return cart;
//	}
//
//}
