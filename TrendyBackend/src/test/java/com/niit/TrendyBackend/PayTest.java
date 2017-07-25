//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.TrendyBackend.dao.CardDao;
//import com.niit.TrendyBackend.dao.PayDao;
//import com.niit.TrendyBackend.model.Card;
//import com.niit.TrendyBackend.model.Pay;
//
//public class PayTest {
//public static void main(String[] args) {
//		
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		
//		Pay pay= (Pay)context.getBean("pay");
//		PayDao payDao= (PayDao)context.getBean("payDao");
//		pay.setPayment_Id("h1");
//		pay.setPayment_method("Cod");
//		pay.setStatus("pending");
//		if(payDao.saveorupdate(pay)==true)
//		{
//			System.out.println("Payment is saved");
//		}
//		else
//		{
//			System.out.println("Payment not saved");
//			
//		}
//		pay.setPayment_Id("h2");
//		pay.setPayment_method("Card");
//		pay.setStatus("Paid");
//		if(payDao.saveorupdate(pay)==true)
//		{
//			System.out.println("Payment is saved");
//		}
//		else
//		{
//			System.out.println("Payment not saved");
//			
//		}
//		pay.setPayment_Id("h3");
//		pay.setPayment_method("Cod");
//		pay.setStatus("pending");
//		if(payDao.saveorupdate(pay)==true)
//		{
//			System.out.println("Payment is saved");
//		}
//		else
//		{
//			System.out.println("Payment not saved");
//			
//		}
//		 pay=payDao.getCart("h1");
//		 if(payDao.delete(pay)==true)
//				{
//					System.out.println("payment deleted");
//				}
//				else
//					System.out.println("payment not deleted");
//
//pay=payDao.getCart("h2");
//if(pay==null)
//{
//System.out.println("No items");
//}
//else
//	System.out.println("Displaying Items");
//System.out.println(pay.getPayment_Id());
//
//System.out.println(pay.getPayment_method());	
//}
//
//
//
//
//}
//
//
