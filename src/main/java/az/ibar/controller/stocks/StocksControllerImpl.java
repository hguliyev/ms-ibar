package az.ibar.controller.stocks;

import az.ibar.model.stock.Stock;
import az.ibar.service.stocks.StocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StocksControllerImpl implements StocksController{

    @Autowired
    StocksService stocksService;

    @GetMapping(value = "/getStocks", produces = "application/json")
    public ResponseEntity<?> getStocks() {

        List<Stock> list = stocksService.getStocks();
        if(list.size()>0)
        {
            return   ResponseEntity.status(HttpStatus.OK).body(list);
        }
        else
        {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }


}
