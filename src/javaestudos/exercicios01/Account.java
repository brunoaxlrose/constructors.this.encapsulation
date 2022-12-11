/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaestudos.exercicios01;

/**
 *
 * @author Bruno
 */
public class Account {
    //Atributes
    private int numAccount;    
    private String nameHolder;
    private double balance;

    public Account(int numAccount, String nameHolder) {
        this.numAccount = numAccount;
        this.nameHolder = nameHolder;
        
    }

    public Account(int numAccount, String nameHolder, double inicialDeposit) {
        this.numAccount = numAccount;
        this.nameHolder = nameHolder;
        depositAccount(inicialDeposit);
    }
    

    Account() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //Método para depositar na conta 
    public void depositAccount(double amount){
        balance += amount;
    }
    
    //Método para sacar da conta, com taxa de 5 reais
    public void withdrawAccount(double amount){
        balance -= amount + 5.0;
    }

    //Getter and Setters
    public int getNumAccount() {
        return numAccount;
    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public double getBalance() {
        return balance;
    }

    public String toString(){
        return "Account"
                + numAccount 
                +", Holder: "
                + nameHolder
                +", Balance: $"
                + String.format("%.2f", balance);
    }
}
