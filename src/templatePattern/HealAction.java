package templatePattern;

public class HealAction extends GameAction {
    @Override
    protected void perform() {
        System.out.println("Healing the character!");
    }
}
