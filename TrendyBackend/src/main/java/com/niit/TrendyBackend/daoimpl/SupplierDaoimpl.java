package com.niit.TrendyBackend.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.TrendyBackend.dao.SupplierDao;
import com.niit.TrendyBackend.model.Supplier;
	@Repository("supplierDao")
	@EnableTransactionManagement
	@Transactional
	public class SupplierDaoimpl implements SupplierDao{
 @Autowired
 SessionFactory sessionFactory;
 public SupplierDaoimpl(SessionFactory sessionFactory)
 {
	 this.sessionFactory=sessionFactory;
	 
 }
		@Override
		public boolean saveorupdate(Supplier supplier) {
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			return true;
		}

		@Override
		public boolean delete(Supplier supplier) {
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}

		
		public Supplier getSupplier(String supplierId) {
			String r="from Supplier where Supplier_ID='"+supplierId+"'";
			Query w = sessionFactory.getCurrentSession().createQuery(r);
			List<Supplier> list=(List<Supplier>)w.list();
			if(list==null||list.isEmpty())
			{
				return null;
			}
			return list.get(0);
		}
}
