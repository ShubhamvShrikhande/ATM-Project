package com.Atm;
import java.util.Scanner;
public class ATM {
    float balance;
    int PIN = 1000;

    public void checkPin() {
        System.out.println("Enter your pin :");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();

        if (pin == PIN) {
            menu();
        } else {
            System.out.println("Enter a valid pin ");
        }
    }

    public void menu() {
        System.out.println("Enter your choice ");
        System.out.println("1. check A/C balance");
        System.out.println("2. withdraw money");
        System.out.println("3. Deposite money");
        System.out.println("4. Exit");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        switch (option) {
            case 1:
                checkbalance();
                menu();
                break;
            case 2:
                withdraw();
                menu();
                break;
            case 3:
                deposite();
                menu();
                break;
            case 4:
                System.out.println("Thank you for visiting !!");
                System.exit(0);

                break;
            default:
                System.out.println("Enter valid choice");
        }
    }

    public void checkbalance() {
        System.out.println("Balnace : " + balance);
    }

    public void withdraw() {
        System.out.println("Enter amount to withdraw : ");
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();

        if (amount > balance) {
            System.out.println("InSufficient balance");
        } else {
            balance = balance - amount;
            System.out.println("Money withdraw successfully");
        }
    }

    public void deposite() {
        System.out.println("Enter amount to deposite : ");
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();
        balance = balance + amt;
        System.out.println("Money deposite successfully");
    }

}
