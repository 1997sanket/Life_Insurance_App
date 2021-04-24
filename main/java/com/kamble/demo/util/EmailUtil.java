/**
 * 
 */
package com.kamble.demo.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author Sanket.Kamble
 *
 */

@Component
public class EmailUtil {

	//@Autowired
	private JavaMailSender mailSender = new JavaMailSenderImpl();
	
	@Async
	public void sendEmail(String sendEmailTo, String what) throws MessagingException {
		// TODO Auto-generated method stub
		
			
		 MimeMessage message = mailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(message, true);
	        helper.setTo(sendEmailTo);
	        
	        if(what.equals("yes")) {
		        helper.setText("<html><body><h1>Your proposal has been accepted  :) </h1><body></html>", true);

	        }
	        
	        else {
	        	
		        helper.setText("<html><body><h1>Your proposal has been rejected  :( </h1><body></html>", true);

	        }
	        //helper.set
	       // FileSystemResource file  = new FileSystemResource(new File(path));
	       // helper.addAttachment("B0000_" + bookingId + " Invoice.pdf", file);
	        //helper.addAttachment("test.png", new ClassPathResource("test.jpeg"));
	        helper.setSubject("Regarding you Life Insurance proposal");
	        mailSender.send(message);
		
	}
	
}
