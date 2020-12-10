package az.ibar.service.stocks;

import az.ibar.dao.stocksdao.StocksDao;
import az.ibar.model.stock.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StocksServiceImpl implements StocksService{
    @Autowired
    StocksDao stocksDao;

    @Override
    public List<Stock> getStocks() {
        return stocksDao.getStocks();
    }
}
