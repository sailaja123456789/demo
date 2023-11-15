package Sai;

public class IfElseIf {
    public static void main(String[] args) {
        int number = 75;

        // If-else if statement
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println(number + " is zero.");
        }

        // Multiple conditions using else if
        int dayOfWeek = 3;
        if (dayOfWeek == 1) {
            System.out.println("It's Monday.");
        } else if (dayOfWeek == 2) {
            System.out.println("It's Tuesday.");
        } else if (dayOfWeek == 3) {
            System.out.println("It's Wednesday.");
        } else if (dayOfWeek == 4) {
            System.out.println("It's Thursday.");
        } else if (dayOfWeek == 5) {
            System.out.println("It's Friday.");
        } else if (dayOfWeek == 6 || dayOfWeek == 7) {
            System.out.println("It's the weekend.");
        } else {
            System.out.println("Invalid day of the week.");
        }
    }
}
