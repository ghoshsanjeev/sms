package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the _CERTI_FIELDS_RELN database table.
 * 
 */
@Entity
@Table(name="TBL_CERTI_FIELDS_RELN")
@NamedQuery(name="CertiFieldsReln.findAll", query="SELECT t FROM CertificateFieldRelation t")
public class CertificateFieldRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	//bi-directional many-to-one association to Certificate
	@ManyToOne
	@JoinColumn(name="CERTIFICATE")
	private Certificate certificate;

	//bi-directional many-to-one association to CertiField
	@ManyToOne
	@JoinColumn(name="CERTI_FIELDS")
	private CertificateField certificateField;

	//bi-directional many-to-one association to CertiFieldValue
	@OneToMany(mappedBy="certificateFieldRelation")
	private List<CertificateFieldValue> certiFieldValues;

	public CertificateFieldRelation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Certificate getCertificate() {
		return this.certificate;
	}

	public void setCertificate(Certificate Certificate) {
		this.certificate = Certificate;
	}

	public CertificateField getCertificateField() {
		return this.certificateField;
	}

	public void setCertificateField(CertificateField CertiField) {
		this.certificateField = CertiField;
	}

	public List<CertificateFieldValue> getCertiFieldValues() {
		return this.certiFieldValues;
	}

	public void setCertiFieldValues(List<CertificateFieldValue> CertiFieldValues) {
		this.certiFieldValues = CertiFieldValues;
	}

	public CertificateFieldValue addCertiFieldValue(CertificateFieldValue certiFieldValue) {
		getCertiFieldValues().add(certiFieldValue);
		certiFieldValue.setCertificateFieldRelation(this);

		return certiFieldValue;
	}

	public CertificateFieldValue removeCertiFieldValue(CertificateFieldValue certiFieldValue) {
		getCertiFieldValues().remove(certiFieldValue);
		certiFieldValue.setCertificateFieldRelation(null);

		return certiFieldValue;
	}

}