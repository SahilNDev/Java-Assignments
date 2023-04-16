public class MallardDuck extends Duck{

    // Constructor for Mallard Duck
    MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }

    // Displaying type of duck overriding the abstract method from Duck class
    @Override
    void display() {
        System.out.println("I am Mallard Duck....");
    }
    
}
