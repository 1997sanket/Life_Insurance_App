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
public class ComprehensiveCare {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne //Only 1 comprehensive care can belong to 1 life insurance
	private LifeInsurance lifeInsurance;
	
	private double coverageAmount;
	
	private double premium;

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

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	@Override
	public String toString() {
		return "ComprehensiveCare [id=" + id + ", lifeInsurance=" + lifeInsurance + ", coverageAmount=" + coverageAmount
				+ ", premium=" + premium + "]";
	}
	
	
}
