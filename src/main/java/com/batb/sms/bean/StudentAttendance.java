package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the _STD_ATTND database table.
 * 
 */
@Entity
@Table(name="TBL_STD_ATTND")
@NamedQuery(name="StdAttnd.findAll", query="SELECT t FROM StudentAttendance t")
public class StudentAttendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private BigDecimal attendance;

	//bi-directional many-to-one association to AttndClndr
	@ManyToOne
	@JoinColumn(name="ATT_CAL")
	private AttendanceCalendar attendanceCalendar;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="STUDENT")
	private Student student;

	public StudentAttendance() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getAttendance() {
		return this.attendance;
	}

	public void setAttendance(BigDecimal attendance) {
		this.attendance = attendance;
	}

	public AttendanceCalendar getAttendanceCalendarr() {
		return this.attendanceCalendar;
	}

	public void setAttendanceCalendar(AttendanceCalendar studentAttendance) {
		this.attendanceCalendar = studentAttendance;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student Student) {
		this.student = Student;
	}

}