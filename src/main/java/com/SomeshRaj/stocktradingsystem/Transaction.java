package com.SomeshRaj.stocktradingsystem;

import java.util.Date;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private int transactionId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private user user;

    @ManyToOne
    @JoinColumn(name = "stock_id")
    private stock stock;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private double price;

    @Column(name = "date")
    private Date date;

    // Getters
    public int getTransactionId() {
        return transactionId;
    }

    public com.SomeshRaj.stocktradingsystem.user getUser() {
        return user;
    }

    public stock getStock() {
        return stock;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    // setters

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setUser(user user) {
        this.user = user;
    }

    public void setStock(stock stock) {
        this.stock = stock;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
}
