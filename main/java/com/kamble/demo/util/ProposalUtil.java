/**
 * 
 */
package com.kamble.demo.util;

import com.kamble.demo.model.AccidentalDeath;
import com.kamble.demo.model.ComprehensiveCare;
import com.kamble.demo.model.LifeInsurance;
import com.kamble.demo.model.Proposal;

/**
 * @author Sanket.Kamble
 *
 */
public class ProposalUtil {

	public static double getFinalPremium(Proposal p) {
		// TODO Auto-generated method stub
		
		double finalPremium;
		
		AccidentalDeath ad = p.getAccidentalDeath();
		ComprehensiveCare cc = p.getComprehensiveCare();
		
		LifeInsurance li = ad.getLifeInsurance();
		
		
		if(p.getPaymentMode().equals("month")) {
			
			finalPremium = li.getPremium() + ad.getPremium() + cc.getPremium();
			
		}
		
		else if(p.getPaymentMode().equals("half")) {
			
			double premium = li.getPremium() + ad.getPremium() + cc.getPremium();
			
			finalPremium = premium - (0.1 * premium);
		}
		
		else {
			
			double premium = li.getPremium() + ad.getPremium() + cc.getPremium();
			
			finalPremium = premium - (0.15 * premium);
			
		}
		
		
		return finalPremium;
	}

	
}
