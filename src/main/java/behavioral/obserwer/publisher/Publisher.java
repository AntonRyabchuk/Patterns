package behavioral.obserwer.publisher;

import behavioral.obserwer.subscriber.PublisherActionListener;

import java.util.ArrayList;

public interface Publisher {

    ArrayList<PublisherActionListener> getListeners();

    void addListener(PublisherActionListener listener);

    void removeListener(PublisherActionListener listener);

    void removeAllListeners();

    void createNewMessage(String message);
}
