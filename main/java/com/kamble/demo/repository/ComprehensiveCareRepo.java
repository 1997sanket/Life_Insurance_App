/**
 * 
 */
package com.kamble.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamble.demo.model.ComprehensiveCare;
import com.kamble.demo.model.LifeInsurance;

/**
 * @author Sanket.Kamble
 *
 */

@Repository
public interface ComprehensiveCareRepo extends JpaRepository<ComprehensiveCare, Integer> {

	ComprehensiveCare findByLifeInsurance(LifeInsurance li);

}
