package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the TBL_CERTIFICATE database table.
 * 
 */
@Entity
@Table(name="TBL_CERTIFICATE")
@NamedQuery(name="TblCertificate.findAll", query="SELECT t FROM Certificate t")
public class Certificate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="CERTI_NAME")
	private String certiName;

	//bi-directional many-to-one association to TblCertiFieldsReln
	@OneToMany(mappedBy="tblCertificate")
	private List<CertificateFieldRelation> tblCertiFieldsRelns;

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

	public List<CertificateFieldRelation> getTblCertiFieldsRelns() {
		return this.tblCertiFieldsRelns;
	}

	public void setTblCertiFieldsRelns(List<CertificateFieldRelation> tblCertiFieldsRelns) {
		this.tblCertiFieldsRelns = tblCertiFieldsRelns;
	}

	public CertificateFieldRelation addTblCertiFieldsReln(CertificateFieldRelation tblCertiFieldsReln) {
		getTblCertiFieldsRelns().add(tblCertiFieldsReln);
		tblCertiFieldsReln.setTblCertificate(this);

		return tblCertiFieldsReln;
	}

	public CertificateFieldRelation removeTblCertiFieldsReln(CertificateFieldRelation tblCertiFieldsReln) {
		getTblCertiFieldsRelns().remove(tblCertiFieldsReln);
		tblCertiFieldsReln.setTblCertificate(null);

		return tblCertiFieldsReln;
	}

}