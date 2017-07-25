//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.TrendyBackend.dao.OrderitemsDao;
//import com.niit.TrendyBackend.model.Orderitems;
//
//public class OrderitemsTest {
//public static void main(String[] args) {
//		
//		
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		Orderitems orderitems= (Orderitems)context.getBean("orderitems");
//		OrderitemsDao orderitemsDao= (OrderitemsDao)context.getBean("orderitemsDao");
//		orderitems.setItem_Id("o1");
//		orderitems.setProduct_Id("0011");
//		if(orderitemsDao.saveorupdate(orderitems)==true)
//		{
//			System.out.println("Orderitems are saved");
//		}
//		else
//		{
//			System.out.println("Orderitems not saved");
//		}
//		orderitems.setItem_Id("o2");
//		orderitems.setProduct_Id("0022");
//		if(orderitemsDao.saveorupdate(orderitems)==true)
//		{
//			System.out.println("Orderitems are saved");
//		}
//		else
//		{
//			System.out.println("Orderitems not saved");
//		}
//		orderitems.setItem_Id("o3");
//		orderitems.setProduct_Id("0033");
//		if(orderitemsDao.saveorupdate(orderitems)==true)
//		{
//			System.out.println("Orderitems are saved");
//		}
//		else
//		{
//			System.out.println("Orderitems not saved");
//		}
//		orderitems=orderitemsDao.getOrderitems("o1");
//		 if(orderitemsDao.delete(orderitems)==true)
//				{
//					System.out.println("order deleted");
//				}
//				else
//					System.out.println("order not deleted");
//
//orderitems=orderitemsDao.getOrderitems("o2");
//if(orderitems==null)
//{
//System.out.println("No items");
//}
//else
//	System.out.println("Displaying Items");
//System.out.println(orderitems.getItem_Id());
//
//System.out.println(orderitems.getProduct_Id());	
//}
//
//}
//
//			
//
