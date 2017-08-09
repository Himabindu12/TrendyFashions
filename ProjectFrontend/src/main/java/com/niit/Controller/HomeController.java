package com.niit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.ProductDao;
import com.niit.model.Product;

@Controller
public class HomeController {

	@Autowired
	Product product;
	@Autowired
	ProductDao productDao;
	
	@RequestMapping("/")
	public ModelAndView productform() 
	{
		List<Product> listproduct=productDao.list();
		ModelAndView obj = new ModelAndView("home");
		obj.addObject("product", new Product());
		obj.addObject("prods",listproduct);		
		return obj;
	}
	
	@RequestMapping("/kids")
	public String kids()
	{
		return "kidspage";
	}

	
	@RequestMapping("/thankyou")
	public String thankyou()
	{
		return "thankyou";
	}
//	@RequestMapping("/viewcart")
//	public String viewcart()
//	{
//		return "viewcart";
//	}
	@RequestMapping("/orderconfirm")
	public String orderconfirm()
	{
		return "orderconfirm";
	}
	@RequestMapping("/women")
	public String women()
	{
		return "women";
	}
	@RequestMapping("/men")
	public String men()
	{
		return "men";
	}
	
	

}
