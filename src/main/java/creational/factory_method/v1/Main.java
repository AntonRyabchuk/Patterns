package creational.factory_method.v1;

import creational.factory_method.v1.car.Car;
import creational.factory_method.v1.factory.CarSelector;
import creational.factory_method.v1.factory.RoadType;

public class Main {
    public static void main(String[] args) {

        CarSelector carSelector = new CarSelector();

        Car car1 = carSelector.getCar(RoadType.ROAD);
        car1.drive();

        Car car2 = carSelector.getCar(RoadType.OFF_ROAD);
        car2.drive();

        Car car3 = carSelector.getCar(RoadType.SAND);
        car3.drive();
    }
}
