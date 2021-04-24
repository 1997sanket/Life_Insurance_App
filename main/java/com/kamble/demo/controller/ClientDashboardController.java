/**
 * 
 */
package com.kamble.demo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.Client;
import com.kamble.demo.model.ComprehensiveCare;
import com.kamble.demo.model.LifeInsurance;
import com.kamble.demo.model.Proposal;
import com.kamble.demo.service.AccidentalDeathService;
import com.kamble.demo.service.ClientService;
import com.kamble.demo.service.ComprehensiveCareService;
import com.kamble.demo.service.LifeInsuranceService;
import com.kamble.demo.service.ProposalService;
import com.kamble.demo.util.LifeInsuranceUtil;
import com.kamble.demo.util.ProposalUtil;

/**
 * @author Sanket.Kamble
 *
 */

@Controller
public class ClientDashboardController {

	@Autowired
	private ProposalService proposalService;
	
	@Autowired
	private ClientService service;
	
	@Autowired
	private LifeInsuranceService lifeInsuranceService;
	
	@Autowired
	private ComprehensiveCareService comprehensiveCareService;
	
	//private int clientId;
	
	//private int lifeInsuranceId;
	
	@Autowired
	private AccidentalDeathService accidentalDeathService;
	
	
	
	@GetMapping("/clientDashboard/{id}")
	public String clientDashboard(@PathVariable int id, HttpServletRequest request) {
		
//		System.out.println("In clientDashboard");

		Client client = service.getClientById(id);
		
		request.setAttribute("client", client);
		
		return "clientDashboard";
	}
	
	

