public class MuteQuack implements QuackBehavior{

    // Implementing quack method from the interface QuackBehavior
    @Override
    public void quack() {
        System.out.println("I am on Mute...");
    }
    
}
