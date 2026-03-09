package oop.labor04.lab4_2;

import oop.labor04.lab4_1.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();


        try (Scanner scanner = new Scanner(new File("lab4_2_input.csv"))) {
            Customer currentCustomer = null;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) continue;

                String[] items = line.split(",");
                if (items.length < 2) continue;

                if (items[0].trim().equals("Customer")) {
                    System.out.println(line);
                    String firstName = items[1].trim();
                    String lastName = items[2].trim();

                    currentCustomer = new Customer(firstName, lastName);
                    customers.add(currentCustomer);

                } else if (items[0].trim().equals("Account")) {

                    String accountNumber = items[1].trim();
                    double balance = Double.parseDouble(items[2].trim());

                    BankAccount account = new BankAccount(accountNumber, balance);

                    if (currentCustomer != null) {
                        currentCustomer.addAccount(account);
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (Customer c : customers) {
            System.out.println(c);
        }


    }
}

