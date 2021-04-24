/**
 * 
 */
package com.kamble.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamble.demo.model.ComprehensiveCare;
import com.kamble.demo.model.LifeInsurance;
import com.kamble.demo.repository.ComprehensiveCareRepo;

/**
 * @author Sanket.Kamble
 *
 */

@Service
public class ComprehensiveCareServiceImpl implements ComprehensiveCareService {
	
	@Autowired
	private ComprehensiveCareRepo comprehensiveCareRepo;

	@Override
	public void save(ComprehensiveCare cc) {
		// TODO Auto-generated method stub
		
		comprehensiveCareRepo.save(cc);

	}

	@Override
	public ComprehensiveCare getByLifeInsurance(LifeInsurance li) {
		// TODO Auto-generated method stub
		return comprehensiveCareRepo.findByLifeInsurance(li);
	}

}
