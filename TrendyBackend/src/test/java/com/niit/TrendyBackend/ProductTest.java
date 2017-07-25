package com.niit.TrendyBackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.TrendyBackend.dao.CategoryDao;
import com.niit.TrendyBackend.dao.ProductDao;
import com.niit.TrendyBackend.dao.SupplierDao;
import com.niit.TrendyBackend.model.Category;
import com.niit.TrendyBackend.model.Product;
import com.niit.TrendyBackend.model.Supplier;

public class ProductTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		Product product= (Product)context.getBean("product");
		ProductDao productDao= (ProductDao)context.getBean("productDao");
		Category cat=(Category)context.getBean("category");
		CategoryDao categoryDao=(CategoryDao)context.getBean("categoryDao");
	Supplier sup = (Supplier)context.getBean("supplier");
	SupplierDao supplierDao = (SupplierDao)context.getBean("supplierDao");
		
		cat=categoryDao.getCategory("c1");
	    sup =supplierDao.getSupplier("s001");
		
		product.setProduct_Id("p100");
		product.setProduct_Name("jeans");
		product.setProduct_Price(100);
		product.setProduct_Quantity(100);
		product.setProduct_Description("Ladies fashionable jeans");
		product.setCategory(cat);
	    product.setSupplier(sup);
		if(productDao.saveorupdate(product)==true)
		{
			System.out.println("Product is saved");
		}
		else
		{
			System.out.println("Product is not saved");
			
		}
		
		cat=categoryDao.getCategory("c2");
		sup =supplierDao.getSupplier("s002");
		product.setProduct_Id("p2");
		product.setProduct_Name("tunics");
		product.setProduct_Price(900);
		product.setProduct_Quantity(1);
		product.setProduct_Description("Ladies tunics kurtas");
		product.setCategory(cat);
    	product.setSupplier(sup);
		if(productDao.saveorupdate(product)==true)
		{
			System.out.println("Product is saved");
		}
		else
		{
			System.out.println("Product is not saved");
			
		}
		Product p=productDao.getProduct("p3");
    	if(productDao.delete(p)==true)
		{
			System.out.println("product deleted");
		}
	 else
			System.out.println("Product not deleted");
	

		Product p1=productDao.getProduct("p2");
		if(p1==null)
{
	System.out.println("No items");
}
		else
			System.out.println("Displaying Items");
		System.out.println(p1.getProduct_Id());
		System.out.println(p1.getProduct_Name());
		System.out.println(p1.getProduct_Price());
		System.out.println(p1.getProduct_Description());
		
	
			
}

	}

