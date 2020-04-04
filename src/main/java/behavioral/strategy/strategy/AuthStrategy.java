package behavioral.strategy.strategy;

public interface AuthStrategy {
    boolean checkLogin(String login, String password);
}
