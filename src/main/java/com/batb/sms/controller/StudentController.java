package com.batb.sms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import com.batb.sms.services.AddressService;
import com.batb.sms.services.StudentService;
import com.batb.sms.util.Utility;

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

	@Autowired
	private AddressService addressService;
	
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
		AddressDTO addressDTOPermanent = new AddressDTO();
		addressDTOCurrent = studentDTO.getCurrentAddress();
		addressDTOPermanent = studentDTO.getPermanentAddress();

		addressCurrent.setLine1(addressDTOCurrent.getAddressLine1());
		addressCurrent.setLine2(addressDTOCurrent.getAddressLine2());
		addressCurrent.setCity(addressDTOCurrent.getCity());
		addressCurrent.setDistrict(addressDTOCurrent.getDistrict());
		//addressCurrent.setPin(Long.valueOf(addressDTOCurrent.getPincode()));
		addressCurrent.setPo(addressDTOCurrent.getPostOffice());
		addressCurrent.setPs(addressDTOCurrent.getPoliceStation());
		addressCurrent.setState(addressDTOCurrent.getState());
		addressCurrent.setVillage(addressDTOCurrent.getVillageOrTown());

		addressPermanent.setLine1(addressDTOPermanent.getAddressLine1());
		addressPermanent.setLine2(addressDTOPermanent.getAddressLine2());
		addressPermanent.setCity(addressDTOPermanent.getCity());
		addressPermanent.setDistrict(addressDTOPermanent.getDistrict());
		addressPermanent.setPin(Long.valueOf(addressDTOPermanent.getPincode()));
		addressPermanent.setPo(addressDTOPermanent.getPostOffice());
		addressPermanent.setPs(addressDTOPermanent.getPoliceStation());
		addressPermanent.setState(addressDTOPermanent.getState());
		addressPermanent.setVillage(addressDTOPermanent.getVillageOrTown());

		addressService.create(addressPermanent);
		addressService.create(addressCurrent);
		student.setCurrentAddress(addressCurrent);
		student.setPermanentAddress(addressPermanent);

		/*
		 * TODO: UI - DTO fields missing student.setAdmissionClass();
		 * student.setAdmissionSection(); student.setBoradName();
		 * student.setFeesEP(); student.setGradeMpHs();
		 * student.setInstituteName(); student.setLastClass();
		 * student.setMaritalStatus(); student.setMarksInLastClass();
		 * student.setPrfAppForm(); student.setRegistrationNo();
		 * student.setSlNo();
		 */

		student.setAdmissionDate(Utility.getDateFromString(studentDTO.getAdmissionDate()));
		student.setBpl(studentDTO.getBpl());
		student.setCaste(studentDTO.getCaste());
		student.setContNo(Long.valueOf(studentDTO.getContactNo()));
		//student.setDob(Utility.getDateFromString(studentDTO.getDateOfBirth()));
		student.setFeeAmt(studentDTO.getFeesAmt());

		student.setGender(studentDTO.getSex());

		student.setGuardianName(studentDTO.getGurdianName());
		student.setIdMark(studentDTO.getIdMark());
		student.setMothersName(studentDTO.getMotherName());
		student.setName(studentDTO.getFirstName() + " " + studentDTO.getLastName());
		student.setReligion(studentDTO.getReligion());
		student.setStdRollNo(studentDTO.getRollNo());
		student.setStream(studentDTO.getStream());

		service.create(student);

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
