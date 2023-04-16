public class DecoyDuck extends Duck{

    // Constructor for Decoy Duck
    DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        swimBehavior = new Drown();
    }

    // Displaying type of duck overriding the abstract method from Duck class
    @Override
    public void display() {
        System.out.println("I am a Decoy Duck...");
    }
}