package behavioral.strategy;

import behavioral.strategy.strategy.DBAuth;
import behavioral.strategy.strategy.FileAuth;

import java.io.File;

/**
 * Выбор одного из семейства алгоритмов для выполнения действия
 * Не зависит от конкретных реализаций
 * Смысл действия один, реализации – разные
 * Классический пример – сортировка Collections.sort()
 *
 * Отличие от State:
 * Не хранит ссылку на объект
 * Одноразовое действие
 */
public class Main {
    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker("login", "pass");

        userChecker.check(new DBAuth("db path"));
        userChecker.check(new FileAuth(new File("file path")));
    }
}
