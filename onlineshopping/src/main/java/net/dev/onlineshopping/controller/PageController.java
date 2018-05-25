package net.dev.onlineshopping.controller;

import net.dev.shoppingbackend.dao.CategoryDAO;
import net.dev.shoppingbackend.dto.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDao;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to spring");
		mv.addObject("title", "home");
		
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickOnHome", true);
		return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to spring");
		mv.addObject("title", "About us");
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickOnAbout", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to spring");
		mv.addObject("title", "Contact us");
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickOnContact", true);
		return mv;
	}

	/*@RequestMapping(value = "/test")
	public ModelAndView test(
			@RequestParam(value = "greeting", required = false) String greeting) {
		if (greeting == null) {
			greeting = "Hello There";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", greeting);
		return mv;

	}
	
	
	@RequestMapping(value = "/test/{greeting}")
	public ModelAndView testpath(
			@PathVariable(value = "greeting") String greeting) {
		if (greeting == null) {
			greeting = "Hello There";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", greeting);
		return mv;

	}*/
	
	@RequestMapping(value = "show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");

		mv.addObject("title", "showing all products");
		
		mv.addObject("categories",categoryDao.list());
		mv.addObject("userClickOnAllProducts", true);
		return mv;
	}
	
	@RequestMapping(value = "show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("page");

		Category category = null;
		category = categoryDao.get(id);
		
		mv.addObject("title", category.getName());
		mv.addObject("categories",categoryDao.list());
		mv.addObject("category",category);
		
		mv.addObject("userClickOnCategoryProducts", true);
		return mv;
	}
	
	
	

}
