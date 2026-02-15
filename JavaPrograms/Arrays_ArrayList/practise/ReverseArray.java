package Arrays_ArrayList.practise;
import java.util.*;

//                       -------------USING ARRAYS---------------
                                //space complexity is O(1).
                                
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        System.out.print("Enter numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Original Array : "+ Arrays.toString(arr));
        reverse(arr);
    }

    static void reverse(int[] arr){
        int start = 0;                  //1st pointer
        int end = arr.length-1;         //2nd pointer
        
        while(end > start){                  //2 pointer approach.
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("Reversed Array : "+ Arrays.toString(arr));
    }
}


//                       ----------USING ARRAYLIST------------

// public class ReverseArray {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         ArrayList<Integer> list = new ArrayList<>();
//         System.out.print("Enter numbers : ");
//         for(int i=0;i<6;i++){
//             list.add(sc.nextInt());
//         }

//         System.out.println("Original Array : "+ list);
//         reverse(list);
//     }

//     static void reverse(ArrayList<Integer> list){
//         int start = 0;
//         int end = list.size()-1;

//         while(end > start){
//             int temp = list.get(start);
//             list.set(start , list.get(end));
//             list.set(end , temp);

//             start++;
//             end--;
//         }
//         System.out.println("Reversed Array : "+list);
//     }
// }


//                       -------------USING ARRAYS(2nd approach)---------------

                    // to do when making presercing old array and reversing on new one, space complexity is O(N).

// public class ReverseArray {
//     public static void main(String[] args){
//         int[] arr = {1,2,3,4,5};
//         System.out.println("Original Array : "+Arrays.toString(arr));

//         int[] reverse1 = new int[arr.length];
//         for(int i=0;i<arr.length;i++){
//             reverse1[i] = arr[arr.length-1-i];
//         }
//         System.out.println("Reversed Array : "+Arrays.toString(reverse1));
//     }
    
// }

//1 2 3 4 5
// 5 4 3 2 1