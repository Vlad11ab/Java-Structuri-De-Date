package generics.probleme;

//    234. Linked List in a Binary Tree
//Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
//Constraints:
//
//        The number of nodes in the list is in the range [1, 105].
//        0 <= Node.val <= 9
//
//
//        Follow up: Could you do it in O(n) time and O(1) space?

import generics.lista.ILista;
import generics.lista.Lista;
import generics.utils.Node;

import java.util.List;

public class PalindromeLinkedList {

    ILista<Integer> lista234 = new Lista<>();
    
    public ILista<Integer> getLista234(){
        return lista234;
    }

    //1->2->2->1

    public boolean isPalindrome(Node<Integer> head) {
        Node<Integer> fastPointer = head;
        Node<Integer> slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
        }

        slowPointer = reverseList(slowPointer);
        fastPointer = head;

        while (slowPointer != null) {
            if (slowPointer.data != fastPointer.data) {
                System.out.println("Nu e palindrom");
                return false;
            }

            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        System.out.println("este palindrom");
        return true;
    }

    public Node<Integer> reverseList(Node<Integer> head) {


         Node<Integer> prev = null;

         while(head != null) {
             Node<Integer> nextNode = head.next;
             head.next = prev;
             prev = head;
             head = nextNode;
         }

        return prev;
    }


}