	@GetMapping("/clientDashboard/newProposal/{id}")
	public String newProposal(@PathVariable int id, HttpSession session) {
		
		System.out.println("In new proposal");
		
		//clientId = id;
		
		session.setAttribute("clientId", id);
		
		return "newProposal";
	}
	
	
	@GetMapping("clientDashboard/newProposal/termInsurance/{id}")
	public ModelAndView termInsurance(@PathVariable int id, HttpServletRequest request) {
		
		
		request.setAttribute("id", id);
		
		LifeInsurance li = new LifeInsurance();
		
		return new ModelAndView("termInsuranceForm", "li", li);
	}
	
	
	@PostMapping("/clientDashboard/termInsurance")
	public String afterTermInsurance(LifeInsurance li, HttpServletRequest req, HttpSession session) {
		
		//System.out.println("client id : " + clientId);
		
		//Client client = service.getClientById(clientId);
		Client client = service.getClientById((int)session.getAttribute("clientId"));
		
		//System.out.println(client);
		li.setClient(client);
		
		
		
		double premium = LifeInsuranceUtil.getPremium(li);
		
		li.setPremium(premium);
		
		//Saving in database
		lifeInsuranceService.save(li);
		
		
		LifeInsurance li2 = lifeInsuranceService.getByClient(client);
		
		System.out.println("li2 = " + li2);
		
		req.setAttribute("li2", li2);
		
		
		
		//System.out.println("Premium per month is : " + premium);
		
		req.setAttribute("premium", premium);
		
		
		return "topUp";
	}
	
	
	@GetMapping("clientDashboard/accidentalDeathBenifit/{li2Id}")
	public ModelAndView accidentalDeathBenifit(@PathVariable int li2Id, HttpSession session) {
		
		//lifeInsuranceId = li2Id;
		session.setAttribute("lifeInsuranceId", li2Id);
		
		//System.out.println("li2Id = " + li2Id);
		
		AccidentalDeath ad = new AccidentalDeath();
		
		return new ModelAndView("accidentalDeathForm", "ad", ad);
	}
	
	
	@PostMapping("clientDashboard/accidentlDeathBenifit")
	public String afterAccidentalDeathBenifit(AccidentalDeath ad, HttpServletRequest req, HttpSession session) {
		
		//LifeInsurance li = lifeInsuranceService.getById(lifeInsuranceId);
		LifeInsurance li = lifeInsuranceService.getById((int)session.getAttribute("lifeInsuranceId"));
		ad.setLifeInsurance(li);
		
		double premium = 0;
		
		if(ad.getCoverageAmount() == 50000) {
			
			premium = 10;
		}
		
		else if(ad.getCoverageAmount() == 100000) {
			
			premium = 20;
		}
		
		else {
			
			premium = 30;
		}
		
		ad.setPremium(premium);
		
		System.out.println(ad);
		
		//Saving in database
		accidentalDeathService.save(ad);
		
		//AccidentalDeath ad2 = accidentalDeathService.getByLifeInsurance(li);
		
		//System.out.println("ad2 = " + ad2);
		
		//req.setAttribute("ad2", ad2);
		
		req.setAttribute("li", li);
		
		return "comprehensiveTopUp";
	}
	
	
	@GetMapping("clientDashboard/comprehensiveCare/{liId}")
	public ModelAndView comprehensiveCare(@PathVariable int liId) {
		
		ComprehensiveCare cc = new ComprehensiveCare();
		
		
		return new ModelAndView("newComprehensiveTopUp", "cc", cc);
	}
	
	
	@PostMapping("clientDashboard/comprehensiveCare")
	public ModelAndView afterComprehensiveCare(ComprehensiveCare cc, HttpSession session) {
		
		if(cc.getCoverageAmount()  == 300000) {
			
			cc.setPremium(400);
		}
		
		else if(cc.getCoverageAmount() == 600000) {
			
			cc.setPremium(800);
		}
		
		else {
			
			cc.setPremium(1200);
		}
		
		
		LifeInsurance li = lifeInsuranceService.getById((int)session.getAttribute("lifeInsuranceId"));
		
		cc.setLifeInsurance(li);
		
		
		//System.out.println(cc);
		
		
		//Saving in database
		comprehensiveCareService.save(cc);
		
		
		AccidentalDeath ad = accidentalDeathService.getByLifeInsurance(li);
		
		
		//Final premium is sum of Life insurance premium, Accidental death benifit premium and Comprehensive care premium  and 100 for tax
		double finalPremium = li.getPremium() +  cc.getPremium() + ad.getPremium() + 100 ;
		
		session.setAttribute("finalPremium", finalPremium);
		
		//Make proposal object here and add accidentalDeath and comprehensiveCare as foreign key
		Proposal p = new Proposal();
		
		//Getting Comprehensive Care object from database
		ComprehensiveCare cc2 = comprehensiveCareService.getByLifeInsurance(li);
		
		
		//Setting AccidentalDeath and ComprehensiveCare for our Proposal
		p.setAccidentalDeath(ad);
		p.setComprehensiveCare(cc2);
		
		System.out.println("Proposal object till now = " + p);
		
		
		System.out.println("final premium = " + finalPremium);
		
		session.setAttribute("proposal", p);
		return new ModelAndView("proposal", "p", p);
	}
	
	
	@PostMapping("clientDashboard/submitProposal")
	public String submitProposal(Proposal p, HttpSession session) {
		
		System.out.println("proposal p = " + p);
		
		
		Proposal z = (Proposal) session.getAttribute("proposal");
		p.setAccidentalDeath(z.getAccidentalDeath());
		p.setComprehensiveCare(z.getComprehensiveCare());
		
		p.setLifeInsurance(z.getAccidentalDeath().getLifeInsurance());
		
		//Addition of LifeInsurance Premium, Accidental Death premium and ComprehensiveCare premium
		double finalPremium = ProposalUtil.getFinalPremium(p);
		
		
		p.setFinalPremium(finalPremium);
		
		//Saving proposal in database
		proposalService.save(p);
		
		int lid = (int) session.getAttribute("lifeInsuranceId");
		
		
		LifeInsurance li = lifeInsuranceService.getById(lid);
		
		AccidentalDeath ad = accidentalDeathService.getByLifeInsurance(li);
		
		Proposal prop = proposalService.getByAccidentalDeath(ad);
		
		//return new ModelAndView("displayProposal", "prop", prop);
		
		session.setAttribute("proposal", prop);
	
		
		System.out.println("final Proposal = " + prop);
		
		return "displayProposal";
	}
	
	
	@GetMapping("clientDashboard/logout") 
	public String logout(HttpSession session) {
		
		session.invalidate();
		
		return "index";
	}
	
	
	@GetMapping("listOfPolicies")
	public String listOfPolicies(HttpServletRequest req) {
		
		List<Proposal> list = proposalService.getListOfPolicies();
		
		//System.out.println(list);
		
		req.setAttribute("list", list);
		
		return "displayListOfPolicies";
	}
	
	
	@GetMapping("getPolicy/{id}")
	public String getPolicy(@PathVariable int id, HttpServletRequest req) {
		
		Proposal p = proposalService.getById(id);
		
		req.setAttribute("proposal", p);
		
		return "policyDashboard";
	}
	
	
	@GetMapping("listOfRejectedProposals")
	public String listOfRejectedProposals(HttpServletRequest req) {
		
		List<Proposal> list = proposalService.getListOfRejectedProposals();
		
		System.out.println("list of rejected proposals : " + list);
		
		req.setAttribute("list", list);
		
		return "listOfRejectedProposals";
	}
}
