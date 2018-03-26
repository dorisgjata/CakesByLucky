package com.cakes.cake.services;

import org.springframework.stereotype.Service;

@Service
public interface MailService {
     public void sendSimpleMessage(String from,
      String to, String subject, String text);
}