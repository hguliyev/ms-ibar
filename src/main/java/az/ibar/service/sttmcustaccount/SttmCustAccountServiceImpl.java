package az.ibar.service.sttmcustaccount;

import az.ibar.dao.sttmcustaccount.SttmCustAccountDao;
import az.ibar.model.sttmcustaccount.SttmCustAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SttmCustAccountServiceImpl implements SttmCustAccountService {
    @Autowired
    SttmCustAccountDao sttmCustAccountDao;

    @Override
    public int increaseAvlBal(String custAcNo, double amount) {
        return sttmCustAccountDao.increaseAvlBal(custAcNo,amount);
    }

    @Override
    public List<SttmCustAccount> getByCustNo(String custNo) {
        return sttmCustAccountDao.getByCustNo(custNo);
    }
}
