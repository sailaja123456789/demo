package Sai;

public class StackExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        int sum = addNumbers(a, b);

        System.out.println("Sum: " + sum);
    }

    static int addNumbers(int x, int y) {
        int result = x + y;
        return result;
    }
}
