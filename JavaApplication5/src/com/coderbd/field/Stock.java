package com.coderbd.field;

import java.util.Date;

public class Stock {

    private String symbol;
    private double price;
    private Date date = new Date();

    public Stock(String symbol) {
        this.symbol = symbol;
    }

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public Double getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }
}
