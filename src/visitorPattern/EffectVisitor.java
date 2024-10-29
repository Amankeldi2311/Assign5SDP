package visitorPattern;

import statePattern.Character;

public interface EffectVisitor {
    void apply(Character character);    

}

