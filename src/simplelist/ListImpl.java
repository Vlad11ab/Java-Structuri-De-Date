package simplelist;

import models.Car;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.List;

public class ListImpl implements Lista {
    private Node head;


    public ListImpl() {
        this.head = null;
    }

    @Override
    public void addStart(Car car){
        Node node = new Node();
        node.car = car;
        if (head == null){
            head = node;
        }else{
            node.next=head;
            head=node;
        }

    }

    @Override
    public void removeStart(){
        if(head == null){
            System.out.println("Empty list");
        }else{
            head = head.next;
        }

    }

    @Override
    public void removePos(int position){
        if(head == null){
            System.out.println("Empty list");

        }else if(position == 0){
            this.removeStart();

        }else{
            Node current = head;
            int ct = 0;

            while(ct != position - 1){
                current = current.next;
                ct++;
            }
            current.next =current.next.next;

        }
    }

    @Override
    public void removeLast(){
        Node aux = head;

        if(head == null){
            System.out.println("Empty list");
        }else{
            while(aux.next.next!=null){
                aux = aux.next;
            }
            aux.next = null;
        }
    }

    @Override
    public Node getHead() {
        if(head == null) {
            System.out.println("Empty list");
        }
        return head;
    }

    @Override
    public void addLast(Car car){
        Node lnode = new Node();
        lnode.car = car;
        if(head == null){
            head = lnode;
            lnode.next = null;
        }else{
            Node aux = head;

            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = lnode;
            lnode.next = null;



        }
    }

    @Override
    public void addPos(Car car, int position) {
        Node node = new Node();
        node.car = car;

        if (head == null) {
            head = node;
            node.next = null;
        }else if(position==0){


            this.addStart(car);
        } else {


            Node aux = head;
            int ct = 0;
            while (ct != position - 1) {
                aux = aux.next;
                ct++;
            }
            node.next = aux.next;
            aux.next = node;
        }
    }

    @Override
    public int getSize(){
        Node aux = head;
        int nrElemente = 1;

        while(aux.next!=null){
            aux = aux.next;
            nrElemente++;
        }

        return nrElemente;
    }

    @Override
    public void showList(){
        if(head == null){
            System.out.println("Lista este goala");
        }else{
            Node aux = head;

            while(aux != null){
                System.out.println(aux);
                aux = aux.next;
            }

        }
    }

    @Override
    public void sortListByYear(){
        Node aux = head;


    }

    @Override
    public void setData(Car car, int position){
        Node aux = head;

        if(head == null){
            head.car = car;
            head.next = null;
        }else{
            int ct = 1;

            while(ct != position){
                aux = aux.next;
                ct++;
            }

            aux.car = car;
        }



    }




}
