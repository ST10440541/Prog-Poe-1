/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginapp;

import java.util.regex.*;

public class LoginApp {

    // Fields
    private String username;
    private String password;
    private String cellNumber;
    private String firstName;
    private String lastName;

    // Constructor
    public LoginApp(String username, String password, String cellNumber, String firstName, String lastName) {
        this.username = username;
        this.password = password;
        this.cellNumber = cellNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Username validation
    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    // Password validation
    public boolean checkPasswordComplexity() {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") &&
               password.matches(".*[0-9].*") &&
               password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
    }

    // Cell number validation
    public boolean checkCellPhoneNumber() {
        return cellNumber.matches("^\\+27\\d{9}$");
    }

    
/**
 * The cell phone number validation regex was generated with the assistance of ChatGPT (OpenAI, 2025).
 * Reference: OpenAI. (2025). ChatGPT [Large language model]. https://chat.openai.com
 */
    
    
    // Registration logic
    public String registerUser() {
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()) {
            return "Cell phone number incorrectly formatted or does not contain international code.";
        }
        return "Username successfully captured.\nPassword successfully captured.\nCell phone number successfully added.";
    }

    // Login method
    public boolean loginUser(String inputUsername, String inputPassword) {
        return this.username.equals(inputUsername) && this.password.equals(inputPassword);
    }

    // Welcome message
    public String getWelcomeMessage() {
        return "Welcome " + firstName + ", " + lastName + " it is great to see you again.";
    }

    // Main method to run everything
    public static void main(String[] args) {
        // Create a new user with new sample values
        LoginApp user = new LoginApp("amy_2", "Secur3!Pass", "+27711234567", "Amy", "Smith");

        // Registration output
        System.out.println(user.registerUser());

        // Attempt login
        if (user.loginUser("amy_2", "Secur3!Pass")) {
            System.out.println(user.getWelcomeMessage());
        } else {
            System.out.println("Username or password incorrect, please try again.");
        }
    }
}
