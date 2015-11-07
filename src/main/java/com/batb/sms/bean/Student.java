package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the _STUDENT database table.
 * 
 */
@Entity
@Table(name="TBL_STUDENT")
@NamedQuery(name="Student.findAll", query="SELECT t FROM Student t")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@Column(name="ADD_DISTRICT")
	private String addDistrict;

	@Column(name="ADD_PIN")
	private BigDecimal addPin;

	@Column(name="ADD_PO")
	private String addPo;

	@Column(name="ADD_PS")
	private String addPs;

	@Column(name="ADD_VILL")
	private String addVill;

	@Column(name="ADM_CLASS")
	private BigDecimal admClass;

	@Temporal(TemporalType.DATE)
	@Column(name="ADM_DATE")
	private Date admDate;

	@Column(name="ADM_SEC")
	private String admSec;

	@Column(name="BORAD_NAME")
	private String boradName;

	private String bpl;

	private String caste;

	@Column(name="CONT_NO")
	private BigDecimal contNo;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="FEE_AMT")
	private BigDecimal feeAmt;

	@Column(name="FEES_E_P")
	private String feesEP;

	@Column(name="GRADE_MP_HS")
	private String gradeMpHs;

	@Column(name="GUARD_NAME")
	private String guardName;

	@Column(name="ID_Mark")
	private String ID_Mark;

	@Column(name="INST_NAME")
	private String instName;

	@Column(name="LAST_CLASS")
	private BigDecimal lastClass;

	@Column(name="ML_STATUS")
	private String mlStatus;

	@Column(name="MO_MP_HS")
	private BigDecimal moMpHs;

	@Column(name="MOTH_NAME")
	private String mothName;

	@Column(name="MRK_LAST_CLASS")
	private BigDecimal mrkLastClass;

	@Column(name="PRF_APP_FORM")
	private String prfAppForm;

	@Column(name="PRF_CERTI")
	private String prfCerti;

	@Column(name="PRF_DOB")
	private String prfDob;

	@Column(name="PRF_PHOTO")
	private String prfPhoto;

	@Column(name="R_NO")
	private BigDecimal rNo;

	private String religion;

	private String sex;

	@Column(name="SL_NO")
	private BigDecimal slNo;

	@Column(name="STD_ROLL_NO")
	private BigDecimal stdRollNo;

	@Column(name="STDNT_NAME")
	private String stdntName;

	private String streem;

	private String subject;

	//bi-directional many-to-one association to CertiFieldValue
	@OneToMany(mappedBy="student")
	private List<CertificateFieldValue> certificateFieldValues;

	//bi-directional many-to-one association to StdAcaPerfHist
	@OneToMany(mappedBy="student")
	private List<StudentAcademicPreformanceHistory> studentAcademicPreformanceHistorys;

	//bi-directional many-to-one association to StdAttnd
	@OneToMany(mappedBy="student")
	private List<StudentAttendance> studentAttendances;

	//bi-directional many-to-one association to StdCurrStd
	@OneToMany(mappedBy="student")
	private List<StudentCurrentStandard> studentCurrentStandards;

	//bi-directional many-to-one association to StdCurrStdPerf
	@OneToMany(mappedBy="student")
	private List<StudentCurrentStandardPerformance> studentCurrentStandardPerformances;

	public Student() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAddDistrict() {
		return this.addDistrict;
	}

	public void setAddDistrict(String addDistrict) {
		this.addDistrict = addDistrict;
	}

	public BigDecimal getAddPin() {
		return this.addPin;
	}

	public void setAddPin(BigDecimal addPin) {
		this.addPin = addPin;
	}

	public String getAddPo() {
		return this.addPo;
	}

	public void setAddPo(String addPo) {
		this.addPo = addPo;
	}

	public String getAddPs() {
		return this.addPs;
	}

	public void setAddPs(String addPs) {
		this.addPs = addPs;
	}

	public String getAddVill() {
		return this.addVill;
	}

	public void setAddVill(String addVill) {
		this.addVill = addVill;
	}

	public BigDecimal getAdmClass() {
		return this.admClass;
	}

	public void setAdmClass(BigDecimal admClass) {
		this.admClass = admClass;
	}

	public Date getAdmDate() {
		return this.admDate;
	}

	public void setAdmDate(Date admDate) {
		this.admDate = admDate;
	}

	public String getAdmSec() {
		return this.admSec;
	}

	public void setAdmSec(String admSec) {
		this.admSec = admSec;
	}

	public String getBoradName() {
		return this.boradName;
	}

	public void setBoradName(String boradName) {
		this.boradName = boradName;
	}

	public String getBpl() {
		return this.bpl;
	}

	public void setBpl(String bpl) {
		this.bpl = bpl;
	}

	public String getCaste() {
		return this.caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public BigDecimal getContNo() {
		return this.contNo;
	}

	public void setContNo(BigDecimal contNo) {
		this.contNo = contNo;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public BigDecimal getFeeAmt() {
		return this.feeAmt;
	}

	public void setFeeAmt(BigDecimal feeAmt) {
		this.feeAmt = feeAmt;
	}

	public String getFeesEP() {
		return this.feesEP;
	}

	public void setFeesEP(String feesEP) {
		this.feesEP = feesEP;
	}

	public String getGradeMpHs() {
		return this.gradeMpHs;
	}

	public void setGradeMpHs(String gradeMpHs) {
		this.gradeMpHs = gradeMpHs;
	}

	public String getGuardName() {
		return this.guardName;
	}

	public void setGuardName(String guardName) {
		this.guardName = guardName;
	}

	public String getID_Mark() {
		return this.ID_Mark;
	}

	public void setID_Mark(String ID_Mark) {
		this.ID_Mark = ID_Mark;
	}

	public String getInstName() {
		return this.instName;
	}

	public void setInstName(String instName) {
		this.instName = instName;
	}

	public BigDecimal getLastClass() {
		return this.lastClass;
	}

	public void setLastClass(BigDecimal lastClass) {
		this.lastClass = lastClass;
	}

	public String getMlStatus() {
		return this.mlStatus;
	}

	public void setMlStatus(String mlStatus) {
		this.mlStatus = mlStatus;
	}

	public BigDecimal getMoMpHs() {
		return this.moMpHs;
	}

	public void setMoMpHs(BigDecimal moMpHs) {
		this.moMpHs = moMpHs;
	}

	public String getMothName() {
		return this.mothName;
	}

	public void setMothName(String mothName) {
		this.mothName = mothName;
	}

	public BigDecimal getMrkLastClass() {
		return this.mrkLastClass;
	}

	public void setMrkLastClass(BigDecimal mrkLastClass) {
		this.mrkLastClass = mrkLastClass;
	}

	public String getPrfAppForm() {
		return this.prfAppForm;
	}

	public void setPrfAppForm(String prfAppForm) {
		this.prfAppForm = prfAppForm;
	}

	public String getPrfCerti() {
		return this.prfCerti;
	}

	public void setPrfCerti(String prfCerti) {
		this.prfCerti = prfCerti;
	}

	public String getPrfDob() {
		return this.prfDob;
	}

	public void setPrfDob(String prfDob) {
		this.prfDob = prfDob;
	}

	public String getPrfPhoto() {
		return this.prfPhoto;
	}

	public void setPrfPhoto(String prfPhoto) {
		this.prfPhoto = prfPhoto;
	}

	public BigDecimal getRNo() {
		return this.rNo;
	}

	public void setRNo(BigDecimal rNo) {
		this.rNo = rNo;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public BigDecimal getSlNo() {
		return this.slNo;
	}

	public void setSlNo(BigDecimal slNo) {
		this.slNo = slNo;
	}

	public BigDecimal getStdRollNo() {
		return this.stdRollNo;
	}

	public void setStdRollNo(BigDecimal stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public String getStdntName() {
		return this.stdntName;
	}

	public void setStdntName(String stdntName) {
		this.stdntName = stdntName;
	}

	public String getStreem() {
		return this.streem;
	}

	public void setStreem(String streem) {
		this.streem = streem;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public List<CertificateFieldValue> getCertiFieldValues() {
		return this.certificateFieldValues;
	}

	public void setCertiFieldValues(List<CertificateFieldValue> CertiFieldValues) {
		this.certificateFieldValues = CertiFieldValues;
	}

	public CertificateFieldValue addCertiFieldValue(CertificateFieldValue CertiFieldValue) {
		getCertiFieldValues().add(CertiFieldValue);
		CertiFieldValue.setStudent(this);

		return CertiFieldValue;
	}

	public CertificateFieldValue removeCertiFieldValue(CertificateFieldValue CertiFieldValue) {
		getCertiFieldValues().remove(CertiFieldValue);
		CertiFieldValue.setStudent(null);

		return CertiFieldValue;
	}

	public List<StudentAcademicPreformanceHistory> getStudentAcademicPreformanceHistory() {
		return this.studentAcademicPreformanceHistorys;
	}

	public void setStudentAcademicPreformanceHistory(List<StudentAcademicPreformanceHistory> StdAcaPerfHists) {
		this.studentAcademicPreformanceHistorys = StdAcaPerfHists;
	}

	public StudentAcademicPreformanceHistory addStudentAcademicPreformanceHistory(StudentAcademicPreformanceHistory StdAcaPerfHist) {
		getStudentAcademicPreformanceHistory().add(StdAcaPerfHist);
		StdAcaPerfHist.setStudent(this);

		return StdAcaPerfHist;
	}

	public StudentAcademicPreformanceHistory removeStudentAcademicPreformanceHistory(StudentAcademicPreformanceHistory StdAcaPerfHist) {
		getStudentAcademicPreformanceHistory().remove(StdAcaPerfHist);
		StdAcaPerfHist.setStudent(null);

		return StdAcaPerfHist;
	}

	
	
	public List<StudentAttendance> getStudentAttendance() {
		return this.studentAttendances;
	}

	public void setStudentAttendances(List<StudentAttendance> StdAttnds) {
		this.studentAttendances = StdAttnds;
	}

	public StudentAttendance addStudentAttendance(StudentAttendance StdAttnd) {
		getStudentAttendance().add(StdAttnd);
		StdAttnd.setStudent(this);

		return StdAttnd;
	}

	public StudentAttendance removeStudentAttendance(StudentAttendance StdAttnd) {
		getStudentAttendance().remove(StdAttnd);
		StdAttnd.setStudent(null);

		return StdAttnd;
	}

	public List<StudentCurrentStandard> getStudentCurrentStandards() {
		return this.studentCurrentStandards;
	}

	public void setStdCurrStds(List<StudentCurrentStandard> StdCurrStds) {
		this.studentCurrentStandards = StdCurrStds;
	}

	public StudentCurrentStandard addStdCurrStd(StudentCurrentStandard StdCurrStd) {
		getStudentCurrentStandards().add(StdCurrStd);
		StdCurrStd.setStudent(this);

		return StdCurrStd;
	}

	public StudentCurrentStandard removeStdCurrStd(StudentCurrentStandard StdCurrStd) {
		getStudentCurrentStandards().remove(StdCurrStd);
		StdCurrStd.setStudent(null);

		return StdCurrStd;
	}

	public List<StudentCurrentStandardPerformance> getStudentCurrentStandardPerformance() {
		return this.studentCurrentStandardPerformances;
	}

	public void setStudentCurrentStandardPerformance(List<StudentCurrentStandardPerformance> StdCurrStdPerfs) {
		this.studentCurrentStandardPerformances = StdCurrStdPerfs;
	}

	public StudentCurrentStandardPerformance addStudentCurrentStandardPerformance(StudentCurrentStandardPerformance StdCurrStdPerf) {
		getStudentCurrentStandardPerformance().add(StdCurrStdPerf);
		StdCurrStdPerf.setStudent(this);

		return StdCurrStdPerf;
	}

	public StudentCurrentStandardPerformance removeStdCurrStdPerf(StudentCurrentStandardPerformance StdCurrStdPerf) {
		getStudentCurrentStandardPerformance().remove(StdCurrStdPerf);
		StdCurrStdPerf.setStudent(null);

		return StdCurrStdPerf;
	}

}