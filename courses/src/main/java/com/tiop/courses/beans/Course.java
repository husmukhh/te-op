package com.tiop.courses.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="university_course_attribute")
public class Course {

	@Id 
	@Column(name = "c_id")
	private long id;
	@Column(name="Courses")
	private String name ;
	@Column(name="Course_Type")
	private String coursType;
	@Column(name="University")
	private String institute;
	@Column(name="City")
	private String city;
	@Column(name="Country")
	private String country;
	@Column(name="Faculty")
	private String faculty;
	@Column(name="World_Ranking")
	private int ranking;
	@Column(name="Recognition")
	private String recognation;
	@Column(name="Recognition_Type")
	private String recognationType;
	@Column(name="Int_Fees")
	private double internatFee;
	@Column(name="Currency")
	private String currency;
	@Column(name="Duration")
	private String duration; 
	@Column(name="Cost_Range")
	private String costRange; 
	@Column(name="study_mode")
	private int studyMode; 
	@Column(name="part_full")
	private int partFul;
	@Column(name="stars")
	private float stars;
	@Column(name="Local_Fees")
	private double localFees;
	@Column(name="WR_Range")
	private String rankingRange;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;  
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoursType() {
		return coursType;
	}
	public void setCoursType(String coursType) {
		this.coursType = coursType;
	}
	public String getInstitute() {
		return institute;
	}
	public void setInstitute(String institute) {
		this.institute = institute;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getRecognation() {
		return recognation;
	}
	public void setRecognation(String recognation) {
		this.recognation = recognation;
	}
	public String getRecognationType() {
		return recognationType;
	}
	public void setRecognationType(String recognationType) {
		this.recognationType = recognationType;
	}
	public double getInternatFee() {
		return internatFee;
	}
	public void setInternatFee(double internatFee) {
		this.internatFee = internatFee;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCostRange() {
		return costRange;
	}
	public void setCostRange(String costRange) {
		this.costRange = costRange;
	}
	public int getStudyMode() {
		return studyMode;
	}
	public void setStudyMode(int studyMode) {
		this.studyMode = studyMode;
	}
	public int getPartFul() {
		return partFul;
	}
	public void setPartFul(int partFul) {
		this.partFul = partFul;
	}
	public float getStars() {
		return stars;
	}
	public void setStars(float stars) {
		this.stars = stars;
	}
	public double getLocalFees() {
		return localFees;
	}
	public void setLocalFees(double localFees) {
		this.localFees = localFees;
	}
	public String getRankingRange() {
		return rankingRange;
	}
	public void setRankingRange(String rankingRange) {
		this.rankingRange = rankingRange;
	}

	
	
}
