//PRIORITY QUEUE - COMPARATOR / HEAP
//IMPLEMENTS QUEUE INTERFACE
//MAINTAINS BY DEFAULT MIN HEAP (means ascending order)
//MAX HEAP : USING COMPARATOR/LAMBDA (Sort)

package Collections.queueBasics;
import java.util.*;


public class QueuePriorityQueue{
    public static void main(String[] args){
        // Queue<Integer> queue = new PriorityQueue<>();
        Queue<Integer> queue = new PriorityQueue<>((a,b) -> b-a);
        // Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a , Integer b){
        //         return b-a;
        //     }
        // });
        queue.offer(5);
        queue.offer(4);
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        
        System.out.println("Priority Queue Implement Queue is : "+queue);
        while(! queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}