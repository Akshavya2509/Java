package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Lamborghini Aventador = new Lamborghini();

        Aventador.start();

        Maserati GranTurismo = new Maserati();
        GranTurismo.start();
    }
}
class Lamborghini extends Car{
    @Override
    void start(){
        System.out.println("Lamborghini is starting");
    }
}

class Maserati extends Car{
    @Override
    void start(){
        System.out.println("Maserati is starting");
    }
}
// U cannot create objects to any abstract class, they are just used for inheritance since they are concepts
abstract class Car{
    String brand;
    int price;

    void start(){
        System.out.println("Car is starting");
    }
}