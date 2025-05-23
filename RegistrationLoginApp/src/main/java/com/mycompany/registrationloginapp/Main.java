/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationloginapp;
import java.util.Scanner;
/**
 *
 * @author brook
 */
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Registration registrationSystem = new Registration();
            
            System.out.println("--- Registration ---");
            System.out.print("Enter your username for registration: ");
            String regUsername = scanner.nextLine();
            System.out.print("Enter your password for registration: ");
            String regPassword = scanner.nextLine();
            System.out.print("Enter your South African cell phone number (e.g., +27xxxxxxxxx): ");
            String regCellNumber = scanner.nextLine();
            
            String registrationResult = registrationSystem.registerUser(regUsername, regPassword, regCellNumber);
            System.out.println(registrationResult);
            
            System.out.println("\n--- Login ---");
            String registeredUsername = registrationSystem.getRegisteredUsername();
            String registeredPassword = registrationSystem.getRegisteredPassword();
            
            if (registeredUsername != null && registeredPassword != null) {
                Login loginSystem = new Login(registeredUsername, registeredPassword);
                System.out.print("Enter your username to log in: ");
                String loginUsername = scanner.nextLine();
                System.out.print("Enter your password to log in: ");
                String loginPassword = scanner.nextLine();
                
                boolean loginSuccess = loginSystem.loginUser(loginUsername, loginPassword);
                String loginMessage = loginSystem.returnLoginStatus(loginSuccess, loginUsername);
                System.out.println(loginMessage);
            } else {
                System.out.println("No user registered successfully. Login cannot proceed.");
            }
        }
    }
}