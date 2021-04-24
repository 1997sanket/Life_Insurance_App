/**
 * 
 */
package com.kamble.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamble.demo.model.Client;
import com.kamble.demo.model.LifeInsurance;
import com.kamble.demo.repository.LifeInsuranceRepository;

/**
 * @author Sanket.Kamble
 *
 */

@Service
public class LifeInsuranceServiceImpl implements LifeInsuranceService {
	
	@Autowired
	private LifeInsuranceRepository repo;

	@Override
	public void save(LifeInsurance li) {
		// TODO Auto-generated method stub
		repo.save(li);
		
	}

	@Override
	public LifeInsurance getByClient(Client client) {
		// TODO Auto-generated method stub
		return repo.findByClient(client);
	}

	@Override
	public LifeInsurance getById(int lifeInsuranceId) {
		// TODO Auto-generated method stub
		return repo.findById(lifeInsuranceId).get();
	}

}
