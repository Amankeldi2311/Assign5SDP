package visitorPattern;

import statePattern.Character;

public class BoostEffect implements EffectVisitor {
    @Override
    public void apply(Character character) {
        System.out.println("Applying boost effects to Character");
    }
}
