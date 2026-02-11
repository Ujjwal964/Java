package Arrays_ArrayList.practise;
import java.util.*;

//                       ----------USING ARRAYS------------

public class MaxNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter Numbers : ");
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum number in given array is : "+max(arr));
    }

    static int max(int[] arr){
        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}


//                       ----------USING ARRAYLIST------------
// public class MaxNo{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         ArrayList<Integer> list = new ArrayList<>();

//         System.out.print("Enter Numbers : ");
//         for(int i=0;i<5;i++){
//             list.add(sc.nextInt());
//         }

//         System.out.println("Maximum number in given array is : "+max(list));
//     }

//     static int max(ArrayList<Integer> list){
//         int max = list.get(0);
//         for(int i=0;i<5;i++){
//             if(list.get(i) > max)
//                 max = list.get(i);     
//         }
//         return max;
//     }
// }