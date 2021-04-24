/**
 * 
 */
package com.kamble.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.LifeInsurance;
import com.kamble.demo.repository.AccidentalDeathRepository;

/**
 * @author Sanket.Kamble
 *
 */

@Service
public class AccidentalDeathServiceImpl implements AccidentalDeathService {
	
	@Autowired
	private AccidentalDeathRepository accidentalDeathRepo;

	@Override
	public void save(AccidentalDeath ad) {
		// TODO Auto-generated method stub

		accidentalDeathRepo.save(ad);
	}

	@Override
	public AccidentalDeath getByLifeInsurance(LifeInsurance li) {
		// TODO Auto-generated method stub
		return accidentalDeathRepo.findByLifeInsurance(li);
	}

}
