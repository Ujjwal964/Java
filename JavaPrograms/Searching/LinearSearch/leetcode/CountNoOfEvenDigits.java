//QUES - https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
//SOURCE - https://youtu.be/_HRA37X8N_Q?si=hEs0NeBme6iinmsy
//Already done in arrays, doing here as per Linear Search.(so leetcode sol check there).

package Searching.LinearSearch.leetcode;
import java.util.*;

public class CountNoOfEvenDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        
        CountNoOfEvenDigits obj = new CountNoOfEvenDigits();
        System.out.println(obj.CountEvenDigits(arr));
        sc.close();
    }
    
    //1st Approach (Optimal)(Kunal's way)
    int CountEvenDigits(int[] arr){
        int ans = 0;
        for(int element : arr){
            if(element < 0)
                element *= -1;

            int digits = (int)(Math.log10(element)) + 1; //bit approach - trick to find no of digits.
            ans += (digits % 2 == 0) ? 1 : 0;
        }
        return ans;
    }

    //2nd Approach (counting no of digits)(Better Approach)
    // int CountEvenDigits(int[] arr){
    //     int ans = 0;
    //     for(int element : arr){
    //         int digits = 0;
    //         if(element < 0)
    //             element *= -1;

    //         while(element > 0){
    //             element = element/10;
    //             digits++;
    //         }
    //         ans += (digits % 2 == 0) ? 1 : 0;
    //     }
    //     return ans;
    // }
    
    //3rd Approach (converting to string)(Brute Force)
    // int CountEvenDigits(int[] arr){
    //     int ans = 0;
    //     for(int element : arr){
    //         int digits = 0;
    //         String str = Integer.toString(element);
    //         digits = str.length();
    //         ans += (digits % 2 == 0) ? 1 : 0;
    //     }
    //     return ans;
    // }
}

//input - [12,345,2,6,7896]