package practice;
public class classjava {
    // Fields
    private String name;
    private int age;

    // Constructor
    public classjava (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an instance of the Person class
        classjava person1 = new classjava("Alice", 30);

        // Accessing and modifying fields using getters and setters
        person1.setName("Bob");
        person1.setAge(25);

        // Calling a method to display information
        person1.displayInfo();
    }
}
