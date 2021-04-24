/**
 * 
 */
package com.kamble.demo.util;

import java.time.Year;
import java.util.Date;

import com.kamble.demo.model.LifeInsurance;

/**
 * @author Sanket.Kamble
 *
 */
public class LifeInsuranceUtil {

	//Algorithm to calculate premium per month
	public static double getPremium(LifeInsurance li) {
		
		int age =  Year.now().getValue() - li.getDOB().getYear();
		
		
		//System.out.println("age : " + age);
		
		double premium = 0;
		
		if(age <= 30) {
			
			premium += 300;
			
		}
		
		else if(age >30 && age <=40) {
			
			premium += 400;
		}
		
		else {
			premium += 500;
		}
		
		
		if(li.getConsumeTobacco().equals("yes")) {
			
			premium += 300;
		}
		
		else {
			
			premium += 100;
		}
		
		
		
		if(li.getCoverAmount() == 10000000) {
			
			premium += 100;
		}
		
		
		else if(li.getCoverAmount() == 20000000) {
			
			premium += 200;
		}
		
		else {
			
			premium += 300;
		}
		
		//System.out.println(premium);
		
		return premium;
	}
}
