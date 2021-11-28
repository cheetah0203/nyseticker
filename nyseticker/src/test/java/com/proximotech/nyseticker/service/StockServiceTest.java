/**
 * 
 */
package com.proximotech.nyseticker.service;

import java.io.IOException;
import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.proximotech.nyseticker.model.StockWrapper;

/**
 * @author apple
 *
 */
@SpringBootTest
public class StockServiceTest {
	
	@Autowired
	private StockService stockService;
	
	@Test
	void invoke() throws IOException {
		final StockWrapper stock = stockService.findStock("UU.L");
		System.out.println(stock.getStock());
		
		BigDecimal price = stockService.findPrice(stock);
		System.out.println(price);
	}

}
