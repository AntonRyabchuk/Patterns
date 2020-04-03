package behavioral.obserwer;

import behavioral.obserwer.publisher.Publisher;
import behavioral.obserwer.publisher.PublisherImpl;
import behavioral.obserwer.subscriber.PublisherActionListener;
import behavioral.obserwer.subscriber.Subscriber1;
import behavioral.obserwer.subscriber.Subscriber2;

/**
 * Определение зависимости "Один ко многим" таким образом, чтобы при изменении состояния объекта, наблюдающие
 * за ним объекты были уведомлены.
 * Например связь Publisher и Subscriber
 */
public class Main {
    public static void main(String[] args) {
        PublisherActionListener subscriber1 = new Subscriber1();
        PublisherActionListener subscriber2 = new Subscriber2();

        Publisher publisher = new PublisherImpl();
        publisher.addListener(subscriber1);
        publisher.addListener(subscriber2);

        publisher.createNewMessage("Очень важное сообщение");
    }
}
