package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController{
//PageController  is the handlermapper which will help to resolve
//the request based on the url
@RequestMapping(value= {"/" ,"/home","/index"})
public ModelAndView index() {
	
	ModelAndView mv = new ModelAndView("page");
	//The view name is page. I need to specify which view technology I am using.
	
	mv.addObject("greeting","Welcome to Spring Web MVC");
	return mv;
}

//@RequestMapping(value = "/test")
//public ModelAndView test(@RequestParam(value = "greeting", required=false) String greeting) {
//	if(greeting == null) {
//		greeting = "Hello There";
//	}
//	ModelAndView mv =  new ModelAndView("page");
//	mv.addObject("greeting", greeting);
//	return mv;
//}	

//@RequestMapping(value="/test/{greeting}")
//public ModelAndView test(@PathVariable("greeting") String greeting) {
//if(greeting == null) {
//greeting = "Hello!!!";}
//
//ModelAndView mv = new ModelAndView("page");
//mv.addObject("greeting", greeting);
//return mv;


}


	
	
	

