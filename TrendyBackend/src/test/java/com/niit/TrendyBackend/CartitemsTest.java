//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.TrendyBackend.dao.CartitemsDao;
//import com.niit.TrendyBackend.model.Cart;
//import com.niit.TrendyBackend.model.Cartitems;
//
//public class CartitemsTest {
//
//public static void main(String[] args) {
//		
//		
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		
//		Cartitems cartitems= (Cartitems)context.getBean("cartitems");
//		CartitemsDao cartitemsDao= (CartitemsDao)context.getBean("cartitemsDao");
//		cartitems.setCar_Id("p1");
//		cartitems.setPrice(300);
//		
//		if(cartitemsDao.saveorupdate(cartitems)==true)
//		{
//			System.out.println("Cartitems is saved");
//		}
//		else
//		{
//			System.out.println("Cartitems not saved");
//		}
//			cartitems.setCar_Id("p2");
//			cartitems.setPrice(400);
//		if(cartitemsDao.saveorupdate(cartitems)==true)
//		{
//			System.out.println("Cartitems is saved");
//		}
//		else
//		{
//			System.out.println("Cartitems not saved");
//			
//		}
//		cartitems.setCar_Id("p3");
//		cartitems.setPrice(500);
//	if(cartitemsDao.saveorupdate(cartitems)==true)
//	{
//		System.out.println("Cartitems is saved");
//	}
//	else
//	{
//		System.out.println("Cartitems not saved");
//		
//	}
//	 cartitems=cartitemsDao.getCartitems("p1");
//	 if(cartitemsDao.delete(cartitems)==true)
//			{
//				System.out.println("cart deleted");
//			}
//			else
//				System.out.println("cart not deleted");
//		
//
//	 cartitems=cartitemsDao.getCartitems("p2");
//			if(cartitems==null)
//	{
//		System.out.println("No items");
//	}
//			else
//				System.out.println("Displaying Items");
//			System.out.println(cartitems.getCar_Id());
//	
//			System.out.println(cartitems.getPrice());
//		
//			
//		
//				
//	}
//
//	}
//
//	