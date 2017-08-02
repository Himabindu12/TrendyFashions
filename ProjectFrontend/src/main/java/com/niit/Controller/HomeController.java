package com.niit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	@RequestMapping("/kids")
	public String kids()
	{
		return "kidspage";
	}

	@RequestMapping("/payment")
	public String payment()
	{
		return "payment";
	}
	@RequestMapping("/thankyou")
	public String thankyou()
	{
		return "thankyou";
	}
	@RequestMapping("/viewcart")
	public String viewcart()
	{
		return "viewcart";
	}
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
