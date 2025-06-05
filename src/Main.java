import generics.coada.Coada;
import generics.coada.ICoada;
import generics.lista.ILista;
import generics.probleme.LeetCode;
import generics.stiva.IStiva;
import generics.stiva.Stiva;
import models.Car;
import models.comparators.CompareCarByPrice;
import simpleCollections.stack.Stack;
import simpleCollections.stack.StackImpl;
import simpleCollections.queue.Queue;
import simpleCollections.queue.QueueImpl;
import simpleCollections.simplelist.ListImpl;
import simpleCollections.simplelist.Lista;
import simpleCollections.simplelist.Node;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Lista lista = new ListImpl();

        Car c1 = new Car(1,"VW", "alb", 2020,2000);
        Car c2 = new Car(2,"BMW", "rosu", 2021,3000);
        Car c3 = new Car(3,"KIA", "negru", 2019,5000);
        Car c4 = new Car(4, "FORD", "albastru", 2024,3500);

        lista.addStart(c1);
        lista.addStart(c2);
        lista.addStart(c3);
        lista.addStart(c4);

        Car c5 = new Car(5,"TOYOTA", "alb", 2025,750);
        lista.addLast(c5);

        Car c6 = new Car(6,"LOGAN", "rosu", 2018,5250);
        lista.addPos(c6, 2);

        Car c7 = new Car.Builder().id(7)
                        .model("MASINA")
                        .culoare("verde")
                        .anFabricatie(1900)
                        .price(2750)
                        .build();


        lista.showList();

        System.out.println("=======SortList=======");

        lista.sortList(new CompareCarByPrice());  //problem
        lista.showList();

        System.out.println("======================");

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

        System.out.println("============setData============");

        lista.setData(c7,2);
        lista.setData(c2,1);

        lista.showList();

        System.out.println("============getData============");

//        lista.showList();
//
//        lista.swap(1,3);
//
//        System.out.println("---");
//
//        lista.showList();
//
//        lista.swap(2,3);
//
//        System.out.println("---");

        lista.showList();

        System.out.println("---");

        System.out.println(lista.getData(2));
        System.out.println(lista.getData(1));
        System.out.println(lista.getData(3));
        System.out.println(lista.getData(3));


        System.out.println("===============================");;

        lista.sortList(Car::compareTo);

        lista.showList();

        System.out.println("========================Queue=========================");

        Queue queue = new QueueImpl();

        Car c10 = new Car.Builder().model("C10").id(10)
                     .anFabricatie(1987)
                     .culoare("rosu")
                     .price(8200)
                     .build();

        Car c11 = new Car.Builder().id(11)
                    .model("C11")
                    .culoare("alb")
                    .anFabricatie(1500)
                    .build();

        Car c12 = new Car.Builder().id(12)
                    .model("C12")
                    .culoare("verde")
                    .anFabricatie(2026)
                    .price(6500)
                    .build();

        queue.addToQueue(c10);
        queue.addToQueue(c11);
        queue.addToQueue(c12);


        queue.showQueue();

        System.out.println("Numarul de elemente este: " + queue.getSize());

        System.out.println("-------------------");

        queue.removeFromQueue();

        queue.showQueue();

        System.out.println("Numarul de elemenete este: " + queue.getSize());


        System.out.println("======================CompareTo=======================");

        Node n1 = new Node();
        n1.car = c10;

        Node n2 = new Node();
        n2.car = c11;

        Node n3 = new Node();
        n3.car = c10;

        Node n4 = new Node();
        n4.car = c12;

        System.out.println(n1.compareTo(n2));
        System.out.println(n1.compareTo(n3));
        System.out.println(n1.compareTo(n4));


        System.out.println("========================Stack=========================");

        Stack stack = new StackImpl();

        Car c20 = new Car.Builder().id(20)
                .model("C20")
                .anFabricatie(2019)
                .price(3575)
                .build();

        Car c21 = new Car.Builder().id(21)
                        .model("C30")
                                .anFabricatie(2000)
                                        .price(3500)
                                                .build();

        Car c22 = new Car.Builder().id(22)
                        .model("C23")
                                .anFabricatie(2004)
                                        .price(5000)
                                                .build();

        stack.push(c20);
        stack.push(c21);
        stack.push(c22);
        stack.viewStack();

        System.out.println("--pop--");

        stack.pop();
        stack.viewStack();

        System.out.println("--peek--");

        stack.peek();

        System.out.println("=====================GenericList====================");

        ILista<String> genericList = new generics.lista.Lista<>();
        genericList.addStart("test");
        genericList.addStart("ce mai faci");
        genericList.showList();

        System.out.println("=====================GenericQueue===================");

        ICoada<String> genericQueue = new Coada<>();
        genericQueue.offer("start");
        genericQueue.offer("stop");
        genericQueue.offer("ceva");
        genericQueue.peek();
        genericQueue.poll();
        genericQueue.peek();
        genericQueue.poll();

        System.out.println("=====================GenericStack===================");

        IStiva<String> genericStack = new Stiva<>();
        genericStack.push("start");
        genericStack.push("stop");
        genericStack.push("ceva");
        genericStack.peek();
        System.out.println("--");
        genericStack.pop();
        genericStack.peek();
        genericStack.pop();
        genericStack.peek();
        genericStack.pop();
        genericStack.peek();


//        System.out.println("===========================LeetCode===================");
//        LeetCode leetCode = new LeetCode();
//        leetCode.isValid("()");
    }
}
