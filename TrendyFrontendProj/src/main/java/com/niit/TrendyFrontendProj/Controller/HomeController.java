package com.niit.TrendyFrontendProj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/aboutus")
	public String about()
	{
		return "aboutus";
	}
	

	@RequestMapping("/contactus")
	public String contact()
	{
		return "contactus";
	}
	

	@RequestMapping("/signup")
	public String signup()
	{
		return "signup";
	}
	
	@RequestMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/logout")
	public String logout()
	{
		return "logout";
	}
	
//	@RequestMapping("/addcategory")
//	public String addcategory()
//	{
//		return "addcategory";
//	}
	
	@RequestMapping("/addsupplier")
	public String addsupplier()
	{
		return "addsupplier";
	}
	
	@RequestMapping("/addproduct")
	public String addproduct()
	{
		return "addproduct";
	}

	@RequestMapping("/men")
	public String menpage()
	{
		return "menpage";
	}

	@RequestMapping("/women")
	public String womenpage()
	{
		return "womenpage";
	}

	@RequestMapping("/kids")
	public String kidspage()
	{
		return "kidspage";
	}
}
