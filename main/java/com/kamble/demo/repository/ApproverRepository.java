/**
 * 
 */
package com.kamble.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamble.demo.model.Approver;

/**
 * @author Sanket.Kamble
 *
 */

@Repository
public interface ApproverRepository extends JpaRepository<Approver, Integer> {

	Approver findByUsername(String username);

}
