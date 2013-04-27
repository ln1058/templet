package com.luke.scaffolding.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luke.scaffolding.entity.User;
import com.luke.scaffolding.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private UserService userService;


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
//		User user = new User();
//		user.setUsername("ln1058");
//		user.setPassword("123456");
//		userService.addUser(user);
		System.out.println(userService.getUser(1).getUsername());	
		model.addAttribute("username", userService.getUser(1).getUsername());
		System.out.println(userService.getUserMap(1));
		return "home";
	}
	
	  
    @RequestMapping("/login")  
	public @ResponseBody String login(@RequestParam String userName, @RequestParam String password, HttpServletRequest request){
		
		return userName+password;
		
	}
}
