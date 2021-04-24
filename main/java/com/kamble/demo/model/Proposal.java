/**
 * 
 */
package com.kamble.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Sanket.Kamble
 *
 */

@Entity
public class Proposal {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private LifeInsurance lifeInsurance;
	
	@OneToOne
	private AccidentalDeath accidentalDeath;
	
	@OneToOne
	private ComprehensiveCare comprehensiveCare;
	
	
	
	private String city;
	
	private String education;
	
	private String occupation;
	
	private String paymentMode;
	
	private double finalPremium;
	
	private String isItAPolicy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LifeInsurance getLifeInsurance() {
		return lifeInsurance;
	}

	public void setLifeInsurance(LifeInsurance lifeInsurance) {
		this.lifeInsurance = lifeInsurance;
	}

	public AccidentalDeath getAccidentalDeath() {
		return accidentalDeath;
	}

	public void setAccidentalDeath(AccidentalDeath accidentalDeath) {
		this.accidentalDeath = accidentalDeath;
	}

	public ComprehensiveCare getComprehensiveCare() {
		return comprehensiveCare;
	}

	public void setComprehensiveCare(ComprehensiveCare comprehensiveCare) {
		this.comprehensiveCare = comprehensiveCare;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public double getFinalPremium() {
		return finalPremium;
	}

	public void setFinalPremium(double finalPremium) {
		this.finalPremium = finalPremium;
	}

	public String getIsItAPolicy() {
		return isItAPolicy;
	}

	public void setIsItAPolicy(String isItAPolicy) {
		this.isItAPolicy = isItAPolicy;
	}

	@Override
	public String toString() {
		return "Proposal [id=" + id + ", lifeInsurance=" + lifeInsurance + ", accidentalDeath=" + accidentalDeath
				+ ", comprehensiveCare=" + comprehensiveCare + ", city=" + city + ", education=" + education
				+ ", occupation=" + occupation + ", paymentMode=" + paymentMode + ", finalPremium=" + finalPremium
				+ ", isItAPolicy=" + isItAPolicy + "]";
	}


	
	
	
}
