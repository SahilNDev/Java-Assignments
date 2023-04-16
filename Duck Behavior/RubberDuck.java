public class RubberDuck extends Duck{

    // Constructor for Rubber Duck
    RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior = new Float();
    }

    // Displaying type of duck overriding the abstract method from Duck class
    @Override
    void display() {
        System.out.println("I am a Rubber Duck...");
    }
    
}
