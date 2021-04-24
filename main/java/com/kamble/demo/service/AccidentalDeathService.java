/**
 * 
 */
package com.kamble.demo.service;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.LifeInsurance;

/**
 * @author Sanket.Kamble
 *
 */
public interface AccidentalDeathService {

	public void save(AccidentalDeath ad);

	public AccidentalDeath getByLifeInsurance(LifeInsurance li);
}
