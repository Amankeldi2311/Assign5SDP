import statePattern.DefeatedState;
import statePattern.NormalState;
import statePattern.PoweredUpState;
import strategyPattern.MagicStrategy;
import strategyPattern.MeleeStrategy;
import strategyPattern.RangedStrategy;
import templatePattern.AttackAction;
import templatePattern.DefendAction;
import templatePattern.GameAction;
import templatePattern.HealAction;
import visitorPattern.BoostEffect;
import visitorPattern.DamageEffect;
import visitorPattern.EffectVisitor;
import statePattern.Character;

public class Main {
    public static void main(String[] args) {
        Character character = new Character(new NormalState(), new MeleeStrategy());

        // Change States
        character.attack();
        character.setState(new PoweredUpState());
        character.attack();
        character.setState(new DefeatedState());
        character.attack();

        // Change Fighting Strategies
        character.setStrategy(new RangedStrategy());
        character.fight();
        character.setStrategy(new MagicStrategy());
        character.fight();
        // Execute Game Actions
        GameAction attack = new AttackAction();
        attack.executeAction();

        GameAction defend = new DefendAction();
        defend.executeAction();

        GameAction heal = new HealAction();
        heal.executeAction();

        // Apply Visitor Effects
        EffectVisitor boost = new BoostEffect();
        character.accept(boost);

        EffectVisitor damage = new DamageEffect();
        character.accept(damage);

        }
    }