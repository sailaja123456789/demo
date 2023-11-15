package practice; 
public class LiteralExample {
    public static void main(String[] args) {
        // Integer Literals
        int decimalValue = 42;
        int octalValue = 052;
        int hexValue = 0x2A;

        // Floating-Point Literals
        double decimalDouble = 3.14;
        double scientificDouble = 3.0e8;

        // Character Literal
        char myChar = 'A';

        // String Literal
        String myString = "Hello, World!";

        // Boolean Literals
        boolean isTrue = true;
        boolean isFalse = false;

        // Null Literal
        String nullString = null;

        // Binary Literal (Java 7 and later)
        int binaryValue = 0b1101;

        // Underscores in Numeric Literals (Java 7 and later)
        int million = 1_000_000;

        // Printing the values of the literals
        System.out.println("Integer Literals: " + decimalValue + ", " + octalValue + ", " + hexValue);
        System.out.println("Floating-Point Literals: " + decimalDouble + ", " + scientificDouble);
        System.out.println("Character Literal: " + myChar);
        System.out.println("String Literal: " + myString);
        System.out.println("Boolean Literals: " + isTrue + ", " + isFalse);
        System.out.println("Null Literal: " + nullString);
        System.out.println("Binary Literal: " + binaryValue);
        System.out.println("Underscores in Numeric Literals: " + million);
    }
}
