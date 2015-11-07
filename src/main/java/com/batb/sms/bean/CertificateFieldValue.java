package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the TBL_CERTI_FIELD_VALUES database table.
 * 
 */
@Entity
@Table(name="TBL_CERTI_FIELD_VALUES")
@NamedQuery(name="TblCertiFieldValue.findAll", query="SELECT t FROM CertificateFieldValue t")
public class CertificateFieldValue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="FIELD_VALUE")
	private String fieldValue;

	//bi-directional many-to-one association to TblCertiFieldsReln
	@ManyToOne
	@JoinColumn(name="CERTI_FIELD_RELN")
	private CertificateFieldRelation tblCertiFieldsReln;

	//bi-directional many-to-one association to TblStudent
	@ManyToOne
	@JoinColumn(name="STUDENT")
	private Student tblStudent;

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

	public CertificateFieldRelation getTblCertiFieldsReln() {
		return this.tblCertiFieldsReln;
	}

	public void setTblCertiFieldsReln(CertificateFieldRelation tblCertiFieldsReln) {
		this.tblCertiFieldsReln = tblCertiFieldsReln;
	}

	public Student getTblStudent() {
		return this.tblStudent;
	}

	public void setTblStudent(Student tblStudent) {
		this.tblStudent = tblStudent;
	}

}