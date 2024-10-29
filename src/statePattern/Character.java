package statePattern;

import strategyPattern.FightingStrategy;
import visitorPattern.EffectVisitor;

public class Character {
    private State state;
    private FightingStrategy strategy;

    public Character(State state, FightingStrategy strategy) {
        this.state = state;
        this.strategy = strategy;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setStrategy(FightingStrategy strategy) {
        this.strategy = strategy;
    }

    public void attack() {
        state.attack(this);
    }

    public void fight() {
        strategy.fight();
    }

    public void accept(EffectVisitor visitor) {
        visitor.apply(this);
    }



}
