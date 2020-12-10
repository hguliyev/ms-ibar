package az.ibar.dao.sttmcustaccount;

import az.ibar.model.sttmcustaccount.SttmCustAccount;
import java.util.List;

public interface SttmCustAccountDao {
    public int increaseAvlBal(String custAcNo, double amount);
    public List<SttmCustAccount> getByCustNo(String custNo);
}
