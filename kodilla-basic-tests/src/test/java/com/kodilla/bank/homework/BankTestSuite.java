package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    private Bank santander;
    private Bank pko;

    @BeforeEach
    public void setUp(){
    this.santander = new Bank("Santander", 3);
    this.pko = new Bank("PKO",2);

    santander.getCashMachine(0).deposit(200);
    santander.getCashMachine(1).deposit(100);
    santander.getCashMachine(2).deposit(50);
    santander.getCashMachine(2).deposit(-10);
    santander.getCashMachine(2).deposit(0);

    pko.getCashMachine(0).deposit(50);
    pko.getCashMachine(0).deposit(500);
    pko.getCashMachine(1).deposit(100);
    pko.getCashMachine(1).deposit(0);
    pko.getCashMachine(1).deposit(-20);

    santander.getCashMachine(0).withdraw(300);
    santander.getCashMachine(2).withdraw(600);
    santander.getCashMachine(2).withdraw(50);
    santander.getCashMachine(2).withdraw(-50);

    pko.getCashMachine(1).withdraw(50);
    pko.getCashMachine(0).withdraw(100);
    pko.getCashMachine(0).withdraw(0);
    pko.getCashMachine(0).withdraw(-20);
    }

    @Test
    public void checkBalancesAfterOperations(){
        assertEquals(-600, santander.totalBalance());
        assertEquals(500, pko.totalBalance());
    }

    @Test
    public void checkTotalNumberOfDeposits(){
        assertEquals(3, santander.totalNumberOfDeposits());
        assertEquals(3, pko.totalNumberOfDeposits());
    }

    @Test
    public void checkTotalNumberOfWithdrawals(){
        assertEquals(3, santander.totalNumberOfWithdrawals());
        assertEquals(2, pko.totalNumberOfWithdrawals());
    }

    @Test
    public void checkAverageWithdrawal(){
        assertEquals(316.66, santander.averageWithdrawal(), 0.05);
        assertEquals(75, pko.averageWithdrawal(), 0.05);
    }

    @Test
    public void checkAverageDeposit(){
        assertEquals(116.66, santander.averageDeposit(), 0.05);
        assertEquals(216.66, pko.averageDeposit(), 0.05);
    }

}