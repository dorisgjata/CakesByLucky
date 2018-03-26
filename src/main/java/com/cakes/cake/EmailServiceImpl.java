package com.cakes.cake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.cakes.cake.services.MailService;

@Component
public class EmailServiceImpl implements MailService {
  
    @Autowired
    public JavaMailSender emailSender;
 
    public void sendSimpleMessage(String from,
      String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom(from); 
        message.setTo(to); 
        message.setSubject(subject); 
        message.setText(text);
        emailSender.send(message);
    }
}