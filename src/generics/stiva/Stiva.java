package generics.stiva;

import generics.utils.Node;

import java.rmi.UnexpectedException;


public class Stiva<S extends Comparable <S>> implements IStiva<S>{
    private Node<S> head;
    private int size;

    public Stiva(){
        head=null;
        size=0;
    }


    @Override
    public void push(S data) {
        Node<S> node = new Node();
        node.data = data;
        if(head == null){
            head = node;
            node.next = null;
        }
        else {
            node.next=head;
            head=node;
        }
        size ++;
    }

    @Override
    public S pop() {
        Node<S> aux = head;

        if(head == null){
           return null;
        }
        else {
            aux = head;
            head=head.next;
        }
//        System.out.println(aux.data);
        size --;
        return aux.data;
    }

    @Override
    public S peek() {
        if(head == null){
           return null;
        }
//        System.out.println(head.data);
        return head.data;
    }

    @Override
    public Boolean isEmpty() {
        return head==null;
    }
}
