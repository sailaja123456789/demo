package Sai;

public class WideningCastingExample {
    public static void main(String[] args) {
       
        int intValue = 10;
        double doubleValue = intValue; 

        System.out.println("Original int value: " + intValue);
        System.out.println("Widened double value: " + doubleValue);

        
        float floatValue = 20.5f;
        double anotherDoubleValue = floatValue; 

        System.out.println("Original float value: " + floatValue);
        System.out.println("Widened double value: " + anotherDoubleValue);
    }
}

