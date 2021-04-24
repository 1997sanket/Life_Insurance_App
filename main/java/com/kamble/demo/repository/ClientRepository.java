/**
 * 
 */
package com.kamble.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamble.demo.model.Client;

/**
 * @author Sanket.Kamble
 *
 */

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
