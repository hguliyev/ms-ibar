package az.ibar.controller.stocks;

import org.springframework.http.ResponseEntity;


public interface StocksController {
    public ResponseEntity<?> getStocks();
}
