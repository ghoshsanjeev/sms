package com.batb.sms.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the TBL_STUDENT database table.
 * 
 */
@Entity
@Table(name = "TBL_STUDENT")
@NamedQuery(name = "Student.findAll", query = "SELECT t FROM Student t")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	@Column(name = "ADM_CLASS")
	private int admissionClass;

	@Temporal(TemporalType.DATE)
	@Column(name = "ADM_DATE")
	private Date admissionDate;

	@Column(name = "ADM_SEC")
	private String admissionSection;

	@Column(name = "BORAD_NAME")
	private String boradName;

	private String bpl;

	private String caste;

	@Column(name = "CONT_NO")
	private long contNo;

	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name = "FEE_AMT")
	private double feeAmt;

	@Column(name = "FEES_E_P")
	private String feesEP;

	@Column(name = "GRADE_MP_HS")
	private String gradeMpHs;

	@Column(name = "GUARD_NAME")
	private String guardianName;

	@Column(name = "ID_MARK")
	private String idMark;

	@Column(name = "INST_NAME")
	private String instituteName;

	@Column(name = "LAST_CLASS")
	private int lastClass;

	@Column(name = "ML_STATUS")
	private String maritalStatus;

	@Column(name = "MO_MP_HS")
	private int marksObtainedMpHs;

	@Column(name = "MOTH_NAME")
	private String mothersName;

	@Column(name = "MRK_LAST_CLASS")
	private int marksInLastClass;

	@Column(name = "PRF_APP_FORM")
	private String prfAppForm;

	@Column(name = "PRF_CERTI")
	private String prfCerti;

	@Column(name = "PRF_DOB")
	private String prfDob;

	@Column(name = "PRF_PHOTO")
	private String prfPhoto;

	@Column(name = "R_NO")
	private long registrationNo;

	private String religion;

	@Column(name = "SEX")
	private String gender;

	@Column(name = "SL_NO")
	private long slNo;

	@Column(name = "STD_ROLL_NO")
	private int stdRollNo;

	@Column(name = "STDNT_NAME")
	private String name;

	@Column(name = "STREEM")
	private String stream;

	private String subject;

	// bi-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name = "CURRENT_ADDRESS")
	private Address currentAddress;

	// uni-directional many-to-one association to Address
	@ManyToOne
	@JoinColumn(name = "PERMANENT_ADDRESS")
	private Address permanentAddress;

	// bi-directional many-to-one association to CertiFieldValue
	@OneToMany(mappedBy = "student")
	private List<CertificateFieldValue> certificateFieldValues;

	// bi-directional many-to-one association to StdAcaPerfHist
	@OneToMany(mappedBy = "student")
	private List<StudentAcademicPreformanceHistory> studentAcademicPreformanceHistorys;

	// bi-directional many-to-one association to StdAttnd
	@OneToMany(mappedBy = "student")
	private List<StudentAttendance> studentAttendances;

	// bi-directional many-to-one association to StdCurrStd
	@OneToOne(mappedBy = "student")
	private StudentCurrentStandard studentCurrentStandard;

	// bi-directional many-to-one association to StdCurrStdPerf
	@OneToMany(mappedBy = "student")
	private List<StudentCurrentStandardPerformance> studentCurrentStandardPerformances;

	public Student() {
	}

	public String getAdmissionSection() {
		return admissionSection;
	}

	public void setAdmissionSection(String admissionSection) {
		this.admissionSection = admissionSection;
	}

	public List<CertificateFieldValue> getCertificateFieldValues() {
		return certificateFieldValues;
	}

	public void setCertificateFieldValues(List<CertificateFieldValue> certificateFieldValues) {
		this.certificateFieldValues = certificateFieldValues;
	}

	public List<StudentAcademicPreformanceHistory> getStudentAcademicPreformanceHistorys() {
		return studentAcademicPreformanceHistorys;
	}

	public void setStudentAcademicPreformanceHistorys(
			List<StudentAcademicPreformanceHistory> studentAcademicPreformanceHistorys) {
		this.studentAcademicPreformanceHistorys = studentAcademicPreformanceHistorys;
	}

	public StudentCurrentStandard getStudentCurrentStandard() {
		return studentCurrentStandard;
	}

	public void setStudentCurrentStandard(StudentCurrentStandard studentCurrentStandard) {
		this.studentCurrentStandard = studentCurrentStandard;
	}

	public List<StudentCurrentStandardPerformance> getStudentCurrentStandardPerformances() {
		return studentCurrentStandardPerformances;
	}

	public void setStudentCurrentStandardPerformances(
			List<StudentCurrentStandardPerformance> studentCurrentStandardPerformances) {
		this.studentCurrentStandardPerformances = studentCurrentStandardPerformances;
	}

	public List<StudentAttendance> getStudentAttendances() {
		return studentAttendances;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getAdmissionClass() {
		return this.admissionClass;
	}

	public void setAdmissionClass(int admissionClass) {
		this.admissionClass = admissionClass;
	}

	public Date getAdmissionDate() {
		return this.admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
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

	public long getContNo() {
		return this.contNo;
	}

	public void setContNo(long contNo) {
		this.contNo = contNo;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public double getFeeAmt() {
		return this.feeAmt;
	}

	public void setFeeAmt(double feeAmt) {
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

	public String getGuardianName() {
		return this.guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getIdMark() {
		return this.idMark;
	}

	public void setIdMark(String idMark) {
		this.idMark = idMark;
	}

	public String getInstituteName() {
		return this.instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public int getLastClass() {
		return this.lastClass;
	}

	public void setLastClass(int lastClass) {
		this.lastClass = lastClass;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getMarksObtainedMpHs() {
		return this.marksObtainedMpHs;
	}

	public void setMarksObtainedMpHs(int marksObtainedMpHs) {
		this.marksObtainedMpHs = marksObtainedMpHs;
	}

	public String getMothersName() {
		return this.mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public int getMarksInLastClass() {
		return this.marksInLastClass;
	}

	public void setMarksInLastClass(int marksInLastClass) {
		this.marksInLastClass = marksInLastClass;
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

	public long getRegistrationNo() {
		return this.registrationNo;
	}

	public void setRegistrationNo(long registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getSlNo() {
		return this.slNo;
	}

	public void setSlNo(long slNo) {
		this.slNo = slNo;
	}

	public int getStdRollNo() {
		return this.stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Address getCurrentAddress() {
		return this.currentAddress;
	}

	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}

	public Address getPermanentAddress() {
		return this.permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
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

	public StudentAcademicPreformanceHistory addStudentAcademicPreformanceHistory(
			StudentAcademicPreformanceHistory StdAcaPerfHist) {
		getStudentAcademicPreformanceHistory().add(StdAcaPerfHist);
		StdAcaPerfHist.setStudent(this);

		return StdAcaPerfHist;
	}

	public StudentAcademicPreformanceHistory removeStudentAcademicPreformanceHistory(
			StudentAcademicPreformanceHistory StdAcaPerfHist) {
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

	public StudentCurrentStandard getStudentCurrentStandards() {
		return this.studentCurrentStandard;
	}

	public void setStdCurrStds(StudentCurrentStandard StdCurrStd) {
		this.studentCurrentStandard = StdCurrStd;
	}

	public List<StudentCurrentStandardPerformance> getStudentCurrentStandardPerformance() {
		return this.studentCurrentStandardPerformances;
	}

	public void setStudentCurrentStandardPerformance(List<StudentCurrentStandardPerformance> StdCurrStdPerfs) {
		this.studentCurrentStandardPerformances = StdCurrStdPerfs;
	}

	public StudentCurrentStandardPerformance addStudentCurrentStandardPerformance(
			StudentCurrentStandardPerformance StdCurrStdPerf) {
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