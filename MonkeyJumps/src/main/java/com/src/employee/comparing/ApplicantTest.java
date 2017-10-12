package com.src.employee.comparing;

import java.util.ArrayList;
import java.util.List;

public class ApplicantTest {

	static List<Applicant> uniqueApplicants = new ArrayList<>();

	public static void main(String[] args) {
		List<Applicant> applicantList = new ArrayList<>();
		Applicant rajesh = new Applicant("535", "Rajesh Muniganti", "CGI");
		Applicant praneeth = new Applicant("536", "Rajesh Muniganti", "CGI");
		Applicant naresh = new Applicant("537", "Naresh Su", "CGI");
		Applicant kapil = new Applicant("538", "Kapilesh Muni", "CGI");
		applicantList.add(rajesh);
		applicantList.add(praneeth);
		applicantList.add(naresh);
		applicantList.add(kapil);
		applicantList = compareApplicants(applicantList, rajesh);
		for (Applicant applicant : applicantList) {
			if (applicant.getApplicantID().equals("535")) {
				System.out.println(applicant);
			}
		}
	}

	private static List<Applicant> compareApplicants(List<Applicant> applicantList, Applicant rajesh) {
		for (Applicant applicant : applicantList) {
			if (applicant.equals(rajesh)) {
				applicant.getApplicantIDs().add(rajesh.getApplicantID());
			}
		}
		return applicantList;
	}

}
