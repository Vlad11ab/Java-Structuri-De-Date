package models.comparators;

import models.Car;

import java.util.Comparator;

public class CompareCarByModel implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.getModel().length() > o2.getModel().length()) {
            return 1;
        }
            else if (o1.getModel().length() == o2.getModel().length()){
                return 0;
        }
            else return -1;
    }
}
