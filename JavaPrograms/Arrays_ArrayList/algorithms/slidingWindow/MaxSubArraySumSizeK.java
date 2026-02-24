//QUES - Max Sum Subarray of size K (SLIDING WINDOW)
//SOURCE - Aditya Verma (https://youtu.be/KtpqeN0Goro?si=CzlH1Xa6715X6Hi4)

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

public class MaxSubArraySumSizeK {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Window Size : ");
        int k = sc.nextInt();

        System.out.println("Max Sum is : "+maxSubArraySum(arr , k));
    }

    static int maxSubArraySum(int[] arr , int k){
        int i = 0;      
        int j = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        // int start = 0;
        // int end = 0;

        while(j < arr.length){
            if(j - i + 1 < k){
                sum = sum + arr[j];
                j++;
            }
            else if(j - i + 1 == k){
                sum = sum + arr[j];
                // if(sum > max){
                //     max = sum;
                //     start = i;
                //     end = j;
                // }
                max = sum > max ? sum : max;
                // System.out.println(max);
                sum = sum - arr[i];
                i++;
                j++;
            }
        }
        // System.out.println(Arrays.toString(Arrays.copyOfRange(arr , start , end+1)));
        return max;
    }
}

//          i
//              j
//input - 2 5 1 8 2 9 1 , window size - 3
// 8 14 11 19 12
