package com.Crud.crud;

import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Mails {

	public void mandarMaildeLogin(Paciente p) {
		try {
			String from = "noreply@vacunassist.com";
			String to = p.getEmail();

			// credenciales
			String username = "ae68dcf2cb5784"; // Completar con su username de mailtrap
			String password = "cd2ada93762272"; // Completar con su password de mailtrap
			
			Properties props = new Properties();
			props.put("mail.smtp.auth", "true");
			props.put("mail.smtp.starttls.enable", "true");
			props.put("mail.smtp.host", "smtp.mailtrap.io");
			props.put("mail.smtp.port", "587");				 
			Session session = Session.getInstance(props,
				new Authenticator() {
		            protected PasswordAuthentication getPasswordAuthentication() {
		            	return new PasswordAuthentication(username, password);
		            }
			});

		    Message message = new MimeMessage(session);
		    message.setFrom(new InternetAddress(from, "VACUNASSIST"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject("Token de ingreso");
		    message.setText("tu token es: " + p.getToken());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
}
