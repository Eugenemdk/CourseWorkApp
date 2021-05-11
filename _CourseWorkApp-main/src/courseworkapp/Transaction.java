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
class Transaction {
    Object date;
    double amount;

    public Transaction(Object date, double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
}
