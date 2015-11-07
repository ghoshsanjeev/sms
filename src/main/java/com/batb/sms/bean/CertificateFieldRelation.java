package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_CERTI_FIELDS_RELN database table.
 * 
 */
@Entity
@Table(name="TBL_CERTI_FIELDS_RELN")
@NamedQuery(name="TblCertiFieldsReln.findAll", query="SELECT t FROM CertificateFieldRelation t")
public class CertificateFieldRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	//bi-directional many-to-one association to TblCertificate
	@ManyToOne
	@JoinColumn(name="CERTIFICATE")
	private Certificate tblCertificate;

	//bi-directional many-to-one association to TblCertiField
	@ManyToOne
	@JoinColumn(name="CERTI_FIELDS")
	private CertificateField tblCertiField;

	//bi-directional many-to-one association to TblCertiFieldValue
	@OneToMany(mappedBy="tblCertiFieldsReln")
	private List<CertificateFieldValue> tblCertiFieldValues;

	public CertificateFieldRelation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Certificate getTblCertificate() {
		return this.tblCertificate;
	}

	public void setTblCertificate(Certificate tblCertificate) {
		this.tblCertificate = tblCertificate;
	}

	public CertificateField getTblCertiField() {
		return this.tblCertiField;
	}

	public void setTblCertiField(CertificateField tblCertiField) {
		this.tblCertiField = tblCertiField;
	}

	public List<CertificateFieldValue> getTblCertiFieldValues() {
		return this.tblCertiFieldValues;
	}

	public void setTblCertiFieldValues(List<CertificateFieldValue> tblCertiFieldValues) {
		this.tblCertiFieldValues = tblCertiFieldValues;
	}

	public CertificateFieldValue addTblCertiFieldValue(CertificateFieldValue tblCertiFieldValue) {
		getTblCertiFieldValues().add(tblCertiFieldValue);
		tblCertiFieldValue.setTblCertiFieldsReln(this);

		return tblCertiFieldValue;
	}

	public CertificateFieldValue removeTblCertiFieldValue(CertificateFieldValue tblCertiFieldValue) {
		getTblCertiFieldValues().remove(tblCertiFieldValue);
		tblCertiFieldValue.setTblCertiFieldsReln(null);

		return tblCertiFieldValue;
	}

}