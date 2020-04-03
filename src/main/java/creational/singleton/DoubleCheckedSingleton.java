package creational.singleton;

//TODO взято с хабра, примерно понимаю почему оно лучше LazySingleton (место synchronized?),
// разобраться после изучения многопоточности
/**
 * + Ленивая инициализация
 * + Высокая производительность
 * - Поддерживается только с JDK 1.5 [5]
 */
public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance;

    public static DoubleCheckedSingleton getInstance() {
        DoubleCheckedSingleton localInstance = instance;
        if (localInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return localInstance;
    }
}
