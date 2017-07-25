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
//import com.niit.TrendyBackend.dao.OrderDao;
//import com.niit.TrendyBackend.model.Order;
//@Repository("orderDao")
//@EnableTransactionManagement
//@Transactional
//public class OrderDaoimpl implements OrderDao{
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	public OrderDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//
//	@Override
//	public boolean saveorupdate(Order order) {
//		sessionFactory.getCurrentSession().saveOrUpdate(order);
//		return true;
//	}
//	@Override
//	public boolean delete(Order order) {
//		sessionFactory.getCurrentSession().delete(order);
//		return true;
//	}
//
//	@Override
//	public Order getOrder(String Order_Id) {
//		String f1="from Order where order_Id='"+Order_Id+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(f1);
//		List<Order> list=(List<Order>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//
//	@Override
//	public List<Order> list() {
//		List<Order> order= (List<Order>)sessionFactory.getCurrentSession().createCriteria(Order.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//		return order;
//	}
//}
