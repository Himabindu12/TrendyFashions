//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.TrendyBackend.dao.ShippingDao;
//import com.niit.TrendyBackend.model.Shipping;
//public class ShippingTest {
//
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		
//		Shipping shipping= (Shipping)context.getBean("shipping");
//		ShippingDao shippingDao= (ShippingDao)context.getBean("shippingDao");
//		
//		shipping.setShiping_ID("h001");
//		shipping.setHouse_Number("243");
//		shipping.setCity_Name("tiptur");
//		shipping.setCountry_Name("India");
//		shipping.setPinCode("515110");
//		shipping.setFirstName("Arun");
//		shipping.setLastName("Reddy");
//		
//				if(shippingDao.saveorupdate(shipping)==true)
//		{
//			System.out.println("Shipping address is saved");
//		}
//		else
//		{
//			System.out.println("Shipping address is not saved");
//			
//		}
//		
//
//				shipping.setShiping_ID("h002");
//				shipping.setHouse_Number("244");
//				shipping.setCity_Name("hassan");
//				shipping.setCountry_Name("Bali");
//				shipping.setPinCode("515112");
//				shipping.setFirstName("vinay");
//				shipping.setLastName("kumar");
//				
//						if(shippingDao.saveorupdate(shipping)==true)
//				{
//					System.out.println("Shipping address is saved");
//				}
//				else
//				{
//					System.out.println("Shipping address is not saved");
//					
//				}
//						Shipping h=shippingDao.getShipping("h003");
//						if(shippingDao.delete(h)==true)
//						{
//							System.out.println("shipping address deleted");
//						}
//						else
//							System.out.println("shipping address not deleted");
//					
//
//						Shipping h1=shippingDao.getShipping("h002");
//						if(h1==null)
//				{
//					System.out.println("No items");
//				}
//						else
//							System.out.println("Displaying Items");
//						System.out.println(h1.getShiping_ID());
//						System.out.println(h1.getFirstName());
//						System.out.println(h1.getLastName());
//						System.out.println(h1.getHouse_Number());
//						System.out.println(h1.getCity_Name());
//						System.out.println(h1.getCountry_Name());
//						
//						
//					
//							
//				}
//
//					
//
//
//	}
//
