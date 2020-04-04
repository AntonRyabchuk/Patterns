package behavioral.state;

import behavioral.state.action.Activity;
import behavioral.state.action.Sleeping;

/**
 * Позволяет управлять поведением объекта в зависимости от его состояния
 * Изменение Состояния может быть выполнено контекстом или состоянием объекта самостоятельно
 *
 * Порядок перехода состояния хорошо определен в паттерне Состояние, такого требования нет к паттерну Стратегия.
 * Клиент волен в выборе любой реализации Стратегии на его выбор.
 */
public class Main {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Developer developer = new Developer();

        developer.setActivity(activity);

        for (int i = 0; i < 11; i++) {
            developer.performAction();
            developer.changeActivity();
        }
    }
}
