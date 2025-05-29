package generics.lista;



import generics.utils.Node;

import java.util.Comparator;

public class Lista<U extends Comparable<U>> implements ILista<U> {
    private Node<U> head;



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
            Node<U> current = head;
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
        Node<U> aux = head;

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
    public void addLast(U data){
        Node<U> lnode = new Node();
        lnode.data = data;
        if(head == null){
            head = lnode;
            lnode.next = null;
        }else{
            Node<U> aux = head;

            while(aux.next != null){
                aux = aux.next;
            }
            aux.next = lnode;
            lnode.next = null;



        }
    }

    @Override
    public void addPos(U data, int position) {
        Node<U> node = new Node();
        node.data = data;

        if (head == null) {
            head = node;
            node.next = null;
        }else if(position==0){


            this.addStart(data);
        } else {


            Node<U> aux = head;
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
        Node<U> aux = head;
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
            Node<U> aux = head;

            while(aux != null){
                System.out.println(aux);
                aux = aux.next;
            }

        }
    }

    @Override
    public void sortList(Comparator<U> comp){

        boolean flag=false;
        do{
            flag=true;
            for(int i=0;i<getSize();i++){
                if(comp.compare(this.getData(i),this.getData(i+1))>0){
                    swap(i, i+1);
                    flag=false;
                }
            }

        }while (flag==false);


    }

    @Override
    public void setData(U data, int position){
        Node<U> aux = head;

        if(head == null){
            head.data = data;
            head.next = null;
        }else{
            int ct = 1;

            while(ct != position){
                aux = aux.next;
                ct++;
            }

            aux.data = data;
        }

    }

    private void swap(int posA, int posB){
        U temp = getData(posA);
        setData(getData(posB),posA);
        setData(temp, posB);
    }

    @Override
    public U getData(int position){
        Node<U> aux = head;

        if(head == null){
            System.out.println("Empty List");
        }
        else{
            if(position==0){
                return head.data;
            }
            int ct = 0;
            while(ct != position-1 && aux.next != null){
                aux = aux.next;
                ct++;
            }

        }
        return (U) aux.data;
    }

    @Override
    public int positionIndex() {
        Node<U> aux = head;
        int i = 0;

        do {
            i++;
            aux = aux.next;
            return i;


        }while(aux !=null);
    }


    @Override
    public void addStart(U data) {

        Node<U> node = new Node();
        node.data = data;
        if (head == null){
            head = node;
        }else{
            node.next=head;
            head=node;
        }


    }
}
