package strategyPattern;

public class MagicStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Casting a spell!");
    }
}
