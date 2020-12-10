package az.ibar.service.mail;

import az.ibar.model.mail.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    JavaMailSender mailSender;

    @Autowired
    public MailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(Mail mail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(mail.getMailTo());
        message.setSubject(mail.getMailSubject());
        message.setText(mail.getMailContent());
        mailSender.send(message);
    }
}
