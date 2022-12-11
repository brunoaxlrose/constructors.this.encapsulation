/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaestudos.exercicios01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class Program {

    //Construtores, this, sobrecarga, encapsulamento
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Account account;

        System.out.print("Enter account number: ");
        int number = scan.nextInt();
        System.out.print("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scan.next().charAt(0);
        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = scan.nextDouble();
        account.depositAccount(depositValue);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = scan.nextDouble();
        account.withdrawAccount(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(account);
        scan.close();
    }

}
