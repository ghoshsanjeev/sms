package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the TBL_STD_CURR_STD database table.
 * 
 */
@Entity
@Table(name = "TBL_STD_CURR_STD")
@NamedQuery(name = "TblStdCurrStd.findAll", query = "SELECT t FROM StudentCurrentStandard t")
public class StudentCurrentStandard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name = "CLASS")
	private BigDecimal class_;

	@Column(name = "ROLL_NO")
	private BigDecimal rollNo;

	private String sec;

	private String stream;

	@Column(name = "YEAR")
	private BigDecimal year;

	// bi-directional many-to-one association to TblStudent
	@OneToOne
	@JoinColumn(name = "STUDENT")
	private Student student;

	public StudentCurrentStandard() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getClass_() {
		return this.class_;
	}

	public void setClass_(BigDecimal class_) {
		this.class_ = class_;
	}

	public BigDecimal getRollNo() {
		return this.rollNo;
	}

	public void setRollNo(BigDecimal rollNo) {
		this.rollNo = rollNo;
	}

	public String getSec() {
		return this.sec;
	}

	public void setSec(String sec) {
		this.sec = sec;
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}