package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the _STD_ACA_PERF_HIST database table.
 * 
 */
@Entity
@Table(name = "TBL_STD_ACA_PERF_HIST")
@NamedQuery(name = "StdAcaPerfHist.findAll", query = "SELECT t FROM StudentAcademicPreformanceHistory t")
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

	// bi-directional many-to-one association to ClassSubReln
	@ManyToOne
	@JoinColumn(name = "SUB_CODE")
	private ClassSubjectRelation classSubjectRelation;

	// bi-directional many-to-one association to student
	@ManyToOne
	@JoinColumn(name = "STUDENT")
	private Student student;

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


	public ClassSubjectRelation getClassSubjectRelation() {
		return classSubjectRelation;
	}

	public void setClassSubjectRelation(ClassSubjectRelation classSubjectRelation) {
		this.classSubjectRelation = classSubjectRelation;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}