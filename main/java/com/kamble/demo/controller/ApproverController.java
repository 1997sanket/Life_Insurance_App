/**
 * 
 */
package com.kamble.demo.controller;

import java.security.spec.DSAGenParameterSpec;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kamble.demo.model.Approver;
import com.kamble.demo.model.Proposal;
import com.kamble.demo.service.ApproverService;
import com.kamble.demo.service.ProposalService;
import com.kamble.demo.util.EmailUtil;

/**
 * @author Sanket.Kamble
 *
 */

@Controller
public class ApproverController {

	@Autowired
	private ProposalService proposalService;
	
	@Autowired
	private ApproverService approverService;
	
	@GetMapping("approverSignUp")
	public ModelAndView approverSignUp() {
		
		Approver approver = new Approver();
		
		return new ModelAndView("approverSignUp", "approver", approver);
	}
	
	@PostMapping("approverSignUp")
	public String afterApproverSignUp(Approver approver) {
		
		//Saving in database
		approverService.save(approver);
		
		return "index";
	}
	
	
	
	@GetMapping("approverSignIn")
	public ModelAndView approverSignIn() {
		
		Approver approver = new Approver();
		
		return new ModelAndView("approverSignIn", "ap", approver);
	}
	
	
	@PostMapping("approverSignIn")
	public String afterApproverSignIn(Approver ap1, HttpSession session) {
		
		Approver ap2 = approverService.getApproverByUserName(ap1.getUsername());
		
		if(ap2.getPassword().equals(ap1.getPassword())) {
			
			session.setAttribute("approver", ap2);
			
			
			
			return "approverDashboard";
		}
		
		else {
			
			return "invalidSignIn";
		}
	}
	
	
	
	@GetMapping("listOfProposals")
	public String listOfProposals(HttpServletRequest req) {
		
		//Get all proposal (not policies)
		List<Proposal> list = proposalService.getAllProposals();
		
		req.setAttribute("list", list);
		
		return "listOfProposals";
	}
	
	
	@GetMapping("proposalDashboard/{id}")
	public String proposalDashboard(@PathVariable("id")int id, HttpServletRequest req) {
		
		Proposal prop = proposalService.getById(id);
		
		System.out.println("Proposal for Approver = " + prop);
		
		req.setAttribute("proposal", prop);
		
		return "proposalDashboard";
	}
	
	
	@GetMapping("acceptProposal")
	public String acceptProposal(HttpSession session) {
		
		//System.out.println((Proposal)session.getAttribute("prop"));
		
		Proposal p = (Proposal)session.getAttribute("prop");
		
		//String sendEmailTo = p.getLifeInsurance().getClient().getEmail();
		
//		try {
//			new EmailUtil().sendEmail(sendEmailTo, "yes");
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Proposal accepted and policy created
		p.setIsItAPolicy("yes");
		
		proposalService.save(p);
		
		
		return "approverDashboard";
	}
	
	
	@GetMapping("rejectProposal")
	public String rejectProposal(HttpSession session) {
		
		//System.out.println((Proposal)session.getAttribute("prop"));
		
		
		//Proposal rejected
		Proposal p = (Proposal)session.getAttribute("prop");
		
//		String sendEmailTo = p.getLifeInsurance().getClient().getEmail();
//		
//		try {
//			new EmailUtil().sendEmail(sendEmailTo, "no");
//		} catch (MessagingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		p.setIsItAPolicy("no");
		
		proposalService.save(p);
		
		return "approverDashboard";
	}
	
}
