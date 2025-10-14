package com.example.demo.streams;

import java.time.LocalDate;
import java.util.Objects;

public class BloodDonor {

	
	private int donorId;
	private String donorName;
	private int donorAge;
	private LocalDate lastDonated;
	private BloodGroup bloodGroup;
	private long mobileNumber;
	
	public BloodDonor() {
		super();
	}

	public BloodDonor(int donorId, String donorName, int donorAge, LocalDate lastDonated, BloodGroup bloodGroup,
			long mobileNumber) {
		super();
		this.donorId = donorId;
		this.donorName = donorName;
		this.donorAge = donorAge;
		this.lastDonated = lastDonated;
		this.bloodGroup = bloodGroup;
		this.mobileNumber = mobileNumber;
	}

	public int getDonorId() {
		return donorId;
	}

	public void setDonorId(int donorId) {
		this.donorId = donorId;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public int getDonorAge() {
		return donorAge;
	}

	public void setDonorAge(int donorAge) {
		this.donorAge = donorAge;
	}

	public LocalDate getLastDonated() {
		return lastDonated;
	}

	public void setLastDonated(LocalDate lastDonated) {
		this.lastDonated = lastDonated;
	}

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(bloodGroup, donorAge, donorId, donorName, lastDonated, mobileNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BloodDonor other = (BloodDonor) obj;
		return bloodGroup == other.bloodGroup && donorAge == other.donorAge && donorId == other.donorId
				&& Objects.equals(donorName, other.donorName) && Objects.equals(lastDonated, other.lastDonated)
				&& mobileNumber == other.mobileNumber;
	}

	@Override
	public String toString() {
		return "BloodDonor [donorId=" + donorId + ", donorName=" + donorName + ", donorAge=" + donorAge
				+ ", lastDonated=" + lastDonated + ", bloodGroup=" + bloodGroup + ", mobileNumber=" + mobileNumber
				+ "]";
	}
	
	
	
}
