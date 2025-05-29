package simpleCollections.queue;

import models.Car;

public interface Queue {

    void addToQueue (Car car);

    void removeFromQueue();

    int getSize();

    void showQueue();


}
