/**
 * 
 */
package com.kamble.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamble.demo.model.Client;
import com.kamble.demo.repository.ClientRepository;

/**
 * @author Sanket.Kamble
 *
 */

@Service
public class ClientServiceImpl implements ClientService{
	
	@Autowired
	private ClientRepository clientRepo;

	@Override
	public void saveClient(Client client) {
		// TODO Auto-generated method stub
		
		clientRepo.save(client);
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return clientRepo.findAll();
	}

	@Override
	public Client getClientById(int id) {
		// TODO Auto-generated method stub
		return clientRepo.findById(id).get();
	}
	
	

}
