package creational.factory_method.v2;

import creational.factory_method.v2.factory.TransportFactory;
import creational.factory_method.v2.factory.TruckFactory;
import creational.factory_method.v2.transport.Transport;
import creational.factory_method.v2.transport.Truck;

/**
 * Для чего используется:
 * Для делигирования создания экземпляров, другому классу.
 *
 * Пример использования:
 * - заранее неизвестно, экземпляры, какого класса нужно будет создавать;
 * - класс спроектирован таким образом, что создаваемые им объекты имеют свойства определённого класса.
 *
 * https://www.youtube.com/watch?v=TwIjjTC5g7g&list=PLlsMRoVt5sTPgGbinwOVnaF1mxNeLAD7P&index=4
 */
public class Main {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TruckFactory();
        Transport transport = transportFactory.createTransport();
        transport.delivery();
    }
}
