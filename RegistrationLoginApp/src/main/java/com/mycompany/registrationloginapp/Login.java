/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationloginapp;

/**
 *
 * @author brook
 */
public class Login {
    private String storedUsername;
    private String storedPassword;

    public Login(String username, String password) {
        this.storedUsername = username;
        this.storedPassword = password;
    }

    public boolean loginUser(String username, String password) {
        return this.storedUsername != null && this.storedUsername.equals(username) && this.storedPassword != null && this.storedPassword.equals(password);
    }

    public String returnLoginStatus(boolean loginSuccess, String username) {
        if (loginSuccess) {
            return "Welcome " + username + ", it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again.";
        }
    }
}
