package Sorting;

import java.util.*;

public class queueReversal {
    public void rec(Queue<Integer> q){
        if(q.isEmpty())
            return;
        int x = q.poll();
        rec(q);
        q.add(x);
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n; i ++){
            q.add(sc.nextInt());
        }
        queueReversal obj = new queueReversal();

        obj.rec(q);

        System.out.println(q);
    }
}
