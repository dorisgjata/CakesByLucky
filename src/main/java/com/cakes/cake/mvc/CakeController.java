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
public class CakeController {
	@Autowired
	private JavaMailSender sender;
    @Autowired
    private EmailConfiguration config;

    @RequestMapping("/dropdown")
    public String dropdown(String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", new SimpleMailMessage());

        return "dropdown";
    }
	@RequestMapping(value="/dropdown", method=RequestMethod.POST)
	public String sendMail(HttpServletRequest request ) {
        
        String from = request.getParameter("from");
        String subject = request.getParameter("subject");
        String shape = request.getParameter("shape");
        String tier = request.getParameter("tier");
        String drip = request.getParameter("drip");
        String border = request.getParameter("border");
        String filling= request.getParameter("filling");
        String flavor = request.getParameter("flavor");
        String color = request.getParameter("color");

String text = ("Shape: "+shape+"\nTier: " +tier+"\nDrip: "+drip+"\nBorder: " +border+"\nFilling: "+filling+"\nFlavor: " +flavor+"\nColor: " +color);
       
       SimpleMailMessage email = new SimpleMailMessage();

        email.setTo("cakesbyluckydemo@gmail.com");
        email.setFrom(from);
        email.setSubject(subject);
        email.setText(text);        
      
		sender.send(email);
		return "redirect:main";
	
    }

}

