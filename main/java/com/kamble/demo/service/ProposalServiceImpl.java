/**
 * 
 */
package com.kamble.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.Proposal;

/**
 * @author Sanket.Kamble
 *
 */

@Service
public class ProposalServiceImpl implements ProposalService {
	
	@Autowired
	private ProposalServiceRepo proposalServiceRepo;

	@Override
	public Proposal save(Proposal proposal) {
		// TODO Auto-generated method stub
		return proposalServiceRepo.save(proposal);
	}

	@Override
	public Proposal getByAccidentalDeath(AccidentalDeath ad) {
		// TODO Auto-generated method stub
		return proposalServiceRepo.findByAccidentalDeath(ad);
	}

	@Override
	public List<Proposal> getAll() {
		// TODO Auto-generated method stub
		return proposalServiceRepo.findAll();
	}

	@Override
	public Proposal getById(int id) {
		// TODO Auto-generated method stub
		return proposalServiceRepo.findById(id).get();
	}

	@Override
	public List<Proposal> getListOfPolicies() {
		// TODO Auto-generated method stub
		return proposalServiceRepo.getListOfPolicies();
	}

	@Override
	public List<Proposal> getListOfRejectedProposals() {
		// TODO Auto-generated method stub
		return proposalServiceRepo.getListOfRejectedProposals();
	}

	@Override
	public List<Proposal> getAllProposals() {
		// TODO Auto-generated method stub
		return proposalServiceRepo.getAllProposals();
	}

}
