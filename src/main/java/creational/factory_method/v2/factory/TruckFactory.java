package creational.factory_method.v2.factory;

import creational.factory_method.v2.transport.Transport;
import creational.factory_method.v2.transport.Truck;

public class TruckFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
