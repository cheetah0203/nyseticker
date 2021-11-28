/**
 * 
 */
package com.proximotech.nyseticker.model;

import java.time.LocalDateTime;

import yahoofinance.Stock;

/**
 * @author apple
 *
 */
public class StockWrapper {

	private final Stock stock;

	private final LocalDateTime lastAccessed;

	public StockWrapper(final Stock stock) {
		this.stock = stock;
		this.lastAccessed = LocalDateTime.now();

	}

	public Stock getStock() {
		return stock;
	}

	public LocalDateTime getLastAccessed() {
		return lastAccessed;
	}

}
