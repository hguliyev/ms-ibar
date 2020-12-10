package az.ibar.service.sttmcustaccount;

import az.ibar.model.sttmcustaccount.SttmCustAccount;
import java.util.List;

public interface SttmCustAccountService {
    public int increaseAvlBal(String custAcNo, double amount);
    public List<SttmCustAccount> getByCustNo(String custNo);
}
