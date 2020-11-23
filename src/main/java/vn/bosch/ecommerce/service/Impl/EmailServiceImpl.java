package vn.bosch.ecommerce.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import vn.bosch.ecommerce.service.EmailService;

@Service
public class EmailServiceImpl  implements EmailService {
	@Autowired
    public JavaMailSender emailSender;
 
    public void sendMail(
      String to, String subject, String text) {

    	// Create a Simple MailMessage.
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("noreply@bosch.com");
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        this.emailSender.send(message);
       
    }
	
}