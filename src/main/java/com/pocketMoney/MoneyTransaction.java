package com.pocketMoney;

import java.util.Date;

public class MoneyTransaction {
    private Date date;
    private int money;
    private String category;
    private String transaction;
    private String place;
    private int fixedCost;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getFixedCost() {
        return fixedCost;
    }

    public void setFixedCost(int fixedCost) {
        this.fixedCost = fixedCost;
    }
}
