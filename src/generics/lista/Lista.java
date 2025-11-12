package generics.lista;



import generics.utils.Node;

import java.util.Comparator;

public class Lista<U extends Comparable<U>> implements ILista<U>{
    private Node<U> head;
    private int size;



        @Override
        public void removeStart(){

            if(head == null){
                System.out.println("Empty list");
            }else{
                head = head.next;
                size--;
            }

        }

    @Override
    public void removePos(int position){

        if (head == null) {
            System.out.println("Empty list");
        } else if (position == 0) {
            this.removeStart();
        } else {
            Node<U> current = head;
            int ct = 0;

            while (ct < position - 1) {
                current = current.next;
                ct++;
            }
            current.next =current.next.next;

            size--;
        }
    }

    @Override
    public void removeLast(){

        if (head == null){
            System.out.println("Empty list");
        }else if (head.next == null) {
            removeStart();
        } else {

            Node<U> aux = head;

            while (aux.next.next != null) {
                aux = aux.next;
            }
            aux.next = null;
            size--;
        }

    }

    @Override
    public void addLast(U data){

        Node<U> node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            node.next = null;
            size++;
        } else {

            Node<U> aux = head;

            while (aux.next != null) {
                aux = aux.next;
            }
            aux.next = node;
            node.next = null;

            size++;
        }
    }

    @Override
    public void addPos(U data, int position) {

        Node<U> node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            node.next = null;
        } else if (position <= 0) {
            addStart(data);
        } else if (position > size) {
            addLast(data);
        } else {

            Node<U> aux = head;

            int ct = 0;
            while (ct != position - 1) {
                aux = aux.next;
                ct++;
            }
            node.next = aux.next;
            aux.next = node;

            size++;
        }
    }

    @Override
    public int getSize(){

            if (head == null) {
                System.out.println("Error.Empty list");
                return 0;
            }

//            Node<U> aux = head;
//            int size = 0;
//
//            while(aux.next!=null){
//                 aux = aux.next;
//                 size++;
//        }

        return size;
    }

    @Override
    public U getNode(int position) {

            if (position <= 0 || position > size) {
                System.out.println(position + ": invalid position!");
                return null;
            } else {
                Node<U> current = head;
                int index = 1;

                while (current != null && index <= position) {

                    if (index == position) {
                        return (U) current;
                    }

                    current = current.next;
                    index++;
                }

            }

        System.out.println("Node not found");
            return null;
    }

    @Override
    public void showList(){

        if (head == null) {
            System.out.println("Lista este goala");
        } else {
            Node<U> aux = head;

            while (aux != null) {
                System.out.println(aux);
                aux = aux.next;
            }

        }
    }
    // 45 67 12 1=>45 67 12  1=>45 12 67 1 => 45 12  1 67
    // 45 12 1 67=>12 45  1  67=> 12  1  45 67=> 12 1 45 67
    //

    @Override
    public void sortList(Comparator<U> comp){

        boolean flag = false;
        do {
            flag = true;
            for (int i = 0; i < getSize()-1; i++) {
                if (comp.compare(this.getData(i),this.getData(i+1))>0) {
                    swap (i, i+1);
                    flag = false;
                }
            }

        } while (flag == false);

    }

    @Override
    public void setData(U data, int position){

        Node<U> aux = head;

        if (position > size) {
            System.out.println("Error. " + position + " is out of list");
        } else if (position <= 0) {
            head.data = data;
        } else {
                int ct = 0;

                while (ct != position) {
                    aux = aux.next;
                    ct++;
                }

                aux.data = data;
            }
        }


    private void swap(int posA, int posB) {

        U temp = getData(posA);
        setData(getData(posB),posA);
        setData(temp, posB);
    }



    @Override
    public U getData(int position) {

        if (head == null) {
            System.out.println("Empty List");
            return null;
        } else if (position < 0 || position >= size) {
            return null;
        } else {

            Node<U> aux = head;
            int ct = 0;

            while (ct < position) {
                aux = aux.next;
                ct++;
            }

//            System.out.println(aux.data + " testez getdata");
            return aux.data;
        }

    }

    @Override
    public Node<U> reverseList() {

            Node<U> prev = null;

            while (head != null) {
                Node<U> nextNode = head.next;
                prev = head;
                head = nextNode;
            }
            return prev;
    }


    @Override
    public Node<U> getHead() {

        if (head == null) {
//            System.out.println("Error.Empty list");
            return null;
        } else {
            return head;
        }
    }


    @Override
    public void addStart(U data) {

        Node<U> node = new Node<U>();
        node.data = data;

        if (head == null) {
            head = node;
            size++;
        } else {
            node.next = head;
            head = node;
            size++;
        }


    }
}
