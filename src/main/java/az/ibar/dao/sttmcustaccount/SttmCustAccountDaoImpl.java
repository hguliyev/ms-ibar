package az.ibar.dao.sttmcustaccount;


import az.ibar.model.sttmcustaccount.SttmCustAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class SttmCustAccountDaoImpl implements SttmCustAccountDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int increaseAvlBal(String custAcNo, double amount) {
         return jdbcTemplate.update("update sttm_cust_account set acy_avl_bal = acy_avl_bal + ? where cust_ac_no = ?",
                new Object[]{
                        amount,custAcNo
                });


    }

    @Override
    public List<SttmCustAccount> getByCustNo(String custNo) {
        return (List<SttmCustAccount>) jdbcTemplate.query("select * from sttm_cust_account where cust_no = ?", new Object[]{custNo},new BeanPropertyRowMapper(SttmCustAccount.class));
    }
}
