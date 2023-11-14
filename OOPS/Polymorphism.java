package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Person p1 = new Person(24, "Anuj");
        Person p2 = new Person();
        p2.name = "Vishal";
        p2.age = 24;

        Manager m1 = new Manager(24, "Anuj");
        m1.walk();
        m1.walk(22);
    }
}

class Person{
    int age;
    String name;

    // Constructor
    public Person(){
        this.age = 0;
        this.name = "";
    }
    public Person(int age, String name){
        this();
        this.age = age;
        this.name = name;
    }
    // Compile time polymorphism i.e two functions have same name, with only difference that they have different number of arguments
    void walk(){
        System.out.println(name + " is lazy and fat, means he doesnt walk at all");
    }

    void walk(int steps){
        System.out.println(name + " Walked " + steps + " steps");
    }
}

// Inheritance
class Manager extends Person{
    public Manager(int age, String name){
        //Super keyord is used to call constructore of the parent class
        super(age, name);
    }

}
