/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseworkapp;

/**
 *
 * @author Евгений
 */
class Account {
    int accountNumber;
    double balance;
    Transaction transaction;

    public Account(int accountNumber, double balance, Transaction transaction) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transaction = transaction;
    }
    
}
