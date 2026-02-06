package com.zeta;


public class InsufficientBalanceException  extends RuntimeException{  //POJO
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
