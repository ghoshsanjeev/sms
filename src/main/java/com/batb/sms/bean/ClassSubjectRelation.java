package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the TBL_CLASS_SUB_RELN database table.
 * 
 */
@Entity
@Table(name="TBL_CLASS_SUB_RELN")
@NamedQuery(name="TblClassSubReln.findAll", query="SELECT t FROM ClassSubjectRelation t")
public class ClassSubjectRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	@Column(name="CLASS")
	private BigDecimal class_;

	private String subject;

	//bi-directional many-to-one association to TblStdAcaPerfHist
	@OneToMany(mappedBy="classSubjectRelation")
	private List<StudentAcademicPreformanceHistory> studentAcademicPreformanceHistorys;

	//bi-directional many-to-one association to TblStdCurrStdPerf
	@OneToMany(mappedBy="classSubjectRelation")
	private List<StudentCurrentStandardPerformance> studentCurrentStandardPerformances;

	public ClassSubjectRelation() {
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

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public StudentAcademicPreformanceHistory addTblStdAcaPerfHist(StudentAcademicPreformanceHistory tblStdAcaPerfHist) {
		getStudentAcademicPreformanceHistorys().add(tblStdAcaPerfHist);
		tblStdAcaPerfHist.setClassSubjectRelation(this);

		return tblStdAcaPerfHist;
	}

	public StudentAcademicPreformanceHistory removeTblStdAcaPerfHist(StudentAcademicPreformanceHistory tblStdAcaPerfHist) {
		getStudentAcademicPreformanceHistorys().remove(tblStdAcaPerfHist);
		tblStdAcaPerfHist.setClassSubjectRelation(null);

		return tblStdAcaPerfHist;
	}

	public List<StudentAcademicPreformanceHistory> getStudentAcademicPreformanceHistorys() {
		return studentAcademicPreformanceHistorys;
	}

	public void setStudentAcademicPreformanceHistorys(
			List<StudentAcademicPreformanceHistory> studentAcademicPreformanceHistorys) {
		this.studentAcademicPreformanceHistorys = studentAcademicPreformanceHistorys;
	}

	public List<StudentCurrentStandardPerformance> getStudentCurrentStandardPerformances() {
		return studentCurrentStandardPerformances;
	}

	public void setStudentCurrentStandardPerformances(
			List<StudentCurrentStandardPerformance> studentCurrentStandardPerformances) {
		this.studentCurrentStandardPerformances = studentCurrentStandardPerformances;
	}

	public StudentCurrentStandardPerformance addTblStdCurrStdPerf(StudentCurrentStandardPerformance tblStdCurrStdPerf) {
		getStudentCurrentStandardPerformances().add(tblStdCurrStdPerf);
		tblStdCurrStdPerf.setClassSubjectRelation(this);

		return tblStdCurrStdPerf;
	}

	public StudentCurrentStandardPerformance removeTblStdCurrStdPerf(StudentCurrentStandardPerformance tblStdCurrStdPerf) {
		getStudentCurrentStandardPerformances().remove(tblStdCurrStdPerf);
		tblStdCurrStdPerf.setClassSubjectRelation(null);

		return tblStdCurrStdPerf;
	}

}