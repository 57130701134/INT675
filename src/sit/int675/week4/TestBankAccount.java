/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int675.week4;

/**
 *
 * @author Student Lab
 */
public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        BankAccount bb = new BankAccount();
        BankAccount bc = new BankAccount(100009, "Apichai", 9500.01);
        System.out.println("bc = " + bc.getAccountId() + "," + bc.getName() + "," + bc.getBalance());

        ba.deposit(550);
        ba.setAccountId(900001);
        ba.setName("Somchat");

        bb.setAccountId(900005);
        bb.setName("Somsri");
        bb.withdraw(999);

        System.out.println("Account ID: " + ba.getAccountId());
        System.out.println("Account Name: " + ba.getName());
        System.out.println("Balance: " + ba.getBalance());
        System.out.println("------------------------------");
        System.out.println("Account ID: " + bb.getAccountId());
        System.out.println("Account Name: " + bb.getName());
        System.out.println("Balance: " + bb.getBalance());

        StringBuilder str1 = new StringBuilder();
        str1.append(900.50);
        str1.append("ABCDXXX");
        str1.append("ddddd");
        str1.insert(3, "-----");
        System.out.println(str1);
    }
}
