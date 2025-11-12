package generics.lista;

import generics.utils.Node;
import models.Car;

import java.util.Comparator;

public interface ILista<U extends Comparable<U>>{

    void addStart(U data);

    void removeStart();

    void removePos(int position);

    void removeLast();

    void addLast(U data);

    void addPos(U data, int position);

    int getSize();

    U getNode(int position);

    void showList();

    void sortList(Comparator<U> comp);

    void setData(U data, int position);

    U getData(int position);

    Node<U> reverseList();

    Node<U> getHead();
}
