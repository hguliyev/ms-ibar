package az.ibar.controller.mail;

import az.ibar.model.mail.Mail;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@SpringBootTest
@AutoConfigureMockMvc
public class MailControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testSendEmailStatus400() throws Exception  {
        String url = "/sendEmail";
        Mail mail=new Mail();
        mail.setMailTo("aaamail.ru");
        mail.setMailSubject("testSubject");
        mail.setMailContent("testContent");
        ObjectMapper objectMapper = new ObjectMapper();
        String inputJson = objectMapper.writeValueAsString(mail);
        MvcResult mvcResult = mockMvc.perform(post(url)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(400, status);
    }

    @Test
    public void testSendEmailStatus200() throws Exception  {
        String url = "/sendEmail";
        Mail mail=new Mail();
        mail.setMailTo("aaa@mail.ru");
        mail.setMailSubject("testSubject");
        mail.setMailContent("testContent");
        ObjectMapper objectMapper = new ObjectMapper();
        String inputJson = objectMapper.writeValueAsString(mail);
        MvcResult mvcResult = mockMvc.perform(post(url)
                .contentType(MediaType.APPLICATION_JSON_VALUE).content(inputJson)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }
}

