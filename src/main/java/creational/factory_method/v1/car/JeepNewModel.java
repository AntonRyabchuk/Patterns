package creational.factory_method.v1.car;

public class JeepNewModel extends Jeep {
    @Override
    public void drive() {
        System.out.println("JeepNewModel drive");
    }

    @Override
    public void stop() {
        System.out.println("JeepNewModel stop");
    }
}
