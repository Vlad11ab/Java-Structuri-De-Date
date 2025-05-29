package simpleCollections.simplelist;

import models.Car;

import java.util.Comparator;

public interface Lista {

    void addStart(Car car);

    void addLast(Car car);

    void addPos(Car car, int position);

    Node getHead();

    int getSize();

    void showList();

    void removePos(int position);

    void removeStart();

    void removeLast();

    void sortList(Comparator<Car> comp);

    void setData(Car car, int position);

    Car getData(int position);

    int positionIndex();


}
