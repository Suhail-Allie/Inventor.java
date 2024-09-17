package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

    public class InventionDemo {
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
            Inventor inventor = new Inventor(inventorName, inventorCountry);

            // Prompt for date of invention
            System.out.print("Enter the date of invention (yyyy-MM-dd): ");
            String dateString = scanner.nextLine();
            LocalDate dateOfInvention = LocalDate.parse(dateString, dateFormatter);

            // Create an Invention object
            Invention invention = new Invention(description, inventor, dateOfInvention);

            // Display the invention details
            System.out.println("\nInvention Details:");
            System.out.println(invention);

            scanner.close();
        }
    }


