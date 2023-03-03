package com.kodilla.bank.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    private CashMachine cashMachineA;

    @BeforeEach
    public void setUp(){
        this.cashMachineA = new CashMachine();
    }

    @Test
    public void withdrawPositiveInteger(){
        cashMachineA.withdraw(200);
        int[] expectedTransactions = {-200};
        assertArrayEquals(expectedTransactions, cashMachineA.getTransactions());
        assertEquals(-200, cashMachineA.getBalance());
        assertEquals(1, cashMachineA.getNumberOfWithdrawals());
        assertEquals(1, cashMachineA.getNumberOfTransactions());
    }

    @Test
    public void withdrawNegativeInteger(){
        cashMachineA.withdraw(-20);
        int[] expectedTransactions = {};
        assertArrayEquals(expectedTransactions, cashMachineA.getTransactions());
        assertEquals(0, cashMachineA.getBalance());
        assertEquals(0, cashMachineA.getNumberOfWithdrawals());
        assertEquals(0, cashMachineA.getNumberOfTransactions());
    }

    @Test
    public void withdrawIntegerNotEndingWithZero(){
        cashMachineA.withdraw(302);
        int[] expectedTransactions = {};
        assertArrayEquals(expectedTransactions, cashMachineA.getTransactions());
        assertEquals(0, cashMachineA.getBalance());
        assertEquals(0, cashMachineA.getNumberOfWithdrawals());
        assertEquals(0, cashMachineA.getNumberOfTransactions());
    }

    @Test
    public void withdrawZero(){
        cashMachineA.withdraw(0);
        int[] expectedTransactions = {};
        assertArrayEquals(expectedTransactions, cashMachineA.getTransactions());
        assertEquals(0, cashMachineA.getBalance());
        assertEquals(0, cashMachineA.getNumberOfWithdrawals());
        assertEquals(0, cashMachineA.getNumberOfTransactions());
    }

    @Test
    public void depositPositiveInteger(){
        cashMachineA.deposit(100);
        int[] expectedTransactions = {100};
        assertArrayEquals(expectedTransactions, cashMachineA.getTransactions());
        assertEquals(100, cashMachineA.getBalance());
        assertEquals(1, cashMachineA.getNumberOfDeposits());
        assertEquals(1, cashMachineA.getNumberOfTransactions());
    }

    @Test
    public void depositNegativeInteger(){
        cashMachineA.deposit(-100);
        int[] expectedTransactions = {};
        assertArrayEquals(expectedTransactions, cashMachineA.getTransactions());
        assertEquals(0, cashMachineA.getBalance());
        assertEquals(0, cashMachineA.getNumberOfDeposits());
        assertEquals(0, cashMachineA.getNumberOfTransactions());
    }

    @Test
    public void depositZero(){
        cashMachineA.deposit(0);
        int[] expectedTransactions = {};
        assertArrayEquals(expectedTransactions, cashMachineA.getTransactions());
        assertEquals(0, cashMachineA.getBalance());
        assertEquals(0, cashMachineA.getNumberOfDeposits());
        assertEquals(0, cashMachineA.getNumberOfTransactions());
    }
}