package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle Name:");
        String middleName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Suffix: ");
        String suffix = scanner.nextLine();

        result = result + " "+  firstName;

        if (!middleName.isEmpty()){
            result = result + " "+ middleName;

        }
        result = result + " " + lastName;

        if(!suffix.isEmpty()){
            result = result + ", " +suffix;
        }
        System.out.print(result);
    }


}
