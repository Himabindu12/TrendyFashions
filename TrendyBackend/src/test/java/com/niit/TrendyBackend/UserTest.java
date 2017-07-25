package com.niit.TrendyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TrendyBackend.dao.UserDao;
import com.niit.TrendyBackend.model.User;

public class UserTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		User user= (User)context.getBean("user");
		UserDao userDao= (UserDao)context.getBean("userDao");
		
		user.setUser_ID("u001");
		user.setUser_Name("Ruthu");
		user.setUser_Gender("Female");
		user.setUser_PhoneNumber("9067234589");
		user.setUser_EMail("ruthureddy@yahoo.com");
		user.setUser_Password("1234");
		
		
				if(userDao.saveorupdate(user)==true)
		{
			System.out.println("User is saved");
		}
		else
		{
			System.out.println("User is not saved");
			
		}
		
				user.setUser_ID("u002");
				user.setUser_Name("Tharushi");
				user.setUser_Gender("Female");
				user.setUser_PhoneNumber("9067234587");
				user.setUser_EMail("tharushireddy@yahoo.com");
				user.setUser_Password("123");
				
				
						if(userDao.saveorupdate(user)==true)
				{
					System.out.println("User is saved");
				}
				else
				{
					System.out.println("User is not saved");
					
				}
						
						user.setUser_ID("u003");
						user.setUser_Name("abc");
						user.setUser_Gender("Female");
						user.setUser_PhoneNumber("807634587");
						user.setUser_EMail("abc@yahoo.com");
						user.setUser_Password("12345");
						
						
								if(userDao.saveorupdate(user)==true)
						{
							System.out.println("User is saved");
						}
						else
						{
							System.out.println("User is not saved");
							
						}
								
			User u=userDao.getUser("u003");
			if(userDao.delete(u)==true)
			{
				System.out.println("User deleted");
			}
			else
				System.out.println("User not deleted");
		
	
			User u1=userDao.getUser("u002");
			if(u1==null)
	{
		System.out.println("No items");
	}
			else
				System.out.println("Displaying Items");
			System.out.println(u1.getUser_ID());
			System.out.println(u1.getUser_EMail());
			System.out.println(u1.getUser_Name());
			System.out.println(u1.getUser_Gender());
			
		
				
	}
	
	}

	

