package az.ibar.dao.stocksdao;

import az.ibar.model.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StocksDaoImpl implements StocksDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Stock> getStocks() {
        return  jdbcTemplate.query("select * from xxtm_stocks", new BeanPropertyRowMapper(Stock.class));
    }
}
