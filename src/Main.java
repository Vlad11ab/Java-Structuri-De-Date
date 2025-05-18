import models.Car;
import simplelist.ListImpl;
import simplelist.Lista;
import simplelist.Node;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Lista lista = new ListImpl();

        Car c1 = new Car("VW", "alb", 2020);
        Car c2 = new Car("BMW", "rosu", 2021);
        Car c3 = new Car("KIA", "negru", 2019);
        Car c4 = new Car("FORD", "albastru", 2024);

        lista.addStart(c1);
        lista.addStart(c2);
        lista.addStart(c3);
        lista.addStart(c4);

        Car c = new Car("TOYOTA", "alb", 2025);
        lista.addLast(c);

        Car car = new Car("LOGAN", "rosu", 2018);
        lista.addPos(car, 2);

        Car masina = new Car.Builder().model("MASINA")
                        .culoare("verde")
                                .anFabricatie(1900)
                                        .build();


        lista.showList();

        System.out.println(lista.getSize());

        lista.removeStart();

        System.out.println("--------");

        lista.showList();

        lista.removePos(2);

        System.out.println("---------");

        lista.showList();

        lista.removeLast();

        System.out.println("---------");

        lista.showList();

        lista.setData(masina,2);

        System.out.println("----------");

        lista.showList();
    }
}
