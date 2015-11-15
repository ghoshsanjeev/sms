package com.batb.sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.batb.sms.bean.Address;
import com.batb.sms.bean.Student;
import com.batb.sms.constant.ViewNames;
import com.batb.sms.dto.AddressDTO;
import com.batb.sms.dto.StudentDTO;
import com.batb.sms.repo.StudentRepository;
import com.batb.sms.services.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

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
		
		Student student = new Student();
		Address addressCurrent = new Address();
		Address addressPermanent = new Address();
		AddressDTO addressDTOCurrent = new AddressDTO();
		AddressDTO addressDTOPermamanent = new AddressDTO();
		addressDTOCurrent = studentDTO.getCurrentAddress();
		addressDTOPermamanent = studentDTO.getPermanentAddress();
		
		addressCurrent.setLine1(addressDTOCurrent.getAddressLine1());
		addressCurrent.setLine2(addressDTOCurrent.getAddressLine2());
		addressCurrent.setCity(addressDTOCurrent.getCity());
		addressCurrent.setDistrict(addressDTOPermamanent.getDistrict());
		addressCurrent.setPin(Long.valueOf(addressDTOCurrent.getPincode()));
		addressCurrent.setPo(addressDTOCurrent.getPostOffice());
		addressCurrent.setPs(addressDTOCurrent.getPoliceStation());
		addressCurrent.setState(addressDTOCurrent.getS);
		
		
		System.out.println(repo.getGeneratedRollNo(6, 'A'));
		return false;
	}

	@RequestMapping("/getRollNo")
	public @ResponseBody StudentDTO getRollNo(@RequestBody StudentDTO studentDTO) {
		studentDTO.setRollNo(
				repo.getGeneratedRollNo(Integer.parseInt(studentDTO.getClass_()), studentDTO.getSection()).intValue());
		return studentDTO;
	}

}
