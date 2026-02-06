package com.zeta;

public class BankAccount {
    private int balance;

    public BankAccount(int balance){
        validateAmount(balance);
        this.balance=balance;
    }
    public synchronized void withdraw(float amount){
        System.out.println(Thread.currentThread().getName()+"Fetching Balance please wait...");
        validateAmount(amount);
        if (balance < amount) {
            throw new InsufficientBalanceException(
                    "current Balance=" + balance + ", But the Requested amount=" + amount);
        } else {
            try{
                Thread.sleep(3000);
            }
            catch (Exception e){}
            balance-=amount;
        }

    }
    public synchronized  void deposit(int amount){
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){}
        validateAmount(amount);
        balance+=amount;
    }
    public void validateAmount(float amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Amount cannot be negative.");
        }
    }


    public synchronized int getBalance() {
        return this.balance;
    }
}
