package com.Crud.crud;

import java.time.LocalDate;
import java.util.Properties;

import jakarta.mail.Authenticator;
import jakarta.mail.Message;
import jakarta.mail.PasswordAuthentication;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

public class Mails {

	private static String username = "ae68dcf2cb5784";// Completar con su username de mailtrap
	private static String password = "cd2ada93762272";// Completar con su password de mailtrap
	
	public void mandarMaildeLogin(Paciente p) {
		try {
			String from = "noreply@vacunassist.com";
			String to = p.getEmail();

			
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
	
	
	public void mandarMaildeRecuperarClave(Paciente p) {
		try {
			String from = "noreply@vacunassist.com";
			String to = p.getEmail();

			
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
		    message.setSubject("Recuperar de clave");
		    message.setText("tu clave es: " + p.getClave());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
	
	public void mandarMaildeRecuperarClave(Vacunador p) {
		try {
			String from = "noreply@vacunassist.com";
			String to = p.getEmail();

			
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
		    message.setSubject("Recuperar de clave");
		    message.setText("tu clave es: " + p.getClave());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
	
	public void mandarMaildeRecuperarClave(Administrador p) {
		try {
			String from = "noreply@vacunassist.com";
			String to = p.getEmail();

			
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
		    message.setSubject("Recuperar de clave");
		    message.setText("tu clave es: " + p.getClave());
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}

	public void mailRecordatorioDeDiaVacuna(String nombreVacuna,String mail,String zona,int dosis) {
		try {
			String from = "noreply@vacunassist.com";
			String to = mail;

			
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
		    String mensaje= "";
		    message.setFrom(new InternetAddress(from, "VACUNASSIST"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject("Recuperar de clave");
		    mensaje=" hoy se te aplicar?? tu vacuna :" + nombreVacuna + ", se dar?? en la zona ubicada en: " + zona;
		    if(nombreVacuna.equals("Covid"))
		    	mensaje+= " para tu dosis "+dosis;
		    message.setText(mensaje);
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
	public void mailRecordatorioDeDiaAntes(String nombreVacuna,String mail,String zona,int dosis) {
		try {
			String from = "noreply@vacunassist.com";
			String to = mail;

			
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
		    String mensaje= "";
		    message.setFrom(new InternetAddress(from, "VACUNASSIST"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject("Recuperar de clave");
		    mensaje=" Ma??ana es el d??a de tu vacuna de :" + nombreVacuna + ", se dar?? en la zona ubicada en: " + zona;
		    if(nombreVacuna.equals("Covid"))
		    	mensaje+= " para tu dosis "+dosis;
		    message.setText(mensaje);
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
	
	public void mailFechaDeInscripcionVacuna(String nombreVacuna,String mail,int zona,int dosis,LocalDate fecha) {
		try {
			String from = "noreply@vacunassist.com";
			String to = mail;

			
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
		    String mensaje= "";
		    message.setFrom(new InternetAddress(from, "VACUNASSIST"));
		    message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		    message.setSubject("Recuperar de clave");
		    mensaje= "el d??a : " +fecha + " es el d??a de tu vacuna de : " + nombreVacuna + ", se dar?? en la zona: " + zona;
		    if(nombreVacuna.equals("Covid"))
		    	mensaje+= " para tu dosis "+dosis;
		    message.setText(mensaje);
		    Transport.send(message);
		}
		catch (Exception e) {
			throw new RuntimeException(e);
	    }
	}
	
}
