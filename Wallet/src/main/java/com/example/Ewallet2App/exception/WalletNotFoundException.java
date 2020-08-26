package com.example.Ewallet2App.exception;

public class WalletNotFoundException extends RuntimeException {

    public WalletNotFoundException(int id) {

        super("Wallet id not found : " + id);
    }

}
