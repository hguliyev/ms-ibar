package az.ibar.controller.mail;

import az.ibar.model.mail.Mail;
import org.springframework.http.ResponseEntity;

public interface MailController {
    public ResponseEntity<String> sendEmail(Mail mail);
}
