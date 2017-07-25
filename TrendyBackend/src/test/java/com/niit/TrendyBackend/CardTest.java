//package com.niit.TrendyBackend;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import com.niit.TrendyBackend.dao.CardDao;
//import com.niit.TrendyBackend.model.Card;
//
//public class CardTest {
//public static void main(String[] args) {
//		
//		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
//		context.scan("com.niit.*");
//		context.refresh();
//		
//		Card card= (Card)context.getBean("card");
//		CardDao cardDao= (CardDao)context.getBean("cardDao");
//		card.setCard_Id("k1");
//		card.setCard_number("2222");
//		card.setCard_holdername("Rakul");
//		card.setCard_expirydate("2020");
//		if(cardDao.saveorupdate(card)==true)
//		{
//			System.out.println("Card is saved");
//		}
//		else
//		{
//			System.out.println("Card not saved");
//			
//		}
//		card.setCard_Id("k2");
//		card.setCard_number("2233");
//		card.setCard_holdername("Nakul");
//		card.setCard_expirydate("2030");
//		if(cardDao.saveorupdate(card)==true)
//		{
//			System.out.println("Card is saved");
//		}
//		else
//		{
//			System.out.println("Card not saved");
//			
//		}
//		card.setCard_Id("k3");
//		card.setCard_number("2233");
//		card.setCard_holdername("Nakul");
//		card.setCard_expirydate("2030");
//		if(cardDao.saveorupdate(card)==true)
//		{
//			System.out.println("Card is saved");
//		}
//		else
//		{
//			System.out.println("Card not saved");
//			
//		}
//		 card=cardDao.getCard("k1");
//		 if(cardDao.delete(card)==true)
//				{
//					System.out.println("card deleted");
//				}
//				else
//					System.out.println("card not deleted");
//
//card=cardDao.getCard("k2");
//if(card==null)
//{
//System.out.println("No items");
//}
//else
//	System.out.println("Displaying Items");
//System.out.println(card.getCard_Id());
//
//System.out.println(card.getCard_number());	
//System.out.println(card.getCard_holdername());
//System.out.println(card.getCard_expirydate());
//}
//
//}
//
