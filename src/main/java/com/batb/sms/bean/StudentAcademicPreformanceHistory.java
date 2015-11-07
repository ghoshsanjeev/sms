package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the TBL_STD_ACA_PERF_HIST database table.
 * 
 */
@Entity
@Table(name = "TBL_STD_ACA_PERF_HIST")
@NamedQuery(name = "TblStdAcaPerfHist.findAll", query = "SELECT t FROM StudentAcademicPreformanceHistory t")
public class StudentAcademicPreformanceHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private BigDecimal marks;

	private String promotion;

	private String remarks;

	private BigDecimal semester;

	@Column(name = "YEAR")
	private BigDecimal year;

	// bi-directional many-to-one association to TblClassSubReln
	@ManyToOne
	@JoinColumn(name = "SUB_CODE")
	private ClassSubjectRelation tblClassSubReln;

	// bi-directional many-to-one association to TblStudent
	@ManyToOne
	@JoinColumn(name = "STUDENT")
	private Student tblStudent;

	public StudentAcademicPreformanceHistory() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getMarks() {
		return this.marks;
	}

	public void setMarks(BigDecimal marks) {
		this.marks = marks;
	}

	public String getPromotion() {
		return this.promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public BigDecimal getSemester() {
		return this.semester;
	}

	public void setSemester(BigDecimal semester) {
		this.semester = semester;
	}

	public BigDecimal getYear() {
		return this.year;
	}

	public void setYear(BigDecimal year) {
		this.year = year;
	}

	public ClassSubjectRelation getTblClassSubReln() {
		return this.tblClassSubReln;
	}

	public void setTblClassSubReln(ClassSubjectRelation tblClassSubReln) {
		this.tblClassSubReln = tblClassSubReln;
	}

	public Student getTblStudent() {
		return this.tblStudent;
	}

	public void setTblStudent(Student tblStudent) {
		this.tblStudent = tblStudent;
	}

}