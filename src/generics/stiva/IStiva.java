package generics.stiva;

import models.Car;

public interface IStiva <S extends Comparable<S>>{

    void push(S data);

    S pop();

    S peek();

    Boolean isEmpty();

    int getSize();

}
