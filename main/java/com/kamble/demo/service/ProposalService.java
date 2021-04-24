/**
 * 
 */
package com.kamble.demo.service;

import java.util.List;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.Proposal;

/**
 * @author Sanket.Kamble
 *
 */
public interface ProposalService {

	public Proposal save(Proposal proposal);

	public Proposal getByAccidentalDeath(AccidentalDeath ad);

	public List<Proposal> getAll();

	public Proposal getById(int id);

	public List<Proposal> getListOfPolicies();

	public List<Proposal> getListOfRejectedProposals();

	public List<Proposal> getAllProposals();
}
