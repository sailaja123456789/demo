package practice;

public class object {
    String name;
    int age;

    public object(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old.");
    }
}
