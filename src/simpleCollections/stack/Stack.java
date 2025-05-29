package simpleCollections.stack;

import models.Car;

public interface Stack {

    void push(Car car);

    void pop();

    void peek();

    void viewStack();
}
