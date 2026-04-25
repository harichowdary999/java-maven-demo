package com.demo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalClasses;
        int attendedClasses;
        double percentage;
        int requiredClasses;

        System.out.println("===== Attendance Calculator =====");

        System.out.print("Enter Total Classes Conducted: ");
        totalClasses = sc.nextInt();

        System.out.print("Enter Classes Attended: ");
        attendedClasses = sc.nextInt();

        percentage = (attendedClasses * 100.0) / totalClasses;

        System.out.println("Current Attendance Percentage: " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Status: Eligible");
        } else {
            System.out.println("Status: Not Eligible");

            requiredClasses = (int)Math.ceil((0.75 * totalClasses) - attendedClasses);

            System.out.println("Attend next " + requiredClasses + " classes continuously to reach 75%.");
        }

        sc.close();
    }
}
