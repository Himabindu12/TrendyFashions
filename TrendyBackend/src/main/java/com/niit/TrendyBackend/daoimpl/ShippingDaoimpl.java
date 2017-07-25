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
//import com.niit.TrendyBackend.dao.ShippingDao;
//import com.niit.TrendyBackend.model.Cartitems;
//import com.niit.TrendyBackend.model.Category;
//import com.niit.TrendyBackend.model.Shipping;
//
//@Repository("shippingDao")
//@EnableTransactionManagement
//@Transactional
//public class ShippingDaoimpl implements ShippingDao {
//	@Autowired
//SessionFactory sessionFactory;
//	
//	public ShippingDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//	
//	@Override
//	public boolean saveorupdate(Shipping shipping) {
//		sessionFactory.getCurrentSession().saveOrUpdate(shipping);
//		return true;
//	}
//	@Override
//	public boolean delete(Shipping shipping) {
//		sessionFactory.getCurrentSession().delete(shipping);
//		return true;
//	}
//
//	@Override
//	public Shipping getShipping(String shippingId) {
//		String n="from Shipping where shippingId='"+shippingId+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(n);
//		List<Shipping> list=(List<Shipping>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//	@Override
//	public List<Shipping> list() {
//		List<Shipping> shipping= (List<Shipping>)sessionFactory.getCurrentSession().createCriteria(Shipping.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//		return shipping;
//	
//	}
//}
//
//
