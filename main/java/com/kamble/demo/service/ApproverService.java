/**
 * 
 */
package com.kamble.demo.service;

import com.kamble.demo.model.Approver;

/**
 * @author Sanket.Kamble
 *
 */
public interface ApproverService {

	public void save(Approver ap);

	public Approver getApproverByUserName(String username);
}
