/**
 * 
 */
package com.kamble.demo.service;

import com.kamble.demo.model.Client;
import com.kamble.demo.model.LifeInsurance;

/**
 * @author Sanket.Kamble
 *
 */

public interface LifeInsuranceService {

	public void save(LifeInsurance li);

	public LifeInsurance getByClient(Client client);

	public LifeInsurance getById(int lifeInsuranceId);
}
