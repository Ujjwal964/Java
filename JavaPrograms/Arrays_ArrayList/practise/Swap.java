package Arrays_ArrayList.practise;
import java.util.*;

//                       ----------USING ARRAYS------------

// public class Swap {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // int[] arr = {1,2,3,4,5};
        
//         int[] arr = new int[5];

//         System.out.print("Enter numbers : ");
//         for(int i=0;i<arr.length;i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Before Swap : "+Arrays.toString(arr));

//         swap(arr , 0 , 4);
//     }

//     static void swap(int[] arr , int index1 , int index2){
//         int temp = arr[index1];
//         arr[index1] = arr[index2];
//         arr[index2] = temp;

//         System.out.println("After Swap : "+Arrays.toString(arr));
//     }
// }


//                       ----------USING ARRAYLIST------------

public class Swap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("Enter Numbers : ");
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        System.out.println("Before Swap : "+list);
        swap(list,0,4);
    }

    static void swap(ArrayList<Integer> list , int index1, int index2){
        int temp = list.get(index1);
        list.set(index1 , list.get(index2));
        list.set(index2 , temp);

        System.out.println("After swap : "+list);
    }
}