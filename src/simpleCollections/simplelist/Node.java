package simpleCollections.simplelist;

import models.Car;

public class Node implements Comparable<Node>{
    public Car car;
    public Node next;

    @Override
    public String toString() {
        return car.toString();
    }

    @Override
    public int compareTo(Node o) {
        return this.car.compareTo(o.car);
    }
}
