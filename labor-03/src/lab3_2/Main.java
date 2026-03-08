package lab3_2;

import lab3_1.BankAccount;


public class Main {
    public static void main(String args[]) {
        Customer customer1 = new Customer("SZEP", "ISTVAN");
        Customer customer2 = new Customer("TOK", "ODON");

        customer1.addAccount(new BankAccount("BT1", 10000));
        customer1.addAccount(new BankAccount("BT2", 10000));
        customer1.addAccount(new BankAccount("BT3", 10000));
        customer1.addAccount(new BankAccount("BT4", 10000));
        customer1.addAccount(new BankAccount("BT5", 10000));
        customer1.addAccount(new BankAccount("BT6", 10000));
        customer1.addAccount(new BankAccount("BT7", 10000));
        customer1.addAccount(new BankAccount("BT8", 10000));
        customer1.addAccount(new BankAccount("BT9", 10000));

        customer2.addAccount(new BankAccount("OTP1", 10000));
        customer2.addAccount(new BankAccount("OTP2", 10000));
        customer2.addAccount(new BankAccount("OTP3", 10000));
        customer2.addAccount(new BankAccount("OTP4", 10000));
        customer2.addAccount(new BankAccount("OTP5", 10000));

        System.out.println(customer1);
        System.out.println(customer2);

        customer1.getAccount("BT1").deposit(7500);
        customer1.getAccount("BT8").deposit(7500);
        customer1.getAccount("BT3").deposit(7500);

        customer2.getAccount("OTP1").deposit(7500);
        customer2.getAccount("OTP4").deposit(7500);

        System.out.println("After deposit:");
        System.out.println(customer1);

        System.out.println("After deposit:");
        System.out.println(customer2);

        customer1.closeAccount("BT1");
        System.out.println(customer1);




    }
}
