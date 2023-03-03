package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int numberOfTransactions;
    private int numberOfDeposits;
    private int numberOfWithdrawals;
    private int balance;

    public CashMachine () {
        this.transactions = new int[0];  // TRANSACTIONS TO TABLICA XD
        this.numberOfTransactions = 0;
        this.numberOfWithdrawals = 0;
        this.numberOfDeposits = 0;
        this.balance = 0;
    }

    public int[] getTransactions(){
        return transactions;
    }

    public int getBalance(){
        return balance;
    }

    public int getNumberOfTransactions(){
        return numberOfTransactions;
    }

    public int getNumberOfDeposits(){
        return numberOfDeposits;
    }

    public int getNumberOfWithdrawals(){
        return numberOfWithdrawals;
    }

    public int withdraw(int value){
        if (value > 0 && value % 10 == 0) {
            numberOfTransactions++;
            int[] newTransactions = new int[this.numberOfTransactions];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[this.numberOfTransactions - 1] = value * -1;
            this.transactions = newTransactions;
            balance -= value;
            numberOfWithdrawals++;
        }
        return balance;
    }

    public int deposit(int value){
        if (value > 0 && value % 10 == 0) {
            numberOfTransactions++;
            int[] newTransactions = new int[this.numberOfTransactions];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[this.numberOfTransactions - 1] = value;
            this.transactions = newTransactions;
            balance += value;
            numberOfDeposits++;
        }
        return balance;
    }
}