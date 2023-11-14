package OOPS;

public class MainClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "Anuj";

        Person p2 = new Person();
        p2.name = "Juna";
        p2.age = 24;

        print(p1);
        print(p1);
    }

    private static void print(Person p){
        System.out.println("Name: " + p.name + " Age: " + p.age);
        p.walk();
        p.eat();
    }
}

class Person {
    String name;
    int age;

    void walk(){
        System.out.println("This person is lazy and fat, means he doesnt walk at all");
    }

    void eat(){
        System.out.println("This person is lazy and fat, means he eats a lot");
    }
}