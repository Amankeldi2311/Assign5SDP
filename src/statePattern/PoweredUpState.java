package statePattern;

public class PoweredUpState implements State{
    public void attack(Character character){
        System.out.println("Powered up attack");
    }
}
