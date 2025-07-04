package generics.probleme;

import generics.coada.Coada;

//    3.You have a RecentCounter class which counts the number of recent requests within a certain time frame.
//
//    Implement the RecentCounter class:
//
//    RecentCounter() Initializes the counter with zero recent requests.
//    int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].
//    It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.


public class RecentCounter2 {

    private Coada<Integer> requests;
    private static final   int  WINDOW_SIZE=3000;

    public RecentCounter2() {
        requests = new Coada<>();
    }
    public  int ping(int t){

        requests.offer(t);
        int start=t-WINDOW_SIZE;

        while (!requests.isEmpty()&&requests.peek()<start){
            requests.poll();
        }
        return requests.getSize();
    }
}

