package com.zeta;

public class Bank {
    public boolean transfer(Account sender,Account reciever,float amount){
        float senderBalance= sender.getBalance();
        float recieverBalance=reciever.getBalance();
        if(senderBalance<amount){
            return false;
        }
        sender.setBalance(senderBalance-amount);
        reciever.setBalance(recieverBalance+amount);
        return true;



    }
}
