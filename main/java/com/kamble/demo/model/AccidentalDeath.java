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
public class AccidentalDeath {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double coverageAmount;
	
	private double premium;
	
	
	
	@OneToOne
	private LifeInsurance lifeInsurance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public LifeInsurance getLifeInsurance() {
		return lifeInsurance;
	}

	public void setLifeInsurance(LifeInsurance lifeInsurance) {
		this.lifeInsurance = lifeInsurance;
	}
	

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "AccidentalDeath [id=" + id + ", coverageAmount=" + coverageAmount + ", premium=" + premium
				+ ", lifeInsurance=" + lifeInsurance + "]";
	}

	
	
	

}
