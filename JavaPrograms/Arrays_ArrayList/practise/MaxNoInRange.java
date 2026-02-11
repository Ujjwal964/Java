package Arrays_ArrayList.practise;
import java.util.*;

//                       ----------USING ARRAYS------------

public class MaxNoInRange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.print("Enter numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Maximum value in range is : "+maxInRange(arr , 2 , 4));
    }

    static int maxInRange(int[] arr , int start , int end){
        if(start > end || start < 0 || end >= arr.length || arr.length == 0)
            return -1;

        int max = arr[start];
        for(int i=start;i<=end;i++){
            // if(arr[i] > max)
            //     max = arr[i];
            max = arr[i] > max ? arr[i] : max;
        }
        return max;
    }
}


//                       ----------USING ARRAYLIST------------

// public class MaxNoInRange {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         ArrayList<Integer> list = new ArrayList<>();

//         System.out.print("Enter numbers : ");
//         for(int i=0;i<5;i++){
//             list.add(sc.nextInt());
//         }
//         System.out.println("Maximum value in range is : "+maxInRange(list , 2 , 4));
//     }

//     static int maxInRange(ArrayList<Integer> list , int start , int end){
//         if(start>end || start<0 || end>=list.size())
//             return -1;

//         int max = list.get(start);
//         for(int i=start;i<=end;i++){
//             // if(list.get(i) > max)
//             //     max = list.get(i);
//             max = list.get(i) > max ? list.get(i) : max;
//         }
//         return max;
//     }
// }    