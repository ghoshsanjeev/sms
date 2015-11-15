package com.batb.sms.dto;

/**
 * 
 * @author Sanjib
 *
 */
public class AddressDTO {

	private String addressLine1;
	private String addressLine2;
	private String streetName;
	private String villageOrTown;
	private String state;
	private String city;
	private String postOffice;
	private String policeStation;
	private String district;
	private String pincode;

	/**
	 * @return the addressLine1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * @param addressLine1
	 *            the addressLine1 to set
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * @return the addressLine2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * @param addressLine2
	 *            the addressLine2 to set
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName
	 *            the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the villageOrTown
	 */
	public String getVillageOrTown() {
		return villageOrTown;
	}

	/**
	 * @param villageOrTown
	 *            the villageOrTown to set
	 */
	public void setVillageOrTown(String villageOrTown) {
		this.villageOrTown = villageOrTown;
	}
	
	

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the postOffice
	 */
	public String getPostOffice() {
		return postOffice;
	}

	/**
	 * @param postOffice
	 *            the postOffice to set
	 */
	public void setPostOffice(String postOffice) {
		this.postOffice = postOffice;
	}

	/**
	 * @return the policeStation
	 */
	public String getPoliceStation() {
		return policeStation;
	}

	/**
	 * @param policeStation
	 *            the policeStation to set
	 */
	public void setPoliceStation(String policeStation) {
		this.policeStation = policeStation;
	}

	/**
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}

	/**
	 * @param district
	 *            the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}

	/**
	 * @param pincode
	 *            the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address[addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", streetName="
				+ streetName + ", villageOrTown=" + villageOrTown + ", state=" + state + ", city=" + city
				+ ", postOffice=" + postOffice + ", policeStation=" + policeStation + ", district=" + district
				+ ", pincode=" + pincode + "]";
	}


	
	
	

}
