package structural.facade.facade;

import structural.facade.parts.Door;
import structural.facade.parts.Engine;
import structural.facade.parts.Wheel;

public class CarFacade {

    private Wheel wheel = new Wheel();
    private Door door = new Door();
    private Engine engine = new Engine();

    public void drive() {
        wheel.check();
        door.close();
        engine.start();
    }
}
