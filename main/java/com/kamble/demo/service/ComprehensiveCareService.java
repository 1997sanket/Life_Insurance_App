/**
 * 
 */
package com.kamble.demo.service;

import com.kamble.demo.model.ComprehensiveCare;
import com.kamble.demo.model.LifeInsurance;

/**
 * @author Sanket.Kamble
 *
 */
public interface ComprehensiveCareService {

	public void save(ComprehensiveCare cc);

	public ComprehensiveCare getByLifeInsurance(LifeInsurance li);
}
