package simpleCollections.stack;

import models.Car;
//push pop peel
public class StackImpl implements Stack{
    private Node first;
    private Node last;
    private int size;

    @Override
    public void push(Car car) {
        Node node = new Node();
        node.car = car;

        if(first == null){
            first = node;
            last = node;
            node.next = null;
        }
        else {
            while(node.next != null){
                node = node.next;
            }
            last.next = node;
            last = node;
        }
        size ++;
    }

    @Override
    public void pop() {
        Node aux = first;

        if(first == null){
            System.out.println("Empty stack");
        }
        else {
            while(aux.next.next != null){
                aux = aux.next;
            }
            last = aux;
            last.next = null;
        }
        size --;
    }

    public void viewStack(){
        Node aux = first;

        while(aux != null){
            System.out.println(aux.car);
            aux = aux.next;
        }
    }

    @Override
    public void peek() {
        System.out.println(last);
    }
}
