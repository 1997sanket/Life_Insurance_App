/**
 * 
 */
package com.kamble.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kamble.demo.model.Client;
import com.kamble.demo.service.ClientService;

/**
 * @author Sanket.Kamble
 *
 */

@Controller
public class UserDashboardController {
	
	@Autowired
	private ClientService clientService;
	
	
	@GetMapping("/logout")
	public String showUserDashboard(HttpSession session) {
		
		//Deletes Session
		session.invalidate();
		
		return "index";
	}
	
	@GetMapping("/createNewClient")
	public ModelAndView createNewClient() {
		
		Client client = new Client();
		
		return new ModelAndView("createClient", "selectedClient", client);
		
	}
	
	
	@PostMapping("/createNewClient") 
	public String afterCreateClient(Client client) {
		
		clientService.saveClient(client);
		
		return "userDashboard";
		
	}
	
	
	@GetMapping("/currentClients")
	public String getCurrentClients(HttpServletRequest request) {
		
		request.setAttribute("clients", clientService.getAllClients());
		
		return "displayClients";
	}

}
