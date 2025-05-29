package simpleCollections.queue;

import models.Car;

public class Node {
    public Car car;
    public Node next;

    @Override
    public String toString() {
        return car.toString();
    }
}
