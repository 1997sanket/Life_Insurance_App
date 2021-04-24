/**
 * 
 */
package com.kamble.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.Proposal;

/**
 * @author Sanket.Kamble
 *
 */

@Repository
public interface ProposalServiceRepo extends JpaRepository<Proposal, Integer> {

	Proposal findByAccidentalDeath(AccidentalDeath ad);

	@Query(value = "select * from proposal where is_itapolicy = 'yes'", nativeQuery = true)
	List<Proposal> getListOfPolicies();

	@Query(value = "select * from proposal where is_itapolicy = 'no'", nativeQuery = true)
	List<Proposal> getListOfRejectedProposals();

	@Query(value = "select * from proposal where is_itapolicy is null", nativeQuery = true)
	List<Proposal> getAllProposals();

}
