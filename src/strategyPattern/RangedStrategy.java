package strategyPattern;

public class RangedStrategy implements FightingStrategy {
    @Override
    public void fight() {
        System.out.println("Shooting an arrow!");
    }
}
