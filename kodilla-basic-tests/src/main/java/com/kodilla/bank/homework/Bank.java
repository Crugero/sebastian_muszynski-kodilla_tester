package com.kodilla.bank.homework;

public class Bank {

    private String name;
    private CashMachine[] machines;

    public Bank(String name, int numberOfMachines) {
        this.name = name;
        this.machines = new CashMachine[numberOfMachines];
        for (int i = 0; i < numberOfMachines; i++) {
            this.machines[i] = new CashMachine();
        }
    }

    public CashMachine getCashMachine(int index){
            return machines[index];
    }

    public int totalBalance(){
        int sum = 0;
        for (int i = 0; i < machines.length; i++){
            sum += machines[i].getBalance();
        }
        return sum;
    }

    public int totalNumberOfDeposits(){
        int totalDepos = 0;
        for (int i = 0; i < machines.length; i++){
            totalDepos += machines[i].getNumberOfDeposits();
        }
        return totalDepos;
    }

    public int totalNumberOfWithdrawals(){
        int totalWithds = 0;
        for (int i = 0; i < machines.length; i++){
            totalWithds += machines[i].getNumberOfWithdrawals();
        }
        return totalWithds;
    }

    public double averageWithdrawal(){
        int sum = 0;
        int count = totalNumberOfWithdrawals();
        for (int i = 0; i < machines.length; i++){
            int[] transactions = machines[i].getTransactions();
            for(int j = 0; j < transactions.length; j++){
                int number = transactions[j];
                if (number < 0) {
                    sum += number;
                }
            }
        }
        if (count == 0){
            return 0;
        }
        int absSum = Math.abs(sum);
        return (double)absSum / count;
    }

    public double averageDeposit(){
        int sum = 0;
        int count = totalNumberOfDeposits();
        for (int i = 0; i < machines.length; i++){
            int[] transactions = machines[i].getTransactions();
            for(int j = 0; j < transactions.length; j++){
                int number = transactions[j];
                if (number > 0) {
                    sum += number;
                }
            }
        }
        if (count == 0){
            return 0;
        }
        int absSum = Math.abs(sum);
        return (double)absSum / count;
    }
}