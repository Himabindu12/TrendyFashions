//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import com.niit.TrendyBackend.dao.OrderDao;
//import com.niit.TrendyBackend.model.Order;
//
//public class OrderTest {
//public static void main(String[] args) {
//		
//		
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		Order order= (Order)context.getBean("order");
//		OrderDao orderDao= (OrderDao)context.getBean("orderDao");
//		order.setOrder_Id("t1");
//		order.setGrand_total(5);
//		if(orderDao.saveorupdate(order)==true)
//		{
//			System.out.println("Order is saved");
//		}
//		else
//		{
//			System.out.println("Order not saved");
//		}
//		
//		order.setOrder_Id("t2");
//		order.setGrand_total(6);
//		if(orderDao.saveorupdate(order)==true)
//		{
//			System.out.println("Order is saved");
//		}
//		else
//		{
//			System.out.println("Order not saved");
//		}
//		order.setOrder_Id("t3");
//		order.setGrand_total(8);
//		if(orderDao.saveorupdate(order)==true)
//		{
//			System.out.println("Order is saved");
//		}
//		else
//		{
//			System.out.println("Order not saved");
//		}
//		 order=orderDao.getOrder("t1");
//		 if(orderDao.delete(order)==true)
//				{
//					System.out.println("order deleted");
//				}
//				else
//					System.out.println("order not deleted");
//
//order=orderDao.getOrder("t2");
//if(order==null)
//{
//System.out.println("No items");
//}
//else
//	System.out.println("Displaying Items");
//System.out.println(order.getOrder_Id());
//
//System.out.println(order.getGrand_total());	
//}
//
//}
//
//			
