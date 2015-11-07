package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the _CERTI_FIELD_VALUES database table.
 * 
 */
@Entity
@Table(name="TBL_CERTI_FIELD_VALUES")
@NamedQuery(name="CertiFieldValue.findAll", query="SELECT t FROM CertificateFieldValue t")
public class CertificateFieldValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="FIELD_VALUE")
	private String fieldValue;

	//bi-directional many-to-one association to CertiFieldsReln
	@ManyToOne
	@JoinColumn(name="CERTI_FIELD_RELN")
	private CertificateFieldRelation certificateFieldRelation;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="STUDENT")
	private Student student;

	public CertificateFieldValue() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFieldValue() {
		return this.fieldValue;
	}

	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	public CertificateFieldRelation getCertificateFieldRelation() {
		return this.certificateFieldRelation;
	}

	public void setCertificateFieldRelation(CertificateFieldRelation certiFieldsReln) {
		this.certificateFieldRelation = certiFieldsReln;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}