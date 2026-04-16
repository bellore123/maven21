package com.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static class User {
        public String name;
        public String id;
        public List<String> books = new ArrayList<>();
        public int daysBorrowed;

        public double calculateFine() {
            int limit = 7;
            double rate = 5.0;
            return Math.max(0, (daysBorrowed - limit) * rate);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.print("Enter Name: ");
        user.name = sc.nextLine();
        System.out.print("Enter ID: ");
        user.id = sc.nextLine();
        System.out.print("How many books? ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter book title: ");
            user.books.add(sc.nextLine());
        }

        System.out.print("Days borrowed: ");
        user.daysBorrowed = sc.nextInt();

        System.out.println("\n--- Report ---");
        System.out.println("User: " + user.name + " (" + user.id + ")");
        System.out.println("Books: " + user.books);
        System.out.println("Total Fine: $" + user.calculateFine());
        sc.close();
    }
}
