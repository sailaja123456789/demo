package Sai;

public class IfElse {
    public static void main(String[] args) {
        int number = 15;

        // If-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        // Nested if-else statement
        int age = 25;
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        // Chained if-else statement
        int score = 85;
        if (score >= 90) {
            System.out.println("Excellent!");
        } else if (score >= 80) {
            System.out.println("Good job!");
        } else if (score >= 70) {
            System.out.println("Nice effort.");
        } else {
            System.out.println("You can do better.");
        }
    }
}
