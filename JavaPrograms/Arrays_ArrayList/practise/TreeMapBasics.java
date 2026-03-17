package Arrays_ArrayList.practise;
import java.util.*;

public class TreeMapBasics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Array Sorted : "+Arrays.toString(useTreemap(arr)));
    }
    
    static int[] useTreemap(int[] arr){
        Map<Integer , Integer> map = new TreeMap<>();
        
        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0) + 1);
        }
        System.out.println("Tree Map Sorted : "+map.keySet());
        
        // int index = 0;
        // for(int keys : map.keySet()){
        //     arr[index++] = keys;
        // }
        
        int index = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            
            for(int i=0;i<value;i++){
                arr[index++] = key;
            }
        }

        return arr;
    }
    
}


//input - [1,3,4,5,6,7,8,2]
//output - [1,2,3,4,5,6,7,8]
