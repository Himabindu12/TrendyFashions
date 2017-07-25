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
//import com.niit.TrendyBackend.dao.PayDao;
//import com.niit.TrendyBackend.model.Pay;
//@Repository("payDao")
//@EnableTransactionManagement
//@Transactional
//public class PayDaoimpl implements PayDao{
//
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	public PayDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//	@Override
//	public boolean saveorupdate(Pay pay) {
//		sessionFactory.getCurrentSession().saveOrUpdate(pay);
//		return true;
//	}
//
//	@Override
//	public boolean delete(Pay pay) {
//		sessionFactory.getCurrentSession().delete(pay);
//		return true;
//	}
//
//	@Override
//	public Pay getCart(String Pay_Id) {
//		String t1="from Pay where pay_Id='"+Pay_Id+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(t1);
//		List<Pay> list=(List<Pay>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//
//	@Override
//	public List<Pay> list() {
//		List<Pay> pay= (List<Pay>)sessionFactory.getCurrentSession().createCriteria(Pay.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
//		return pay;
//	}
//}
