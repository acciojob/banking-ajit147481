package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance,double minBalance) {
        this.name= this.name;
        this.balance= this.balance;
        this.minBalance=0;

    }

    public BankAccount() {

    }

    public String generateAccountNumber(int digits, int sum) throws Exception{
        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception
        int sum1=0;
        int temp=digits;
        while(temp>0){
            sum1+=(temp%10);
            temp/=10;
        }
        if(sum1!=sum){
            throw new Exception("Account Number can not be generated");
        }
        return null;
    }

    public void deposit(double amount) {
        //add amount to balance
        this.balance+=amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance
        if((balance-amount)>0 && (balance-amount)<minBalance){
            String s = "Insufficient Balance";
            throw new Exception(s);
        }
        balance-=amount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }
}