package com.batb.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.batb.sms.constant.ViewNames;

@Controller
public class AuthenticationController {
	
	@RequestMapping(value="/login")
	public String getLoginPage(){
		System.out.println("login controller");
		return ViewNames.LOGIN;
	}
	
	public boolean authenticateCredential(String username,String password){
		return false;
	}

}
