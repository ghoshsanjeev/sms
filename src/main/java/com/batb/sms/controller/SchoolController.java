package com.batb.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.batb.sms.constant.ViewNames;

@Controller
public class SchoolController {
	
	@RequestMapping(value = {"/dashboard","/"})
	public String getDashboardPage() {
		return ViewNames.DASHBOARD;
	}

}
