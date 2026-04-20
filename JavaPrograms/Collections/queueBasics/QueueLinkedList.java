//LINKEDLIST - do not have any comparator constructor (not for sorting)
//IMPLEMENTS QUEUE INTERFACE(INSERTION ORDER✅ / NO SORTING❌ / NO COMPARISON❌)

package Collections.queueBasics;
import java.util.*;

public class QueueLinkedList{
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        System.out.println("LinkedList Implement Queue is : "+queue);
        while(! queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}