package generics.multime;

import generics.utils.Node;

public class Multime<E extends Comparable<E>> implements IMultime<E>{
    private Node<E> first;

    @Override
    public boolean add(E data) {

        Node<E> node = new Node<>();
        node.data=data;

        if(first == null){
            first = node;
            first.next =null;
        }else{
            //23,45,156,789    100
            Node<E> aux = first;
            Node<E> prev = aux;

            while(aux != null && data.compareTo(aux.data) > 0){
                prev = aux;
                aux = aux.next;
            }
            node.next = aux;
            prev.next = node;
        }



        return true;
        }




    }



