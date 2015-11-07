package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the _CERTIFICATE database table.
 * 
 */
@Entity
@Table(name="TBL_CERTIFICATE")
@NamedQuery(name="Certificate.findAll", query="SELECT t FROM Certificate t")
public class Certificate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="CERTI_NAME")
	private String certiName;

	//bi-directional many-to-one association to CertiFieldsReln
	@OneToMany(mappedBy="certificate")
	private List<CertificateFieldRelation> certificateFieldRelations;

	public Certificate() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCertiName() {
		return this.certiName;
	}

	public void setCertiName(String certiName) {
		this.certiName = certiName;
	}

	public List<CertificateFieldRelation> getCertiFieldsRelns() {
		return this.certificateFieldRelations;
	}

	public void setCertiFieldsRelns(List<CertificateFieldRelation> CertiFieldsRelns) {
		this.certificateFieldRelations = CertiFieldsRelns;
	}

	public CertificateFieldRelation addCertiFieldsReln(CertificateFieldRelation CertiFieldsReln) {
		getCertiFieldsRelns().add(CertiFieldsReln);
		CertiFieldsReln.setCertificate(this);

		return CertiFieldsReln;
	}

	public CertificateFieldRelation removeCertiFieldsReln(CertificateFieldRelation CertiFieldsReln) {
		getCertiFieldsRelns().remove(CertiFieldsReln);
		CertiFieldsReln.setCertificate(null);

		return CertiFieldsReln;
	}

}