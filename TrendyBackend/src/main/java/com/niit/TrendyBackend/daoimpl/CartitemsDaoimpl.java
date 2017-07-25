//package com.niit.TrendyBackend.daoimpl;
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
//import com.niit.TrendyBackend.dao.CartitemsDao;
//import com.niit.TrendyBackend.model.Cartitems;
//@Repository("cartitemsDao")
//@EnableTransactionManagement
//@Transactional
//public class CartitemsDaoimpl implements CartitemsDao{
//
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	public CartitemsDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//
//	@Override
//	public boolean saveorupdate(Cartitems cartitems) {
//		sessionFactory.getCurrentSession().saveOrUpdate(cartitems);
//		return true;
//	}
//
//	@Override
//	public boolean delete(Cartitems cartitems) {
//		sessionFactory.getCurrentSession().delete(cartitems);
//		return true;
//	}
//
//	@Override
//	public Cartitems getCartitems(String CarId) {
//		String d1="from Cartitems where car_Id='"+CarId+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(d1);
//		List<Cartitems> list=(List<Cartitems>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//	@Override
//	public List<Cartitems> list() {
//		List<Cartitems> cartitems= (List<Cartitems>)sessionFactory.getCurrentSession().createCriteria(Cartitems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//		return cartitems;
//	}
//
//}
