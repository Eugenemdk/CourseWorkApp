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
public class ATMCard {
    int pin;
    long cardID;
    Account account;

    public ATMCard(int pin, long cardID, Account account) {
        this.pin = pin;
        this.cardID = cardID;
        this.account = account;
    }
    
}
