package com.pms.deloitte.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.pms.deloitte.dao.ProductDAO;
import com.pms.deloitte.model.Product;

@Controller
public class ProductController {
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("/getProduct/{pId}")
	public String getProduct(@PathVariable("pId")Integer productId) {
		
		productDAO.findById(productId);
		return "Getting Product";
	}

	@RequestMapping("/deleteProduct/{pId}")
	public String deleteProduct(@PathVariable("pId")Integer productId) {
		
		productDAO.deleteById(productId);
		return "Deleted Product";
	}
	
	@RequestMapping("/saveProduct")
	public String saveProduct() {
		
		Product product = new Product(1, "Mouse", 630, 500);
		productDAO.save(product);
		return "Saving Product";
	}

	@RequestMapping("/betweenPrice/{p1}/{p2}")
	public String betweenPrice(@PathVariable("p1")Integer price1,@PathVariable("p2")Integer price2) {
		
		productDAO.findByPriceBetween(price1, price2);
		return "Deleted Product";
	}
	
	@RequestMapping("/product")
	public String getProduct(Model model) {
		model.addAttribute("product",new Product());
		return "product";
	}
	
}
