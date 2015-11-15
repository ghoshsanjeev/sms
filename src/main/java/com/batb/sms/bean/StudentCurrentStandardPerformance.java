package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the TBL_STD_CURR_STD_PERF database table.
 * 
 */
@Entity
@Table(name="TBL_STD_CURR_STD_PERF")
@NamedQuery(name="TblStdCurrStdPerf.findAll", query="SELECT t FROM StudentCurrentStandardPerformance t")
public class StudentCurrentStandardPerformance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private BigDecimal marks;

	private BigDecimal semester;

	//bi-directional many-to-one association to TblClassSubReln
	@ManyToOne
	@JoinColumn(name="SUB_CODE")
	private ClassSubjectRelation classSubjectRelation;

	//bi-directional many-to-one association to TblStudent
	@ManyToOne
	@JoinColumn(name="STUDENT")
	private Student student;

	public StudentCurrentStandardPerformance() {
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

	public BigDecimal getSemester() {
		return this.semester;
	}

	public void setSemester(BigDecimal semester) {
		this.semester = semester;
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

	public void setStudent(Student tblStudent) {
		this.student = tblStudent;
	}

}