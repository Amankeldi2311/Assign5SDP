package templatePattern;

public abstract class GameAction {
    public void executeAction() {
        start();
        perform();
        end();
    }

    protected abstract void perform();

    private void start() {
        System.out.println("Starting action...");
    }

    private void end(){
        System.out.println("Ending action...");
    }
}
