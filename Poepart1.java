package com.mycompany.poepart1;

import java.util.Scanner;

public class Poepart1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Registration registration = new Registration();
        Login login = new Login();

        System.out.println("\n===== Register =====");

        System.out.println("Please enter Username:");
        String username = scan.nextLine();

        System.out.println("Enter Password:");
        String password = scan.nextLine();

        System.out.println("Enter Your Cellphone:");
        String cellphone = scan.nextLine();

        String registrationMessage =
                registration.registerUser(username, password, cellphone);

        System.out.println(registrationMessage);

        if (!registration.checkUserName(username)
                || !registration.checkPasswordComplexity(password)
                || !registration.checkCellPhoneNumber(cellphone)) {

            scan.close();
            return;
        }

        System.out.println("\n===== Login =====");

        System.out.println("Please enter Username:");
        String loginUsername = scan.nextLine();

        System.out.println("Please enter Password:");
        String loginPassword = scan.nextLine();

        boolean loginStatus =
                login.loginUser(loginUsername, loginPassword, registration);

        System.out.println(
                login.returnLoginStatus(loginStatus)
        );

        scan.close();
    }
}