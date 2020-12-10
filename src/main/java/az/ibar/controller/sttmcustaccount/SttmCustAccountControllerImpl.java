package az.ibar.controller.sttmcustaccount;

import az.ibar.dao.sttmcustaccount.SttmCustAccountDaoImpl;
import az.ibar.model.sttmcustaccount.SttmCustAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SttmCustAccountControllerImpl implements SttmCustAccountController {

    @Autowired
    SttmCustAccountDaoImpl sttmCustAccountService;

    @PutMapping (value = "/sttmcustaccount/increaseAvlBal/{custAcNo}/{amount}")
    public ResponseEntity<String> increaseAvlBal(@PathVariable String custAcNo, @PathVariable double amount) {
        int cnt =  sttmCustAccountService.increaseAvlBal(custAcNo,amount);
        if(cnt==1)
        {
         return   ResponseEntity.status(HttpStatus.OK).body("The balance has been increased");
        }
        else
        {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
    }

    @GetMapping(value = "/sttmcustaccount/getByCustNo/{custNo}", produces = "application/json")
    public ResponseEntity<?> getByCustNo(@PathVariable String custNo) {
        List<SttmCustAccount> list = sttmCustAccountService.getByCustNo(custNo);
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
