//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.TrendyBackend.dao.BillingDao;
//import com.niit.TrendyBackend.model.Billing;
//
//public class BillingTest {
//
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		
//		Billing billing= (Billing)context.getBean("billing");
//		BillingDao billingDao= (BillingDao)context.getBean("billingDao");
//		
//		billing.setBilling_ID("u001");
//		billing.setHouse_Number("357");
//		billing.setCountry_Name("India");
//		billing.setCity_Name("Tumkur");
//		billing.setEMail_ID("sonysavia@gmail.com");
//		billing.setPinCode("572104");
//		billing.setPhoneNumber("9987564320");
//		
//
//				if(billingDao.saveorupdate(billing)==true)
//		{
//			System.out.println("Billing is saved");
//		}
//		else
//		{
//			System.out.println("Billing is not saved");
//			
//		}
//		
//				billing.setBilling_ID("u002");
//				billing.setHouse_Number("358");
//				billing.setCountry_Name("Japan");
//				billing.setCity_Name("Tokyo");
//				billing.setEMail_ID("sonysamiya@gmail.com");
//				billing.setPinCode("572108");
//				billing.setPhoneNumber("9987564321");
//				
//				
//						if(billingDao.saveorupdate(billing)==true)
//				{
//					System.out.println("Billing is saved");
//				}
//				else
//				{
//					System.out.println("Billing is not saved");
//					
//				}
//	}
//						
//}					