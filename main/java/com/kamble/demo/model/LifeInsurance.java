/**
 * 
 */
package com.kamble.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * @author Sanket.Kamble
 *
 */

@Entity
public class LifeInsurance {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne //1 life insurance can belong to 1 client
	private Client client;
	
	private String firstName;
	
	private String lastName;
	
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate DOB;
	
	private int age;
	
	private String mobile;
	
	private String gender;
	
	private String consumeTobacco;
	
	private double annualIncome;
	
	private long coverAmount;
	
	private int coverUpToAge;
	
	private double premium;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDOB() {
		return DOB;
	}

	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getConsumeTobacco() {
		return consumeTobacco;
	}

	public void setConsumeTobacco(String consumeTobacco) {
		this.consumeTobacco = consumeTobacco;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public long getCoverAmount() {
		return coverAmount;
	}

	public void setCoverAmount(long coverAmount) {
		this.coverAmount = coverAmount;
	}

	public int getCoverUpToAge() {
		return coverUpToAge;
	}

	public void setCoverUpToAge(int coverUpToAge) {
		this.coverUpToAge = coverUpToAge;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "LifeInsurance [id=" + id + ", client=" + client + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", DOB=" + DOB + ", age=" + age + ", mobile=" + mobile + ", gender=" + gender + ", consumeTobacco="
				+ consumeTobacco + ", annualIncome=" + annualIncome + ", coverAmount=" + coverAmount + ", coverUpToAge="
				+ coverUpToAge + ", premium=" + premium + "]";
	}


	
	
	
}
