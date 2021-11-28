/**
 * 
 */
package com.proximotech.nyseticker.service;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import com.proximotech.nyseticker.model.StockWrapper;

/**
 * @author apple
 *
 */
@Service
public class StockService {

	public StockWrapper findStock(final String ticker) {
		try {
			return new StockWrapper(yahoofinance.YahooFinance.get(ticker));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public BigDecimal findPrice(final StockWrapper stock) throws IOException {
		return stock.getStock().getQuote(true).getPrice();
	}
}
