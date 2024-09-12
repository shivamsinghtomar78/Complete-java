package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.offer(2);
         Utility.print(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q.remove());
        System.out.println(q);
        Utility.print(q);
        System.out.println(q.poll());
        Utility.print(q);

    }
}
