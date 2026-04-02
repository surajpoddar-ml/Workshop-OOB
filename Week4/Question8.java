package Week4;

import java.util.Scanner;

class UserAccount {
    String name;
    String mobile;

    UserAccount(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    void displayInfo() {
        System.out.println("User: " + name + " | Mobile: " + mobile);
    }
}

class Customer extends UserAccount {
    String dob;

    Customer(String name, String mobile, String dob) {
        super(name, mobile);
        this.dob = dob;
    }
}

class PremiumCustomer extends Customer {
    String password;

    PremiumCustomer(String name, String mobile, String dob, String password) {
        super(name, mobile, dob);
        this.password = password;
    }

    @Override
    void displayInfo() {
        System.out.println("\n--- Registration Details ---");
        System.out.println("Full Name: " + name);
        System.out.println("Username (Mobile): " + mobile);
        System.out.println("DOB: " + dob);
        System.out.println("Status: Premium Member Created");
        System.out.println("Verified by: Suraj Poddar");
    }
}

public class Question8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Sign up");
            System.out.println("2. Quit");
            String choice = input.nextLine();

            if (choice.equals("2")) {
                System.out.println("Thank you for using the Application.");
                running = false;
            } else if (choice.equals("1")) {
                processSignup(input);
            }
        }
    }

    public static void processSignup(Scanner input) {
        System.out.print("Enter full name: ");
        String name = input.nextLine();

        System.out.print("Enter mobile: ");
        String mobile = input.nextLine();

        System.out.print("Enter password: ");
        String pass = input.nextLine();

        System.out.print("Confirm password: ");
        String confirm = input.nextLine();

        System.out.print("Enter DOB (DD/MM/YYYY): ");
        String dob = input.nextLine();

        
        if (name.length() <= 4 || mobile.length() != 10 || !mobile.startsWith("0")) {
            System.out.println("Signup Failed: Check name length or mobile format.");
        } else if (!pass.equals(confirm)) {
            System.out.println("Signup Failed: Passwords do not match.");
        } else if (dob.length() != 10) {
            System.out.println("Signup Failed: Invalid Date format.");
        } else {
            // Age calculation
            int year = Integer.parseInt(dob.substring(6));
            if ((2026 - year) < 21) {
                System.out.println("Signup Failed: You must be 21 or older.");
            } else {
                // Final object creation using Multilevel Inheritance
                PremiumCustomer newUser = new PremiumCustomer(name, mobile, dob, pass);
                System.out.println("Success!");
                newUser.displayInfo();
            }
        }
    }
}