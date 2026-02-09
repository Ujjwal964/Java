//QUES - https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

package basics.leetcode.assignments.easy;
import java.util.*;

// -----------------------------------------PERSONAL( VSCODE )-----------------------------------------

public class SubtractProductAndSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter digit : ");
        int n = sc.nextInt();

        // -------------------EITHER THIS---------------------

        int product = 1;
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            product = rem * product;
            sum = rem + sum;
            n = n / 10;
        }
        System.out.println("Products of each digit is : "+product);
        System.out.println("Sum of each digit is : "+sum);
        System.out.println("Result(diff of product & sum) : " + (product-sum));


        // -------------------OR---------------------

        // int p = n;
        // int s = n;

        // int product = 1;
        // int sum = 0;

        // while(p>0){
        //     int rem = p % 10;
        //     product = rem * product;
        //     p = p / 10;
        // }
        // System.out.println("Products of each digit is : "+product);

        
        // while(s>0){
        //     int rem = s % 10;
        //     sum = rem + sum;
        //     s = s / 10;
        // }
        // System.out.println("Sum of each digit is : "+sum);

        // System.out.println("Result(diff of product & sum) : " + (product-sum));
    }
}


// ---------------------------------------------LEETCODE-----------------------------------------------

// import java.util.*;

// class Solution {
//     public int subtractProductAndSum(int n) {
//         int product = 1;                             //here we don't take input, it by default provided in func.
//         int sum = 0;

//         while(n>0){
//             int rem = n % 10;
//             product = rem * product;
//             sum = rem + sum ;
//             n = n / 10;
//         }
//         return (product - sum);              //avoid printing at console here and just direct return
//     }
// }

