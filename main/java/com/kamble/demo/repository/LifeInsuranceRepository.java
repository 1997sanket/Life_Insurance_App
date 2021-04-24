/**
 * 
 */
package com.kamble.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamble.demo.model.Client;
import com.kamble.demo.model.LifeInsurance;

/**
 * @author Sanket.Kamble
 *
 */

@Repository
public interface LifeInsuranceRepository extends JpaRepository<LifeInsurance, Integer> {

	LifeInsurance findByClient(Client client);

}
