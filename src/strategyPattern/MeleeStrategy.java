package strategyPattern;

public class MeleeStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Swinging a sword!");
    }
}
