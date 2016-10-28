package com.spring.helloworld;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "main.do", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "a.do", method = RequestMethod.POST)
	public String a(Model model,HttpServletRequest req) {
		
		String test = req.getParameter("test");
		System.out.println(test);
		if(test!=null){
			req.setAttribute("test", test);
		}
		return "a";
	}
	
	
	@RequestMapping(value = "a1.do", method = RequestMethod.POST)
	public String a1(Model model,HttpServletRequest req) {
		
		String test = req.getParameter("test");
		System.out.println(test);
		String test1 = null;
		if(req.getParameter("test1").trim()!=null&&req.getParameter("test1")!=""){
			test1 = req.getParameter("test1");
			System.out.println("이게왜찍히냐"+test1);
		}
		System.out.println(test);
	
		int c=0;
		if(test!=null&&test1!=null){
			int a =Integer.parseInt(test);
			System.out.println(a);
			int b =Integer.parseInt(test1);
			System.out.println(b);
			c= a*b;
		}
		req.setAttribute("test", c);
		return "a1";
	}
	
}
