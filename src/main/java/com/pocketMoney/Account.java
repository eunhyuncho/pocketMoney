package com.pocketMoney;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Account {
    private String account;
    private List<MoneyTransaction> moneyTransactionList;
    private int limit;
    private int balance;

    //Getter, Setter
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public List<MoneyTransaction> getMoneyTransactionList() {
        return moneyTransactionList;
    }

    public void setMoneyTransactionList(List<MoneyTransaction> moneyTransactionList) {
        this.moneyTransactionList = moneyTransactionList;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    //현재 총 잔액
    public int getBalance() {
        if(moneyTransactionList!=null){
            for(MoneyTransaction moneyTransaction: moneyTransactionList){
                balance += moneyTransaction.getMoney();
            }
        }
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //거래내역 추가하기
    public void addMoneyTransaction(MoneyTransaction moneyTransaction){
        moneyTransactionList.add(moneyTransaction);
    }

    //거래내역 삭제하기
    //리턴타입 boolean-> void
    public void deleteMoneyTransaction(Date date, String transaction){
        for(MoneyTransaction moneyTransaction : moneyTransactionList){
            if(moneyTransaction.getDate().equals(date) && moneyTransaction.getTransaction().equals(transaction)){
                moneyTransactionList.remove(moneyTransaction);
            }
        }
    }

    //거래내역 전체보기
    public Iterator<MoneyTransaction> iterator(){
        return moneyTransactionList.iterator();
    }

}
