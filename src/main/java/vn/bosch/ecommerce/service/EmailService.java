package vn.bosch.ecommerce.service;

public interface EmailService {

	void sendMail(String to, String subject, String msg);


}
