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
	private long id;

	@Column(name="FIELD_NAME")
	private String fieldName;

	//bi-directional many-to-one association to TblCertiFieldsReln
	@OneToMany(mappedBy="certificateField")
	private List<CertificateFieldRelation> certificateFieldRelations;

	public CertificateField() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFieldName() {
		return this.fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public List<CertificateFieldRelation> getCertificateFieldRelations() {
		return certificateFieldRelations;
	}

	public void setCertificateFieldRelations(List<CertificateFieldRelation> certificateFieldRelations) {
		this.certificateFieldRelations = certificateFieldRelations;
	}

	public CertificateFieldRelation addTblCertiFieldsReln(CertificateFieldRelation tblCertiFieldsReln) {
		getCertificateFieldRelations().add(tblCertiFieldsReln);
		tblCertiFieldsReln.setCertificateField(this);

		return tblCertiFieldsReln;
	}

	public CertificateFieldRelation removeTblCertiFieldsReln(CertificateFieldRelation tblCertiFieldsReln) {
		getCertificateFieldRelations().remove(tblCertiFieldsReln);
		tblCertiFieldsReln.setCertificateField(null);

		return tblCertiFieldsReln;
	}

}