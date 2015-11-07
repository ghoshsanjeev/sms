package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBL_ATTND_CLNDR database table.
 * 
 */
@Entity
@Table(name="TBL_ATTND_CLNDR")
@NamedQuery(name="TblAttndClndr.findAll", query="SELECT t FROM AttendanceCalendar t")
public class AttendanceCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="CLASS")
	private BigDecimal class_;

	@Column(name="MONTH")
	private String month;

	@Column(name="TOT_CLASS")
	private BigDecimal totClass;

	@Column(name="YEAR")
	private BigDecimal year;

	//bi-directional many-to-one association to TblStdAttnd
	@OneToMany(mappedBy="tblAttndClndr")
	private List<StudentAttendance> tblStdAttnds;

	public AttendanceCalendar() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
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

	public List<StudentAttendance> getTblStdAttnds() {
		return this.tblStdAttnds;
	}

	public void setTblStdAttnds(List<StudentAttendance> tblStdAttnds) {
		this.tblStdAttnds = tblStdAttnds;
	}

	public StudentAttendance addTblStdAttnd(StudentAttendance tblStdAttnd) {
		getTblStdAttnds().add(tblStdAttnd);
		tblStdAttnd.setTblAttndClndr(this);

		return tblStdAttnd;
	}

	public StudentAttendance removeTblStdAttnd(StudentAttendance tblStdAttnd) {
		getTblStdAttnds().remove(tblStdAttnd);
		tblStdAttnd.setTblAttndClndr(null);

		return tblStdAttnd;
	}

}