package Sai;

public class NarrowingCasting {
    public static void main(String[] args) {
       
        double doubleValue = 30.75;
        int intValue = (int) doubleValue; 

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed int value: " + intValue);

        
        float floatValue = 20.5f;
        int anotherIntValue = (int) floatValue; 

        System.out.println("Original float value: " + floatValue);
        System.out.println("Narrowed int value: " + anotherIntValue);
    }
}
