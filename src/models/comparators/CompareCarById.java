package models.comparators;

import models.Car;

import java.util.Comparator;

public class CompareCarById implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getId() > o2.getId()){
            return 1;
        }
        else if(o1.getId() == o2.getId()){
            return 0;
        }
        else return -1;
    }
}
