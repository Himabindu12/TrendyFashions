package com.niit.TrendyBackend.dao;

import com.niit.TrendyBackend.model.Supplier;

public interface SupplierDao {
		public boolean saveorupdate(Supplier supplier);
		public boolean delete(Supplier supplier );
		public Supplier getSupplier(String supplierId );
		
}
