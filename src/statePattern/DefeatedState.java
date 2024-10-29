package statePattern;

public class DefeatedState implements State{
    public void attack(Character character){
        System.out.println("Defeated attack");
    }
}
