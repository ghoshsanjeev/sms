package com.batb.sms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.batb.sms.constant.ViewNames;
import com.batb.sms.dto.StudentDTO;
import com.batb.sms.repo.StudentRepository;
import com.batb.sms.repo.StudentRepositoryImpl;
import com.batb.sms.services.StudentService;

/**
 * 
 * @author Sanjib
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	private Logger log = LoggerFactory.getLogger(StudentController.class);

	@Autowired
	private StudentRepository repo;

	@Autowired
	private StudentService service;

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

	@RequestMapping(value = "/renewal")
	public String getRenewalPage() {
		return ViewNames.RENEWAL;
	}

	@RequestMapping(value = "/studentDTO")
	public @ResponseBody StudentDTO getStudentDTOSchema() {
		return new StudentDTO();
	}

	@RequestMapping(value = "/createStudent", method = RequestMethod.POST)
	public @ResponseBody boolean createStudent(@RequestBody StudentDTO studentDTO) {
		// TODO: dozer mapping for studentDTO <=> student
		System.out.println(studentDTO);

		System.out.println(repo.getGeneratedRollNo(6, 'A'));
		return false;
	}

	@RequestMapping("/getRollNo")
	public @ResponseBody StudentDTO getRollNo(@RequestBody StudentDTO studentDTO) {
		try {
			studentDTO.setRollNo(repo
					.getGeneratedRollNo(Integer.parseInt(studentDTO.getClass_()), studentDTO.getSection()).intValue());
		} catch (NumberFormatException ex) {
			System.out.println("empty field");
			log.error(ex.getMessage(), ex);
		}
		return studentDTO;
	}

}
