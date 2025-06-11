package generics.coada;

import models.Car;

public interface ICoada <C extends Comparable <C>>{

    void offer (C data);

    C poll();

    C peek();

    Boolean isEmpty();

    C getFront();

    int getSize();



}
