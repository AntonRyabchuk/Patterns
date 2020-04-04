package behavioral.strategy.strategy;

import java.io.File;

public class FileAuth implements AuthStrategy {

    private File file;

    public FileAuth(File file) {
        this.file = file;
    }

    @Override
    public boolean checkLogin(String login, String password) {
        System.out.println("Checking with file");
        return checkFromFile(login, password);
    }

    private boolean checkFromFile(String login, String password) {
        //...
        return false;
    }
}
