package creational.factory_method.v1.factory;

import creational.factory_method.v1.car.Car;
import creational.factory_method.v1.car.Ferrari;
import creational.factory_method.v1.car.Jeep;
import creational.factory_method.v1.car.JeepNewModel;

public class CarSelector {

    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case ROAD:
                car = new Ferrari();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case SAND:
                car = new JeepNewModel();
                break;
        }
        return car;
    }
}
