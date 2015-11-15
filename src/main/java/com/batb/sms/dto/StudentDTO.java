package com.batb.sms.dto;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.batb.sms.util.Utility;

/**
 * s
 * 
 * @author Sanjib
 *
 */
public class StudentDTO {
	private String studentType;
	private String firstName;
	private String lastName;
	private String sex;
	private AddressDTO currentAddress = new AddressDTO();
	private AddressDTO permanentAddress = new AddressDTO();
	private String gurdianName;
	private String motherName;
	private Date dateOfBirth;
	private String religion;
	private String caste;
	private String bpl;
	private String idMark;
	private String contactNo;
	private Date admissionDate;
	private String class_;
	private int rollNo;
	private char section;
	private String stream;
	private String subject;
	private String fees;
	private double feesAmt;
	private String emailID;
	private String yearOfPassing;
	private String remark;

	/**
	 * @return the section
	 */
	public char getSection() {
		return section;
	}

	/**
	 * @param section
	 *            the section to set
	 */
	public void setSection(char section) {
		this.section = section;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the currentAddress
	 */
	public AddressDTO getCurrentAddress() {
		return currentAddress;
	}

	/**
	 * @param currentAddress
	 *            the currentAddress to set
	 */
	public void setCurrentAddress(AddressDTO currentAddress) {
		this.currentAddress = currentAddress;
	}

	/**
	 * @return the permanentAddress
	 */
	public AddressDTO getPermanentAddress() {
		return permanentAddress;
	}

	/**
	 * @param permanentAddress
	 *            the permanentAddress to set
	 */
	public void setPermanentAddress(AddressDTO permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	/**
	 * @return the gurdianName
	 */
	public String getGurdianName() {
		return gurdianName;
	}

	/**
	 * @param gurdianName
	 *            the gurdianName to set
	 */
	public void setGurdianName(String gurdianName) {
		this.gurdianName = gurdianName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName
	 *            the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth
	 *            the dateOfBirth to set
	 */
	public void setDateOfBirth(String s) {
		this.dateOfBirth = Utility.getDateFromString(s);
	}

	/**
	 * @return the religion
	 */
	public String getReligion() {
		return religion;
	}

	/**
	 * @param religion
	 *            the religion to set
	 */
	public void setReligion(String religion) {
		this.religion = religion;
	}

	/**
	 * @return the caste
	 */
	public String getCaste() {
		return caste;
	}

	/**
	 * @param caste
	 *            the caste to set
	 */
	public void setCaste(String caste) {
		this.caste = caste;
	}

	/**
	 * @return the bpl
	 */
	public String getBpl() {
		return bpl;
	}

	/**
	 * @param bpl
	 *            the bpl to set
	 */
	public void setBpl(String bpl) {
		this.bpl = bpl;
	}

	/**
	 * @return the idMark
	 */
	public String getIdMark() {
		return idMark;
	}

	/**
	 * @param idMark
	 *            the idMark to set
	 */
	public void setIdMark(String idMark) {
		this.idMark = idMark;
	}

	/**
	 * @return the contactNo
	 */
	public String getContactNo() {
		return contactNo;
	}

	/**
	 * @param contactNo
	 *            the contactNo to set
	 */
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	/**
	 * @return the admissionDate
	 */
	public Date getAdmissionDate() {
		return admissionDate;
	}

	/**
	 * @param admissionDate
	 *            the admissionDate to set
	 */
	public void setAdmissionDate(String s) {
		admissionDate = Utility.getDateFromString(s);
	}

	/**
	 * @return the class_
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * @param class_
	 *            the class_ to set
	 */
	public void setClass_(String class_) {
		this.class_ = class_;
	}

	/**
	 * @return the rollNo
	 */
	public int getRollNo() {
		return rollNo;
	}

	/**
	 * @param rollNo
	 *            the rollNo to set
	 */
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	/**
	 * @return the stream
	 */
	public String getStream() {
		return stream;
	}

	/**
	 * @param stream
	 *            the stream to set
	 */
	public void setStream(String stream) {
		this.stream = stream;
	}

	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 * @param subject
	 *            the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * @return the fees
	 */
	public String getFees() {
		return fees;
	}

	/**
	 * @param fees
	 *            the fees to set
	 */
	public void setFees(String fees) {
		this.fees = fees;
	}

	/**
	 * @return the feesAmt
	 */
	public double getFeesAmt() {
		return feesAmt;
	}

	/**
	 * @param feesAmt
	 *            the feesAmt to set
	 */
	public void setFeesAmt(String s) {
		this.feesAmt = Double.valueOf(s);
	}

	/**
	 * @return the emailID
	 */
	public String getEmailID() {
		return emailID;
	}

	/**
	 * @param emailID
	 *            the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	/**
	 * @return the studentType
	 */
	public String getStudentType() {
		return studentType;
	}

	/**
	 * @param studentType
	 *            the studentType to set
	 */
	public void setStudentType(String studentType) {
		this.studentType = studentType;
	}

	/**
	 * @return the yearOfPassing
	 */
	public String getYearOfPassing() {
		return yearOfPassing;
	}

	/**
	 * @param yearOfPassing
	 *            the yearOfPassing to set
	 */
	public void setYearOfPassing(String yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}

	/**
	 * @param remark
	 *            the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentDTO [studentType=" + studentType + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", sex=" + sex + ", currentAddress=" + currentAddress + ", permanentAddress=" + permanentAddress
				+ ", gurdianName=" + gurdianName + ", motherName=" + motherName + ", dateOfBirth=" + dateOfBirth
				+ ", religion=" + religion + ", caste=" + caste + ", bpl=" + bpl + ", idMark=" + idMark + ", contactNo="
				+ contactNo + ", AdmissionDate=" + admissionDate + ", class_=" + class_ + ", rollNo=" + rollNo
				+ ", stream=" + stream + ", subject=" + subject + ", fees=" + fees + ", feesAmt=" + feesAmt
				+ ", emailID=" + emailID + ", yearOfPassing=" + yearOfPassing + ", remark=" + remark + "]";
	}

}
