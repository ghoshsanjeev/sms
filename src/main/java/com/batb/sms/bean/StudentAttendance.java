package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TBL_STD_ATTND database table.
 * 
 */
@Entity
@Table(name="TBL_STD_ATTND")
@NamedQuery(name="TblStdAttnd.findAll", query="SELECT t FROM StudentAttendance t")
public class StudentAttendance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private BigDecimal attendance;

	//bi-directional many-to-one association to TblAttndClndr
	@ManyToOne
	@JoinColumn(name="ATT_CAL")
	private AttendanceCalendar tblAttndClndr;

	//bi-directional many-to-one association to TblStudent
	@ManyToOne
	@JoinColumn(name="STUDENT")
	private Student tblStudent;

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

	public AttendanceCalendar getTblAttndClndr() {
		return this.tblAttndClndr;
	}

	public void setTblAttndClndr(AttendanceCalendar tblAttndClndr) {
		this.tblAttndClndr = tblAttndClndr;
	}

	public Student getTblStudent() {
		return this.tblStudent;
	}

	public void setTblStudent(Student tblStudent) {
		this.tblStudent = tblStudent;
	}

}