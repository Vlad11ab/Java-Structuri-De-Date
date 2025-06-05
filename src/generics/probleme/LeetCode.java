package generics.probleme;


import generics.stiva.Stiva;
import generics.coada.Coada;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LeetCode {


//    1.Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//    An input string is valid if:
//
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.

    public static boolean isValid(String text) {
        Stiva<Character> characterStiva = new Stiva<>();
        for (char c : text.toCharArray()) {
            if (c == '(') {
                characterStiva.push(')');
            } else if (c == '{') {
                characterStiva.push('}');
            } else if (c == '[') {
                characterStiva.push(']');
            } else if ( (c=='}'||c==']'|| c==')') && characterStiva.peek()!=c) {
                return false;
            }else if(characterStiva.peek()==c){
                characterStiva.pop();
            }
        }
        return characterStiva.isEmpty();
    }






//      2.There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
//
//      You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
//
//      Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
//
//      Return the time taken for the person initially at position k (0-indexed) to finish buying tickets.

    public int timeRequiredToBuy(int[] tickets, int k) {
        Coada<Integer> coada = new Coada<>();

        //[2,3,2] , k=2

        //incarcare coada   coada are 2 3 2
//        for(Integer nr : tickets){
//            coada.offer(nr);
//        }

        int time = 0;

//            while(tickets [k] != 0){
//
//                for(int i = 0 ; i<tickets.length; i++){
//                    int aux = 0;
//                    aux = coada.getFront();
//                    coada.poll();
//                    aux--;
//
//                    coada.offer(aux);
//
//                    time++;
//                    if(i==k){
//                        tickets[k]--;
//                    }
//                }
//
//            }




        for(int i=0;i<tickets.length;i++){

             coada.offer(i);
        }

        while (!coada.isEmpty()){
            int pers = coada.poll();
            time++;
            tickets[pers]--;

            if(pers == k && tickets[pers] == 0){
                return time;
            }
            if(tickets[pers]>0){

                coada.offer(pers);
            }
        }

        //coada 0 1 2     1 2 0   2 0 1  0 1 2   1 2
        //vec   [2,3,2]   1 3 2   1 2 2  0 2 2   0 2 2

            return time;



    }













}