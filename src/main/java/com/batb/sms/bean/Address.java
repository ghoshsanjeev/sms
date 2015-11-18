package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the TBL_ADDRESS database table.
 * 
 */
@Entity
@Table(name = "TBL_ADDRESS")
@NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="SEQ_ADDRESS")
	@SequenceGenerator(name="SEQ_ADDRESS",sequenceName="SEQ_ADDRESS", allocationSize=1)
	private long id;

	private String city;

	private String district;

	private long pin;

	private String po;

	private String ps;
	private String line1;
	private String line2;

	@Column(name = "\"STATE\"")
	private String state;

	private String village;

	// bi-directional many-to-one association to TblStudent
	@OneToMany(mappedBy = "currentAddress")
	private List<Student> studentsOfCurrentAddress;

	@OneToMany(mappedBy ="permanentAddress")
	private List<Student> studentsOfPermanentAddress;
	
	public Address() {
	}

	
	
	public List<Student> getStudentsOfCurrentAddress() {
		return studentsOfCurrentAddress;
	}



	public void setStudentsOfCurrentAddress(List<Student> studentsOfCurrentAddress) {
		this.studentsOfCurrentAddress = studentsOfCurrentAddress;
	}



	public List<Student> getStudentsOfPermanentAddress() {
		return studentsOfPermanentAddress;
	}



	public void setStudentsOfPermanentAddress(List<Student> studentsOfPermanentAddress) {
		this.studentsOfPermanentAddress = studentsOfPermanentAddress;
	}



	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public long getPin() {
		return this.pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	public String getPo() {
		return this.po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public String getPs() {
		return this.ps;
	}

	public void setPs(String ps) {
		this.ps = ps;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getVillage() {
		return this.village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public Student addStudentToCurrentAddress(Student student) {
		getStudentsOfCurrentAddress().add(student);
		student.setCurrentAddress(this);

		return student;
	}

	public Student removeStudentFromCurrentAddress(Student student) {
		getStudentsOfCurrentAddress().remove(student);
		student.setCurrentAddress(null);

		return student;
	}
	
	
	public Student addStudentToPermanentAddress(Student student) {
		getStudentsOfPermanentAddress().add(student);
		student.setPermanentAddress(this);

		return student;
	}

	public Student removeStudentFromPermanentAddress(Student student) {
		getStudentsOfPermanentAddress().remove(student);
		student.setCurrentAddress(null);

		return student;
	}

}