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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

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
	private List<Student> students;

	public Address() {
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

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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

	public List<Student> getStudents() {
		return this.students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setCurrentAddress(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setCurrentAddress(null);

		return student;
	}

}