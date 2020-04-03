package creational.singleton;

/**
 * + Ленивая инициализация
 * - Низкая производительность (критическая секция) в наиболее типичном доступе
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){
    }

    public static synchronized LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
