//ARRAY DEQUE - FIFO / LIFO (Doubly Ended Queue)
//IMPLEMENTS DEQUE INTERFACE (INSERTION ORDER✅ / NO SORTING❌ / NO COMPARISON❌)

package Collections.queueBasics;
import java.util.*;

public class QueueArrayDeque{
    public static void main(String[] args){
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offerFirst(4);
        queue.offerLast(2);
        queue.offerFirst(1);
        queue.offerLast(3);
        queue.offerFirst(5);
        
        System.out.println("Array Deque Implement Queue is : "+queue);
        while(! queue.isEmpty()){
            System.out.println(queue.pollLast());
        }
    }
}
