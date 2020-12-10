package az.ibar.controller.stocks;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.util.Base64Utils;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc

public class StocksControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetStocksStatus200() throws Exception  {
        String url = "/getStocks";
        MvcResult mvcResult =  mockMvc.perform(get(url)
                .header(HttpHeaders.AUTHORIZATION,
                        "Basic " + Base64Utils.encodeToString("username:password".getBytes()))
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();
        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
    }

}
