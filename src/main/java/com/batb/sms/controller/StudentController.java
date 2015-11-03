package com.batb.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.batb.sms.constant.ViewNames;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value = "/registration")
	public String getRegistrationPage() {
		return ViewNames.STUDENT_REGISTRATION;
	}

	@RequestMapping(value = "/attendance")
	public String getAttendancePage() {
		return ViewNames.STUDENT_ATTENDANCE;
	}
	
	@RequestMapping(value = "/markSheetEntry")
	public String getMarkSheetEntryPage() {
		return ViewNames.MARK_SHEET_ENTRY;
	}
	
	
	
	
}
