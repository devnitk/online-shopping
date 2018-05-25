package net.dev.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to spring");
		mv.addObject("title", "home");
		mv.addObject("userClickOnHome", true);
		return mv;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to spring");
		mv.addObject("title", "About us");
		mv.addObject("userClickOnAbout", true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("Greeting", "Welcome to spring");
		mv.addObject("title", "Contact us");
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

}
