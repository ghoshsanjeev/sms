package com.batb.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.batb.sms.constant.ViewNames;
import com.batb.sms.dto.StudentDTO;

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

	@RequestMapping(value = "/markSheetHS")
	public String getMarkSheetHSPage() {
		return ViewNames.MARK_SHEET_HS;
	}

	@RequestMapping(value = "/markSheetM")
	public String getMarkSheetMPage() {
		return ViewNames.MARK_SHEET_M;
	}

	@RequestMapping(value = "/studentDTO")
	public @ResponseBody StudentDTO getStudentDTOSchema() {
		return new StudentDTO();
	}
	
	@RequestMapping(value="/createStudent",method=RequestMethod.POST)
	public @ResponseBody boolean createStudent(@RequestBody StudentDTO studentDTO){
		System.out.println(studentDTO);
		return false;
		
	}

}
