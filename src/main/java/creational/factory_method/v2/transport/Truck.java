package creational.factory_method.v2.transport;

public class Truck implements Transport {

    @Override
    public void delivery() {
        System.out.println("delivery by truck");
    }
}
