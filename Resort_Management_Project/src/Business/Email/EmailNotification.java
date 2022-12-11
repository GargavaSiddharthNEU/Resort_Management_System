/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Email;

import Business.User.User;
import java.util.Properties;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.JOptionPane;
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
public class EmailNotification {

    //user - user details, string facility
    public void SendEmailOfNotification(User userDetails, String facility) {
        // Get system properties

        final String username = "team35aed@gmail.com";

        // change accordingly
        final String password = "aqggzumssumykhgw";

        // or IP address
        final String host = "localhost";

        // Get system properties
        Properties props = new Properties();

        // enable authentication
        props.put("mail.smtp.auth", "true");

        // enable STARTTLS
        props.put("mail.smtp.starttls.enable", "true");

        // Setup mail server
        props.put("mail.smtp.host", "smtp.gmail.com");

        // TLS Port
        props.put("mail.smtp.port", "587");


        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {

            //override the getPasswordAuthentication method
            protected PasswordAuthentication
                    getPasswordAuthentication() {

                return new PasswordAuthentication(username,
                        password);
            }
        });

        try {

            // compose the message
            // javax.mail.internet.MimeMessage class is
            // mostly used for abstraction.
            Message message = new MimeMessage(session);

            // header field of the header.
            message.setFrom(new InternetAddress("team35aed@gmail.com"));

            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(userDetails.getEmailId()));
            message.setSubject("Booking confirmation for " + userDetails.getFirstName() + " " + userDetails.getLastName());
            message.setText("Hi, \nThis is a message on behalf of our resort. Your appointment has been confirmed for "
                    + facility + " facility."
                    + "\n\n We appreciate your cooperation! Looking forwarding to seeing you!"
                    + "\n\n Thanks");

            Transport.send(message);         //send Message

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
