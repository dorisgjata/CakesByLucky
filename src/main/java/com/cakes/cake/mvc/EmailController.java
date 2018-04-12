package com.cakes.cake.mvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cakes.cake.config.EmailConfiguration;

@Controller
public class EmailController {
	@Autowired
	private JavaMailSender sender;
    @Autowired
    private EmailConfiguration config;

    @RequestMapping("/contact")
    public String contact(String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", new SimpleMailMessage());

        return "contact";
    }
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public String sendMail(HttpServletRequest request ) {
        
        String from = request.getParameter("from");
        String subject = request.getParameter("subject");
        String text = request.getParameter("text");
         
       
       SimpleMailMessage email = new SimpleMailMessage();

        email.setTo("cakesbyluckydemo@gmail.com");
        email.setFrom(from);
        email.setSubject(subject);
        email.setText(text);        
      
		sender.send(email);
		return "redirect:main";
	
    }

}
