package generics.probleme;

//445.Add Two Numbers II
//You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.

import generics.coada.Coada;
import generics.coada.ICoada;
import generics.lista.ILista;
import generics.lista.Lista;
import generics.stiva.IStiva;
import generics.stiva.Stiva;
import generics.utils.Node;

public class AddTwoNumbersII {

    ILista<Integer> lista445;


    public ILista<Integer> add445(ILista<Integer> l1, ILista<Integer> l2) {
        lista445 = new Lista<>();

        Node<Integer> currentL1 = l1.getHead();
        Node<Integer> currentL2 = l2.getHead();

        IStiva<Integer> stack1 = new Stiva<>();
        IStiva<Integer> stack2 = new Stiva<>();

        int carry = 0;

            while (currentL1 != null) {
                stack1.push(currentL1.data);
                currentL1 = currentL1.next;
            }

            while (currentL2 != null) {
                stack2.push(currentL2.data);
                currentL2 = currentL2.next;
            }

            int sum;

            while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {

                sum = carry;

                if(!stack1.isEmpty()) {
                    sum += stack1.pop();
                }
                if (!stack2.isEmpty()) {
                    sum += stack2.pop();
                }

                int answer = sum % 10;      // 10 % 10 = 0
                carry = sum / 10;           // 10 / 10 = 1

                lista445.addStart(answer);

            }
            return lista445;
    }
}
