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
	private String id;

	@Column(name="CLASS")
	private BigDecimal class_;

	private String subject;

	//bi-directional many-to-one association to TblStdAcaPerfHist
	@OneToMany(mappedBy="tblClassSubReln")
	private List<StudentAcademicPreformanceHistory> tblStdAcaPerfHists;

	//bi-directional many-to-one association to TblStdCurrStdPerf
	@OneToMany(mappedBy="tblClassSubReln")
	private List<StudentCurrentStandardPerformance> tblStdCurrStdPerfs;

	public ClassSubjectRelation() {
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

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<StudentAcademicPreformanceHistory> getTblStdAcaPerfHists() {
		return this.tblStdAcaPerfHists;
	}

	public void setTblStdAcaPerfHists(List<StudentAcademicPreformanceHistory> tblStdAcaPerfHists) {
		this.tblStdAcaPerfHists = tblStdAcaPerfHists;
	}

	public StudentAcademicPreformanceHistory addTblStdAcaPerfHist(StudentAcademicPreformanceHistory tblStdAcaPerfHist) {
		getTblStdAcaPerfHists().add(tblStdAcaPerfHist);
		tblStdAcaPerfHist.setTblClassSubReln(this);

		return tblStdAcaPerfHist;
	}

	public StudentAcademicPreformanceHistory removeTblStdAcaPerfHist(StudentAcademicPreformanceHistory tblStdAcaPerfHist) {
		getTblStdAcaPerfHists().remove(tblStdAcaPerfHist);
		tblStdAcaPerfHist.setTblClassSubReln(null);

		return tblStdAcaPerfHist;
	}

	public List<StudentCurrentStandardPerformance> getTblStdCurrStdPerfs() {
		return this.tblStdCurrStdPerfs;
	}

	public void setTblStdCurrStdPerfs(List<StudentCurrentStandardPerformance> tblStdCurrStdPerfs) {
		this.tblStdCurrStdPerfs = tblStdCurrStdPerfs;
	}

	public StudentCurrentStandardPerformance addTblStdCurrStdPerf(StudentCurrentStandardPerformance tblStdCurrStdPerf) {
		getTblStdCurrStdPerfs().add(tblStdCurrStdPerf);
		tblStdCurrStdPerf.setTblClassSubReln(this);

		return tblStdCurrStdPerf;
	}

	public StudentCurrentStandardPerformance removeTblStdCurrStdPerf(StudentCurrentStandardPerformance tblStdCurrStdPerf) {
		getTblStdCurrStdPerfs().remove(tblStdCurrStdPerf);
		tblStdCurrStdPerf.setTblClassSubReln(null);

		return tblStdCurrStdPerf;
	}

}