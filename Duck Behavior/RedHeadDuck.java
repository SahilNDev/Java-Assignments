public class RedHeadDuck extends Duck{

    // Constructor for Red Head Duck
    RedHeadDuck() {
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