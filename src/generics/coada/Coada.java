package generics.coada;


import generics.utils.Node;


public class Coada <C extends Comparable <C>> implements ICoada<C>{
    private Node<C> front;
    private Node<C> rear;
    int size;

    @Override
    public void offer(C data) {
        Node<C> node = new Node();
        node.data = data;

        if(front == null){
            front = node;
            rear = node;
        }
        else {
            rear.next = node;
            rear = node;
        }
        size ++;
    }

    @Override
    public C poll() {
        Node<C> aux = null;
        if (front == null) {
            System.out.println("Empty Queue");
        } else {
            aux = front;
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
        size --;
//        System.out.println(aux.data);
        return aux.data;
    }

//    @Override
//    public void pop() {
//        if(first == null) {
//            System.out.println("Empty Queue");
//        }
//        else {
//            first = first.next;
//
//            if(first == null){
//                last = null;
//            }
//        }
//        size --;
//    }

    @Override
    public C peek() {
        Node<C> aux = front;

        while(aux.next != null){
            aux = aux.next;
        }
//        System.out.println(aux.data);
        return aux.data;
    }

    @Override
    public Boolean isEmpty() {
        Node<C> aux = front;

        if(front == null){
            System.out.println("The Queue is empty");
            return true;
        }
        else return false;
    }

    @Override
    public C getFront() {
        return front.data;
    }

//    @Override
//    public boo() {
//        Node<C> aux = first;
//
//        while(aux != null){
//            System.out.println(aux);
//            aux = aux.next;
//        }
//    }
//    }


}

