import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class Email1 {

    // Metoda za slanje email-a
    public void sendEmail(String to,  String messageText) {
        // Parametri za SMTP server
        String host = "smtp.gmail.com";  // Zamenite sa SMTP serverom koji koristite (npr. smtp.gmail.com)
        String from = "dejanmilo666@gmail.com";  // Vaša email adresa
        String password = "Dejanmilo333";  // Vaša email lozinka (ili aplikacioni password ako je potrebno)

        // Svojstva za SMTP
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");  // Uobičajeni port za SMTP sa STARTTLS
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

        // Autentifikacija
        Session session = Session.getInstance(properties, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Kreiranje email poruke
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            
            message.setText(messageText);

            // Slanje email-a
            Transport.send(message);
            System.out.println("Email poslat!");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
