package com.niit.TrendyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TrendyBackend.dao.SupplierDao;
import com.niit.TrendyBackend.model.Supplier;

public class SupplierTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		Supplier supplier= (Supplier)context.getBean("supplier");
		SupplierDao supplierDao= (SupplierDao)context.getBean("supplierDao");
		
		supplier.setSupplier_ID("s001");
		supplier.setSupplier_Name("kavya");
		supplier.setSupplier_Address("Tumkur");
		supplier.setSupplier_phoneNumber("9036778290");
				if(supplierDao.saveorupdate(supplier)==true)
		{
			System.out.println("Supplier is saved");
		}
		else
		{
			System.out.println("Supplier is not saved");
			
		}
		
				supplier.setSupplier_ID("s002");
				supplier.setSupplier_Name("utsav");
				supplier.setSupplier_Address("Banglore");
				supplier.setSupplier_phoneNumber("9036778291");
						if(supplierDao.saveorupdate(supplier)==true)
				{
					System.out.println("Supplier is saved");
				}
				else
				{
					System.out.println("Supplier is not saved");
				}
						Supplier s=supplierDao.getSupplier("s003");
						if(supplierDao.delete(s)==true)
						{
							System.out.println("supplier deleted");
						}
						else
							System.out.println("supplier not deleted");
					

						Supplier s1=supplierDao.getSupplier("s002");
						if(s1==null)
				{
					System.out.println("No items");
				}
						else
							System.out.println("Displaying Items");
						System.out.println(s1.getSupplier_ID());
						System.out.println(s1.getSupplier_Name());
						System.out.println(s1.getSupplier_Address());
						System.out.println(s1.getSupplier_phoneNumber());
						
					
							
				}

					


				}
	