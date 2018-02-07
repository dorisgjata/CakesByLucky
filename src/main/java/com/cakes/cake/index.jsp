<%-- 
    Document   : index
    Created on : Feb 3, 2018, 1:51:14 PM
    Author     : henna
--%>
<%@page import="java.util.Properties" %>
<%@page import="javax.mail.*" %>
<%@page import="javax.mail.internet.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Us!!!</title>
    </head>
    <body onLoad="displayResult()">
        <h1>Contact Us!!!</h1>
        <%!
          public static class SMTPAuthenticator extends Authenticator {

                public PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("cakesbyluckydemo","cakedemo");
            }
        }
         %>   
         <%
             
         int result = 0;
         
         if (request.getParameter("send") != null){
         
            String d_uname = "cakesbyluckydemo";
            String d_password = "cakedemo";
            String d_host = "smtp.gmail.com";
            int d_port = 465;
            
            String m_to = new String();
            String m_from = "cakesbyluckydemo@gmail.com";
            String m_subject = new String();
            String m_text = new String();
            
            if (request.getParameter("to") != null)
            {
                m_to = request.getParameter("to");
            }
            if (request.getParameter("subject") != null)
            {
                m_subject = request.getParameter("subject");
            }
             if (request.getParameter("message") != null)
            {
                
                m_text = m_text.concat(request.getParameter("message"));
                m_text = m_text.concat("<br /><h2>Cakes by Lucky</h2>");
                
            }
             
             Properties props = new Properties();
             
             SMTPAuthenticator auth = new SMTPAuthenticator();
             Session ses = Session.getInstance(props,auth);
             
             MimeMessage msg = new MimeMessage(ses);
             msg.setContent(m_text, "text/html");
             msg.setSubject(m_subject);
             msg.setFrom(new InternetAddress(m_from));
             msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));
             try{
                 Transport transport = ses.getTransport("smtps");
                 transport.connect(d_host, d_port, d_uname, d_password);
                 transport.sendMessage(msg, msg.getAllRecipients());
                 transport.close();
                 result = 1;
                         }
             catch (Exception e)
             {
                 out.println(e);
             }
         }
         %>
        <form name="myForm" action="index.jsp" method="POST">
            <table border="0">
                
                <tbody>
                    <tr>
                        <td>To:</td>
                        <td><input type="text" name="to" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Subject: </td>
                        <td><input type="text" name="subject" value="" size="50" /></td>
                    </tr>
                    <tr>
                        <td>Message:</td>
                        <td><textarea name="message" rows="4" cols="50"></textarea></td>
                    </tr>
                </tbody>
            </table>
            <input type="hidden" name="hidden" value="<%= result %>" />
            <input type="reset" value="Clear" name="clear" />
            <input type="submit" value="Send" name="send" />
        </form>
            <script language="JavaScript">
              function displayResult(){
                  if (document.myForm.hidden.value === "1"){
                      alert("mail was sent!");
                  }
              }  
    </body>
</html>
