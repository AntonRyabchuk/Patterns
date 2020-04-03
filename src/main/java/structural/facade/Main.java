package structural.facade;

import creational.factory_method.v1.car.Car;
import structural.facade.facade.CarFacade;
import structural.facade.parts.Door;
import structural.facade.parts.Engine;
import structural.facade.parts.Wheel;

/**
 * Используется для упрощения использования подсистемы
 */
public class Main {
    public static void main(String[] args) {
        //без фасада
        Wheel wheel = new Wheel();
        wheel.check();
        Door door = new Door();
        door.close();
        Engine engine = new Engine();
        engine.start();

        //фасад
        CarFacade car = new CarFacade();
        car.drive();
    }
}
