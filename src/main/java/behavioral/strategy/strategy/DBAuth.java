package behavioral.strategy.strategy;

public class DBAuth implements AuthStrategy {

    private String dbUrl;

    public DBAuth(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Override
    public boolean checkLogin(String login, String password) {
        System.out.println("Checking with db");
        return checkFromDB(login, password);
    }

    private boolean checkFromDB(String login, String password) {
        //...
        return true;
    }
}
