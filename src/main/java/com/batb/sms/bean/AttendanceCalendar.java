package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the _ATTND_CLNDR database table.
 * 
 */
@Entity
@Table(name="TBL_ATTND_CLNDR")
@NamedQuery(name="AttndClndr.findAll", query="SELECT t FROM AttendanceCalendar t")
public class AttendanceCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="CLASS")
	private BigDecimal class_;

	@Column(name="MONTH")
	private String month;

	@Column(name="TOT_CLASS")
	private BigDecimal totClass;

	@Column(name="YEAR")
	private BigDecimal year;

	//bi-directional many-to-one association to StdAttnd
	@OneToMany(mappedBy="attendanceCalendar")
	private List<StudentAttendance> studentAttendances;

	public AttendanceCalendar() {
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

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public BigDecimal getTotClass() {
		return this.totClass;
	}

	public void setTotClass(BigDecimal totClass) {
		this.totClass = totClass;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	public List<StudentAttendance> getStudentAttendances() {
		return this.studentAttendances;
	}

	public void setStudentAttendances(List<StudentAttendance> studentAttendance) {
		this.studentAttendances = studentAttendance;
	}

	public StudentAttendance addStudentAttendance(StudentAttendance StdAttnd) {
		getStudentAttendances().add(StdAttnd);
		StdAttnd.setAttendanceCalendar(this);

		return StdAttnd;
	}

	public StudentAttendance removeStudentAttendance(StudentAttendance studentAttendance) {
		getStudentAttendances().remove(studentAttendance);
		studentAttendance.setAttendanceCalendar(null);

		return studentAttendance;
	}

}