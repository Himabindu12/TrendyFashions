//package com.niit.TrendyBackend.daoimpl;
//
//import java.util.List;
//
//import org.hibernate.Query;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.niit.TrendyBackend.dao.BillingDao;
//import com.niit.TrendyBackend.model.Billing;
//
//@Repository("billingDao")
//@EnableTransactionManagement
//@Transactional
//public class BillingDaoimpl implements BillingDao {
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	public BillingDaoimpl(SessionFactory sessionFactory)
//	{
//		this.sessionFactory=sessionFactory;
//	}
//	
//	@Override
//	public boolean saveorupdate(Billing billing) {
//		sessionFactory.getCurrentSession().saveOrUpdate(billing);
//		return true;
//	}
//	@Override
//	public boolean delete(Billing billing) {
//		sessionFactory.getCurrentSession().delete(billing);
//		return true;
//	}
//
//	@Override
//	public Billing getBilling(String billingId) {
//		String m="from Billing where billingId='"+billingId+"'";
//		Query w = sessionFactory.getCurrentSession().createQuery(m);
//		List<Billing> list=(List<Billing>)w.list();
//		if(list==null||list.isEmpty())
//		{
//			return null;
//		}
//		return list.get(0);
//	}
//
//}
//
