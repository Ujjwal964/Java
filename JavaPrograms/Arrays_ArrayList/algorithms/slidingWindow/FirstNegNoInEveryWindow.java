//QUES - find first -ve number in every window of size  k , given an array.
//SOURCE - Aditya Verma (https://youtu.be/uUXXEgK2Jh8?si=QrjGd721nJ7-tFUS)

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class FirstNegNoInEveryWindow {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Window Size : ");
        int k = sc.nextInt();

        System.out.print("First Negative Numbers in Every Window : ");
        firstNegativeNo(arr , k);
    }

    static void firstNegativeNo(int[] arr , int k){
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int negative = 0;

        while(j < arr.length){
            
            if(j - i + 1 < k){
                if(arr[j] < 0)
                    list.add(arr[j]);
                j++;
            }
            else if(j - i + 1 == k){
                if(arr[j] < 0)
                    list.add(arr[j]);

                if(list.size() == 0)
                    negative = 0;
                else
                    negative = list.get(0);
                System.out.print(negative + " ");

                if(arr[i] < 0){
                    list.remove(0);
                    i++;
                    j++;
                }
                else{
                    i++;
                    j++;
                }
            }
        }
    }
}

//         i
//                j
//input -> 12 -1 -7 8 -15 30 16 28 , window size = 3; 
//output -> -1 , -1 , -7 , -15 , -15 , 0
//approach -> list : [-1,-7] -> []
