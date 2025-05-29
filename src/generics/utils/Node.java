package generics.utils;

public class Node <T extends Comparable<T>> implements Comparable<Node<T>> {

     public  T data;
     public Node<T> next;

    @Override
    public int compareTo(Node<T> o) {
        return this.data.compareTo(o.data);
    }

    @Override
    public String toString() {
        return data.toString();
    }

}
