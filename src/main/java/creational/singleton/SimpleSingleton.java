package creational.singleton;

/**
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 */
public class SimpleSingleton {

    private static final SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton(){
    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
