package com.example.resultmaker.entity;

import java.util.Date;

import jakarta.persistence.Entity;


public class StudentDetails {
	
	String universityName;
	String seatNo;
	String dob;
	String month_year;
	String CandidateName;
	String motherName;
	int hindi;
	int marathi;
	int english;
	int maths;
	int science;
	int socialScience;
	
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMonth_year() {
		return month_year;
	}
	public void setMonth_year(String month_year) {
		this.month_year = month_year;
	}
	public String getCandidateName() {
		return CandidateName;
	}
	public void setCandidateName(String candidateName) {
		CandidateName = candidateName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getMarathi() {
		return marathi;
	}
	public void setMarathi(int marathi) {
		this.marathi = marathi;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getSocialScience() {
		return socialScience;
	}
	public void setSocialScience(int socialScience) {
		this.socialScience = socialScience;
	}
	@Override
	public String toString() {
		return "StudentDetails [universityName=" + universityName + ", seatNo=" + seatNo + ", dob=" + dob
				+ ", month_year=" + month_year + ", CandidateName=" + CandidateName + ", motherName=" + motherName
				+ ", hindi=" + hindi + ", marathi=" + marathi + ", english=" + english + ", maths=" + maths
				+ ", science=" + science + ", socialScience=" + socialScience + "]";
	}
	
	
}
