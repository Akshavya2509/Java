package OOPS;

public class Interfaces{
    public static void main(String[] args) {
        
    }

    public void start(){
        System.out.println("Car is starting");
    }

    OptimusPrime op = new OptimusPrime();
    op.transformToACar();
    op.drive();
}
// Everything in an interface is public by default

class OptimusPrime extends Transformer implements car, transformToCar, TranformerModes{
    @Override
    public void transformToACar(){
        System.out.println("Optimus Prime is transforming");
    }
    @Override
    public void walk(){
        System.out.println("Optimus Prime is walking");
    }
    @Override
    public void fire(){
        System.out.println("Optimus Prime is firing");
    }
    @Override
    public void start(){
        System.out.println("Optimus Prime is starting");
    }

    @Override
    public void drive(){
        System.out.println("Optimus Prime is driving");
    }

    @Override
    public void stop(){
        System.out.println("Optimus Prime is stopping");
    }

    @Override
    public void fight(){
        System.out.println("Optimus Prime is fighting");
    }

    @Override
    public void TransformToRobot(){
        System.out.println("Optimus Prime is transforming to a robot");
    }

    @Override
    public void talk(){
        System.out.println("Optimus Prime is talking");
    }
}

// An abstract class Transformer which has some properties of a transformer. It can be inherited in the different tranformer classes
abstract class Transformer{
    String name;
    int power;
    int speed;
    int strength;
    abstract void talk();
}

//interface tranform that has a functionality of a transformer
interface transformToCar{
    void transformToACar();
}

interface TranformerModes{
    void TransformToRobot();
    void walk();
    void fire();
    void fight();
}
// interface car that has a functionality of a car which a transformer can tranform into
interface car{
    void start();
    void drive();
    void stop();
}
