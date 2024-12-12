package com.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pro.entity.Product;
import com.pro.service.ProductService;

@Controller
public class PageController {
	
	@Autowired
	ProductService ps;
	

	@GetMapping("/add-product")
public String insertPage() {
	System.out.println("We are in insert page method");
	return "add";
}
	
	@PostMapping("/insert-product")
	public String addProduct1(@ModelAttribute Product product) {
		
		String msg=ps.addProduct1(product);
		System.out.println(msg);
		return "add";
	}
	
	@GetMapping("/display-product")
	public String displayProduct(Model model) {
		List<Product> list = ps.displayProduct();
		model.addAttribute("products",list);
		return "display";
		
	}
	
	@GetMapping("/delete-product")
	public String deleteProduct(@RequestParam("id") int id) {
		String product = ps.deleteProduct(id);
		System.out.println(product);
		return "redirect:/display-product";
		
	}
	@GetMapping("view-product")
	
	public String viewProduct(@RequestParam("id") int id ,Model model) {
		
		Product product = ps.getProduct(id);
		model.addAttribute("p",product);
		return "update";
	}
	
	@PostMapping("/update-product")
	public String updateProduct(@ModelAttribute Product product) {
		
		 String p = ps.updateProduct(product);
		 System.out.println(p);
		 return "redirect:/display-product";
	}
	
	@GetMapping("/show")
	public String showp() {
		System.out.println("aaaaaaaa");
		return "p";
		
	}
}
