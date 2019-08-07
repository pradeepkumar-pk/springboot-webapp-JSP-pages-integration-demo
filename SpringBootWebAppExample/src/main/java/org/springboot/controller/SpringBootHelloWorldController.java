package org.springboot.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.bean.User;

@Controller
public class SpringBootHelloWorldController {

	@RequestMapping("/hellonewworld")
	public ModelAndView hello() {

		String helloWorldMessage = "Hello world from SpringBoot!";
		return new ModelAndView("hello", "message", helloWorldMessage);
	}

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home1(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return new ModelAndView("login", "serverTime", formattedDate);
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "login";
	}
	
	@RequestMapping(value = "/verifylogin", method = RequestMethod.POST)
	public String user(@Validated User user, Model model) {
		System.out.println("User Page Requested");
		model.addAttribute("userName", user.getUserName());
		model.addAttribute("passWord", user.getPassWord());
		if (user.getUserName().equals("admin") && user.getPassWord().equals("admin")) {
			return "menu";
		}
		return "failure";
	}
	
	
}





