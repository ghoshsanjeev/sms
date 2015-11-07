package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_CERTI_FIELDS database table.
 * 
 */
@Entity
@Table(name="TBL_CERTI_FIELDS")
@NamedQuery(name="TblCertiField.findAll", query="SELECT t FROM CertificateField t")
public class CertificateField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="FIELD_NAME")
	private String fieldName;

	//bi-directional many-to-one association to TblCertiFieldsReln
	@OneToMany(mappedBy="tblCertiField")
	private List<CertificateFieldRelation> tblCertiFieldsRelns;

	public CertificateField() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<CertificateFieldRelation> getTblCertiFieldsRelns() {
		return this.tblCertiFieldsRelns;
	}

	public void setTblCertiFieldsRelns(List<CertificateFieldRelation> tblCertiFieldsRelns) {
		this.tblCertiFieldsRelns = tblCertiFieldsRelns;
	}

	public CertificateFieldRelation addTblCertiFieldsReln(CertificateFieldRelation tblCertiFieldsReln) {
		getTblCertiFieldsRelns().add(tblCertiFieldsReln);
		tblCertiFieldsReln.setTblCertiField(this);

		return tblCertiFieldsReln;
	}

	public CertificateFieldRelation removeTblCertiFieldsReln(CertificateFieldRelation tblCertiFieldsReln) {
		getTblCertiFieldsRelns().remove(tblCertiFieldsReln);
		tblCertiFieldsReln.setTblCertiField(null);

		return tblCertiFieldsReln;
	}

}