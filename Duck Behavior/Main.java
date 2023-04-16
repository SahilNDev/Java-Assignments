public class Main {
    public static void main(String[] args) {
        // Executing Functions for Mallard Duck
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.performSwim();
        System.out.println();

        // Executing Functions for Rubber Duck
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
        rubberDuck.performSwim();
        System.out.println();

        // Executing Functions for Red Head Duck
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();
        redHeadDuck.performSwim();
        System.out.println();

        // Executing Functions for Decoy Duck
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();
        decoyDuck.performSwim();
    }
}
