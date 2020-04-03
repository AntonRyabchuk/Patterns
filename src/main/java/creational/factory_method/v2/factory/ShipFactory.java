package creational.factory_method.v2.factory;

import creational.factory_method.v2.transport.Ship;
import creational.factory_method.v2.transport.Transport;

public class ShipFactory implements TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
