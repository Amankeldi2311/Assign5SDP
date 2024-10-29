package visitorPattern;

import statePattern.Character;

public class DamageEffect implements EffectVisitor {

    @Override
    public void apply(Character character) {
        System.out.println("Applying damage effects to Character");
    }
}
