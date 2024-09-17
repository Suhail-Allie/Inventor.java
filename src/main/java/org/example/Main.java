package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    //Inventor
    public record Inventor(String name, String countryOfOrigin) {
    }

    //Invention
    public record Invention
            (String description, org.example.Inventor inventor, LocalDate dateOfInvention) {

        // Constructor

        // toString() method
        @Override
        public String toString() {
            return "Invention Description: " + description + "\n" +
                    "Inventor: " + inventor.name() + " (" + inventor.countryOfOrigin() + ")\n" +
                    "Date of Invention: " + dateOfInvention;
        }
    }

    //InventionDemo
    public static class InventionDemo {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Prompt for invention description
            System.out.print("Enter the description of the invention: ");
            String description = scanner.nextLine();

            // Prompt for inventor details
            System.out.print("Enter the inventor's name: ");
            String inventorName = scanner.nextLine();
            System.out.print("Enter the inventor's country of origin: ");
            String inventorCountry = scanner.nextLine();
            org.example.Inventor inventor = new org.example.Inventor(inventorName, inventorCountry);

            // Prompt for date of invention
            System.out.print("Enter the date of invention (yyyy-MM-dd): ");
            String dateString = scanner.nextLine();
            LocalDate dateOfInvention = LocalDate.parse(dateString, dateFormatter);

            // Create an Invention object
            org.example.Invention invention = new org.example.Invention(description, inventor, dateOfInvention);

            // Display the invention details
            System.out.println("\nInvention Details:");
            System.out.println(invention);

            scanner.close();
        }
    }

}