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
public class ATM {
    String location;
    String branchName;

    public ATM(String location, String branchName) {
        this.location = location;
        this.branchName = branchName;
    }
    public void show(){
        System.out.println("Current location is:"+location);
    }
}
