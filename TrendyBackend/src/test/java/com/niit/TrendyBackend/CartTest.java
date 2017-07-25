//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.TrendyBackend.dao.CartDao;
//import com.niit.TrendyBackend.model.Cart;
//
//public class CartTest {
//
//public static void main(String[] args) {
//		
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		
//		Cart cart= (Cart)context.getBean("cart");
//		CartDao cartDao= (CartDao)context.getBean("cartDao");
//		
//		cart.setCart_Id("r1");
//		cart.setGrand_total(3);
//		cart.setTotal_item(3);
//		if(cartDao.saveorupdate(cart)==true)
//		{
//			System.out.println("Cart is saved");
//		}
//		else
//		{
//			System.out.println("Cart not saved");
//			
//		}
//		
//		cart.setCart_Id("r2");
//		cart.setGrand_total(4);
//		cart.setTotal_item(4);
//		
//		if(cartDao.saveorupdate(cart)==true)
//		{
//			System.out.println("Cart is saved");
//		}
//		else
//		{
//			System.out.println("Cart not saved");
//			
//		}
//		cart.setCart_Id("r3");
//		cart.setGrand_total(5);
//		cart.setTotal_item(5);
//		
//		if(cartDao.saveorupdate(cart)==true)
//		{
//			System.out.println("Cart is saved");
//		}
//		else
//		{
//			System.out.println("Cart not saved");
//			
//		}
//		Cart c=cartDao.getCart("r3");
// if(cartDao.delete(c)==true)
//		{
//			System.out.println("cart deleted");
//		}
//		else
//			System.out.println("cart not deleted");
//	
//
//		Cart r1=cartDao.getCart("r2");
//		if(r1==null)
//{
//	System.out.println("No items");
//}
//		else
//			System.out.println("Displaying Items");
//		System.out.println(r1.getCart_Id());
//		System.out.println(r1.getGrand_total());
//		System.out.println(r1.getTotal_item());
//	
//		
//	
//			
//}
//
//}
