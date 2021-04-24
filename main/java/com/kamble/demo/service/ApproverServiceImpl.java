/**
 * 
 */
package com.kamble.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamble.demo.model.Approver;
import com.kamble.demo.repository.ApproverRepository;

/**
 * @author Sanket.Kamble
 *
 */

@Service
public class ApproverServiceImpl implements ApproverService {
	
	@Autowired
	private ApproverRepository repo;

	@Override
	public void save(Approver ap) {
		// TODO Auto-generated method stub
		
		repo.save(ap);
	}

	@Override
	public Approver getApproverByUserName(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}

}
