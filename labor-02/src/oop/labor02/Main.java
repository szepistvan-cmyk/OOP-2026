package oop.labor02;

public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("BT1");
        BankAccount account2 = new BankAccount("OTP0001");
        System.out.println(account1.getAccountNumber() + ":" + account1.getBalance());

        Rectangle rectangle1 = new Rectangle(10,10);
        System.out.println(rectangle1.getLenght());
    }
}
