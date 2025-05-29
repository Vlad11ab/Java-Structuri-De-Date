package simpleCollections.queue;

import models.Car;

public class QueueImpl implements Queue{
    private Node first;
    private Node last;
    int size;


    @Override
    public void addToQueue(Car car) {
        Node node = new Node();
        node.car = car;

        if(first == null){
            first = node;
            last = node;
        }
        else {
            last.next = node;
            last = node;
        }
        size ++;
    }

    @Override
    public void removeFromQueue() {
        if(first == null) {
            System.out.println("Empty Queue");
        }
        else {
            first = first.next;

            if(first == null){
                last = null;
            }
        }
        size --;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void showQueue() {
        Node aux = first;

        while(aux != null){
            System.out.println(aux);
            aux = aux.next;
        }
    }
}
