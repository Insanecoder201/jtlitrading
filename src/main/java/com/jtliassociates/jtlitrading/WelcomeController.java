package com.jtliassociates.jtlitrading;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jtliassociates.jtlitrading.model.UserInfo;

@Controller
public class WelcomeController {
	
	
	/*@RequestMapping("/")
	public String welcome_index() {
		return "index";
	}*/
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping(name="/submit", method=RequestMethod.POST)
	public String handleUserInput(@RequestParam String email, @RequestParam String number, @RequestParam String tradeselect) {
		
		System.out.println("email : "+email);
		System.out.println("number : "+number);
		System.out.println("tradeselect : "+tradeselect);
		
		
		// Check the count of customers - should be less than 100, or display error message
		
		// db call to retrieve charge and logic to process it
		
		
		// After successful payment, insert userinfo in db
		
		UserInfo userInfo = new UserInfo();
		
		userInfo.setEmailId(email);
		userInfo.setPhoneno(number);
		
		
		return "Welcome";
		
	}
}
