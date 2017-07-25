package com.niit.TrendyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TrendyBackend.dao.CategoryDao;
import com.niit.TrendyBackend.model.Category;
public class CategoryTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		Category category= (Category)context.getBean("category");
		CategoryDao categoryDao= (CategoryDao)context.getBean("categoryDao");
		
		category.setCat_Id("c1");
		category.setCat_Name("Men");
		if(categoryDao.saveorupdate(category)==true)
		{
			System.out.println("Category is saved");
		}
		else
		{
			System.out.println("Category not saved");
			
		}
		
		category.setCat_Id("c2");
		category.setCat_Name("Women");
		
		if(categoryDao.saveorupdate(category)==true)
		{
			System.out.println("Category is saved");
		}
		else
		{
			System.out.println("Category not saved");
			
		}
		category.setCat_Id("c3");
		category.setCat_Name("Kids");
		
		if(categoryDao.saveorupdate(category)==true)
		{
			System.out.println("Category is saved");
		}
		else
		{
			System.out.println("Category not saved");
			
		}
		Category c=categoryDao.getCategory("c3");
 if(categoryDao.delete(c)==true)
		{
			System.out.println("category deleted");
		}
		else
			System.out.println("category not deleted");
	

		Category c1=categoryDao.getCategory("c2");
		if(c1==null)
{
	System.out.println("No items");
}
		else
			System.out.println("Displaying Items");
		System.out.println(c1.getCat_Id());
		System.out.println(c1.getCat_Name());
	
		
	
			
}
	}
