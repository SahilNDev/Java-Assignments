public abstract class Duck {
    // Creating objects of the three interfaces
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    
    // Abstract method that needs to be overridden where the class in implemented.
    abstract void display();

    // Preforming the Quack method of Quack Behavior
    public void performQuack() {
        this.quackBehavior.quack();
    }

    // Preforming the Fly method of Fly Behavior
    public void performFly() {
        this.flyBehavior.fly();
    }

    // Preforming the Swim method of Swim Behavior
    public void performSwim() {
        this.swimBehavior.swim();
    }
}
