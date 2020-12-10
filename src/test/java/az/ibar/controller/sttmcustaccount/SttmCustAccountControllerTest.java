package az.ibar.controller.sttmcustaccount;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

@SpringBootTest
@AutoConfigureMockMvc
public class SttmCustAccountControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testIncreaseAvlBalStatus204() throws Exception  {
        String url = "/sttmcustaccount/increaseAvlBal/00000AZNFK0100000099/500";
        MvcResult mvcResult = mockMvc.perform(put(url)
                .contentType(MediaType.TEXT_PLAIN)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(204, status);
    }

    @Test
    public void testIncreaseAvlBalStatus200() throws Exception  {
        String url = "/sttmcustaccount/increaseAvlBal/00000AZNFK0100000098/500";
        MvcResult mvcResult = mockMvc.perform(put(url)
                .contentType(MediaType.TEXT_PLAIN)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

    @Test
    public void testGetByCustNoStatus200() throws Exception  {
        String url = "/sttmcustaccount/getByCustNo/00000098";

        MvcResult mvcResult =  mockMvc.perform(get(url)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

    @Test
    public void testGetByCustNoStatus204() throws Exception  {
        String url = "/sttmcustaccount/getByCustNo/00000099";

        MvcResult mvcResult =  mockMvc.perform(get(url)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(204, status);
    }
}
