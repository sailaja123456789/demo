package Sai;

public class Methods {

    
    static void sayHello() {
        System.out.println("Hello, World!");
    }

    
    static int add(int a, int b) {
        return a + b;
    }

    
    static void printDetails(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        
        sayHello();

        
        int result = add(5, 3);
        System.out.println("Result of addition: " + result);

        
        printDetails("John Doe", 25);
    }
}

