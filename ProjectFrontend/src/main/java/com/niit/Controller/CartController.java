package com.niit.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.Dao.CartDao;
import com.niit.Dao.CartItemsDao;
import com.niit.Dao.ProductDao;
import com.niit.Dao.UserDao;
import com.niit.model.Cart;
import com.niit.model.CartItems;
import com.niit.model.Product;
import com.niit.model.User;

@Controller
public class CartController {
@Autowired
User user;
UserDao userDao;
@Autowired
Cart cart;
CartDao cartDao;
@Autowired
CartItems cartItems;
CartItemsDao cartItemsDao;
@Autowired
Product product;
ProductDao productDao;
@Autowired
HttpSession session;
@RequestMapping("/addtocart/{id}")
public ModelAndView cart(@PathVariable("id") String id) {

	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	if (!(authentication instanceof AnonymousAuthenticationToken)) {
		String currusername = authentication.getName();
		User u = userDao.getUseremail(currusername);
		if (user == null) {
			return new ModelAndView("redirect:/");
		} else {

			cart = u.getCart();
			product = productDao.get(id);
			CartItems cartItems = new CartItems();
			cartItems.setCart(cart);
			cartItems.setProduct(product);
			cartItems.setPrice(product.getPrice());
			cartItemsDao.saveorupdate(cartItems);
			cart.setGrandtotal(cart.getGrandtotal() + product.getPrice());
			cart.setTotalitem(cart.getTotalitem() + 1);
			cartDao.saveorupdate(cart);
			session.setAttribute("items", cart.getTotalitem());
			session.setAttribute("gd", cart.getGrandtotal());
			return new ModelAndView("redirect:/allproducts");
		}
	} else {
		return new ModelAndView("redirect:/");
	}

}



@RequestMapping(value = "/viewcart")
public String viewcart(Model model, HttpSession session) {
	System.out.println(1223);
	Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	if (!(authentication instanceof AnonymousAuthenticationToken)) {
		String currusername = authentication.getName();
		User u = userDao.getUseremail(currusername);
	        Cart c=u.getCart();
			List<CartItems> cartItem = cartItemsDao.getlist(u.getCart().getCartId());
			if(cartItem==null ||cartItem.isEmpty())
			{
				session.setAttribute("items",0);
				model.addAttribute("gtotal",0.0);
				model.addAttribute("msg", "no Items is added to cart");
				return "viewcart";		
			}
			model.addAttribute("cartItem", cartItem);
			model.addAttribute("gtotal",c.getGroand_total());
			session.setAttribute("items",c.getTotal_item());
		    session.setAttribute("cartId", c.getCart_id());
			return "viewcart";		
		
	}
	else
	{
		return "redirect:/";
	}
	
}
@RequestMapping(value="/Remove/{id}")
public String RemoveFromCart(@PathVariable("id") String id)
{
	cartItem=cartItemDao.getcartItem(id);
	Cart c=cartItem.getCart();
	c.setGroand_total(c.getGroand_total()-cartItem.getPrice());
	c.setTotal_item(c.getTotal_item()-1);
	cartDao.saveCart(c);
	cartItemDao.delete(cartItem.getCi_id());
	return "redirect:/viewcart";
}

@RequestMapping(value="/Removeall")
public String RemoveallFromCart(Model model,HttpSession session)
{
	Cart c=cartDao.getcart((String)session.getAttribute("cartId"));
	List<CartItem> cartItems=cartItemDao.getlist((String)session.getAttribute("cartId"));
	for(CartItem g:cartItems)
	{
	  cartItemDao.delete(g.getCi_id());
	}
	c.setGroand_total(0.0);
	c.setTotal_item(0);
	cartDao.saveCart(c);
	session.setAttribute("items",c.getTotal_item());
	return "redirect:/viewcart";
}

}

}
