/**
 * 
 */
package com.kamble.demo.service;

import java.util.List;

import com.kamble.demo.model.Client;

/**
 * @author Sanket.Kamble
 *
 */
public interface ClientService {

	void saveClient(Client client);
	
	List<Client> getAllClients();
	
	Client getClientById(int id);
}
