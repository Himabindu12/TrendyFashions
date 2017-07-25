//package com.niit.TrendyBackend.daoimpl;
//
//import java.util.List;
//
//
//import org.hibernate.Criteria;
//import org.hibernate.Query;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.niit.TrendyBackend.dao.OrderitemsDao;
//import com.niit.TrendyBackend.model.Cart;
//import com.niit.TrendyBackend.model.Cartitems;
//import com.niit.TrendyBackend.model.Orderitems;
//@Repository("OrderitemsDao")
//@EnableTransactionManagement
//@Transactional
//
//public class OrderitemsDaoimpl implements OrderitemsDao{
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	public OrderitemsDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//
//	@Override
//	public boolean saveorupdate(Orderitems orderitems) {
//		sessionFactory.getCurrentSession().saveOrUpdate(orderitems);
//		return true;
//	}
//
//	@Override
//	public boolean delete(Orderitems orderitems) {
//		sessionFactory.getCurrentSession().delete(orderitems);
//		return true;
//	}
//
//	@Override
//	public Orderitems getOrderitems(String Orderitems_Id) {
//		String k1="from Orderitems where orderitems_Id='"+Orderitems_Id+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(k1);
//		List<Orderitems> list=(List<Orderitems>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//
//	@Override
//	public List<Orderitems> list() {
//		List<Orderitems> orderitems= (List<Orderitems>)sessionFactory.getCurrentSession().createCriteria(Orderitems.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//		return orderitems;
//	}
//
//	
//}
