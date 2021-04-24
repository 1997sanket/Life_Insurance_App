/**
 * 
 */
package com.kamble.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.LifeInsurance;

/**
 * @author Sanket.Kamble
 *
 */

@Repository
public interface AccidentalDeathRepository extends JpaRepository<AccidentalDeath, Integer> {

	AccidentalDeath findByLifeInsurance(LifeInsurance li);

}
