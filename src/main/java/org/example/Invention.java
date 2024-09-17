package org.example;
import java.time.LocalDate;

public record Invention
        (String description, Inventor inventor, LocalDate dateOfInvention) {

    // Constructor

    // toString() method
    @Override
    public String toString() {
        return "Invention Description: " + description + "\n" +
                "Inventor: " + inventor.name() + " (" + inventor.countryOfOrigin() + ")\n" +
                "Date of Invention: " + dateOfInvention;
    }
}

