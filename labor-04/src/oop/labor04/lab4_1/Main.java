package oop.labor04.lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        System.out.println("Persons: "+persons);

        persons.add(new Person("Szep", "Istvan",2006));

        System.out.println("Persons: "+persons);
        System.out.println("Lista hossza: "+persons.size());


        try (Scanner scanner = new Scanner(new File("lab4_1_input.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                if(items.length < 3) {
                    System.out.println("Error: Invalid input:"+line);
                    continue;
                }
                // trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                // Convert String → int: Integer.parseInt( String)
                int birthYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birthYear));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for(Person p: persons){
            System.out.println(p);
        }

    }
}
