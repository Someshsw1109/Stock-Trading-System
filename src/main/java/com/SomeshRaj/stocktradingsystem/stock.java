package com.SomeshRaj.stocktradingsystem;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "Stock")
public class stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stock_id")
    private int stockId;

    @Column(name = "stock_name")
    private String stockName;

    @Column(name = "stock_symbol")
    private String stockSymbol;

    @Column(name = "current_price")
    private double currentPrice;

    // Getters and setters
}

