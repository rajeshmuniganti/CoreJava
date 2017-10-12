package com.src.employee.comparing;

import java.util.List;

public class Applicant {
	private String applicantID;
	private String applicantName;
	private String applicantAddress;
	private List<String> applicantIDs;

	public String getApplicantID() {
		return applicantID;
	}

	public void setApplicantID(String applicantID) {
		this.applicantID = applicantID;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantAddress() {
		return applicantAddress;
	}

	public void setApplicantAddress(String applicantAddress) {
		this.applicantAddress = applicantAddress;
	}

	public Applicant(String applicantID, String applicantName, String applicantAddress) {
		super();
		this.applicantID = applicantID;
		this.applicantName = applicantName;
		this.applicantAddress = applicantAddress;
	}

	public List<String> getApplicantIDs() {
		return applicantIDs;
	}

	public void setApplicantIDs(List<String> applicantIDs) {
		this.applicantIDs = applicantIDs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicantAddress == null) ? 0 : applicantAddress.hashCode());
		result = prime * result + ((applicantName == null) ? 0 : applicantName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Applicant other = (Applicant) obj;
		if (applicantAddress == null) {
			if (other.applicantAddress != null)
				return false;
		} else if (!applicantAddress.equals(other.applicantAddress))
			return false;
		if (applicantName == null) {
			if (other.applicantName != null)
				return false;
		} else if (!applicantName.equals(other.applicantName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Applicant [applicantID=" + applicantID + ", applicantName=" + applicantName + ", applicantAddress="
				+ applicantAddress + ", applicantIDs=" + applicantIDs + "]";
	}

}
