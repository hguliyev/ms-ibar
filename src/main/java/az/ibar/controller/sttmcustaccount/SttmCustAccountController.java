package az.ibar.controller.sttmcustaccount;

import org.springframework.http.ResponseEntity;

public interface SttmCustAccountController {
    public ResponseEntity<String>  increaseAvlBal(String custAcNo, double amount);
    public ResponseEntity<?> getByCustNo(String custNo);
}
