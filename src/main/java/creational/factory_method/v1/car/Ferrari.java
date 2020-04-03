package creational.factory_method.v1.car;

public class Ferrari implements Car {
    @Override
    public void drive() {
        System.out.println("Ferrari drive");
    }

    @Override
    public void stop() {
        System.out.println("Ferrari stop");
    }
}
