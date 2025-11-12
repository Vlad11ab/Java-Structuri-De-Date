package generics.probleme;


import generics.coada.ICoada;
import generics.lista.Lista;
import generics.stiva.Stiva;
import generics.coada.Coada;
import generics.utils.Node;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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


//    3.You have a RecentCounter class which counts the number of recent requests within a certain time frame.
//
//    Implement the RecentCounter class:
//
//    RecentCounter() Initializes the counter with zero recent requests.
//    int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
//    It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.



//        public int ping(int t) {
//            int ct = t;
//
//            RecentCounter recentCounter = new RecentCounter();
//
//
//            do{
//
//                if(ct > recentCounter.requests.peek()){
//                    recentCounter.requests.offer(ct);
//
//                    recentCounter.counter ++;
//                }
//
//
//            }while(ct>t-3000 && ct<t);
//
//            return recentCounter.counter;
//        }















//  4.The Leetcode file system keeps a log each time some user performs a change folder operation.
//
//  The operations are described below:
//
//        "../" : Move to the parent folder of the current folder. (If you are already in the main folder, remain in the same folder).
//        "./" : Remain in the same folder.
//  "x/" : Move to the child folder named x (This folder is guaranteed to always exist).
//  You are given a list of strings logs where logs[i] is the operation performed by the user at the ith step.
//
//  The file system starts in the main folder, then the operations in logs are performed.
//
//  Return the minimum number of operations needed to go back to the main folder after the change folder operations.


    public int minOperations(String[] logs) {
        Stiva<String> stack = new Stiva<>();

        for (int i = 0; i < logs.length; i++) {
            String log = logs[i];

            if (log.equals("../")) {

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if (log.equals("./")) {

            }
            else {
                stack.push(log);
            }
        }

        return stack.getSize();
    }







}