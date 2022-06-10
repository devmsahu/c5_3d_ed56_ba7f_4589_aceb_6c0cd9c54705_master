package com.hackerrank.stocktrades.controller;

import com.hackerrank.stocktrades.model.StockTrade;
import com.hackerrank.stocktrades.repository.StockTradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StockTradeRestController {
    @Autowired
    private StockTradeRepository stockTradeRepository;

    @RequestMapping(value = "/trades", method = RequestMethod.GET)
    List<StockTrade> getStockTrades(){
        return stockTradeRepository.findAll();
    }

    @RequestMapping(value = "/trades/{id}", method = RequestMethod.GET)
    StockTrade getStockTrade(@PathVariable Integer id){
        return stockTradeRepository.findById(id).get();
    }


}
