package simplelist;

import models.Car;

import javax.swing.text.Position;

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

    void sortListByYear();

    void setData(Car car, int position);

}
