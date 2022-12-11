/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Email;

import Business.User.User;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author siddh
 */
public class EmailTest {
    Session newSession = null;
    MimeMessage message = null;
    
    public void sendEmail() throws NoSuchProviderException, MessagingException{
        String senderEmailID = "team35aed@gmail.com";
        String password = "aqgg zums sumy khgw";
        
        String emailHost = "smtp.gmail.com";
        
        Transport transport = newSession.getTransport("smtp");
        transport.connect(emailHost, senderEmailID , password);
        transport.sendMessage(message,message.getAllRecipients());
        transport.close();
        System.out.println("successfully sent");
    }
    
    public void setupServerProperties(){
        Properties prop = System.getProperties();
        prop.put("mail.smpt.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");
        newSession = Session.getDefaultInstance(prop, null);
    }
    
    public MimeMessage draftEmail(User userDetails, String facility) throws AddressException, MessagingException{
        MimeMessage message = new MimeMessage(newSession);
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(userDetails.getEmailId()));
        message.setSubject("Facility Confirmed for : " + userDetails.getFirstName() + " " + userDetails.getLastName());
        message.setText("Hi, \nThis is a message on behalf of our resort. Your appointment has been confirmed for "
                    + facility + " facility."
                    + "\n\n We appreciate your cooperation! Looking forwarding to seeing you!"
                    + "\n\n Thanks");
        
        return message;
    }
}
