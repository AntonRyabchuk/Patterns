package behavioral.state.action;

public class Sleeping implements Activity {
    @Override
    public void performAction() {
        System.out.println("Sleeping");
    }
}
