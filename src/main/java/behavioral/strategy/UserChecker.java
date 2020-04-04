package behavioral.strategy;

import behavioral.strategy.strategy.AuthStrategy;

public class UserChecker {

    private String login;
    private String password;

    public UserChecker(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean check(AuthStrategy authStrategy) {
        return authStrategy.checkLogin(login, password);
    }
}
