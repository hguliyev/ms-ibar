package az.ibar.controller.mail;


import az.ibar.model.mail.Mail;
import az.ibar.service.mail.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
public class MailControllerImpl implements MailController {

    @Autowired
    MailService mailService;

    @PostMapping("sendEmail")
    public ResponseEntity<String> sendEmail(@RequestBody  Mail mail) {

            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(mail.getMailTo());
            if(matcher.matches())
            {
                mailService.sendEmail(mail);
                return
                        ResponseEntity
                                .status(HttpStatus.OK)
                                .body("Email sent successfully");


            }
            else
            {
                return
                        ResponseEntity
                                .status(HttpStatus.BAD_REQUEST)
                                .body("Email adress is not valid");
            }

    }
}

