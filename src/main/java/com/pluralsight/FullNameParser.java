package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        String trimmedFullName = fullName.trim();

        String[] name = trimmedFullName.split(" ");
        if(name.length > 2){
            System.out.println("First Name: " + name[0]);
            System.out.println("Middle Name: " + name[1]);
            System.out.println("Last Name: " + name[2]);
        } else{
            System.out.println("First Name: " + name[0]);
            System.out.println("Last Name: " + name[1]);
        }
    }
}
