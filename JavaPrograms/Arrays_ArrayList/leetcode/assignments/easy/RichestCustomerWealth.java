//QUES - https://leetcode.com/problems/richest-customer-wealth/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class RichestCustomerWealth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.print("Enter Array : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Given 2D array is : ");
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        richestCustomer(arr);
    }

    static void richestCustomer(int[][] arr){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=0;j<arr[i].length;j++){
                sum = arr[i][j] + sum;
            }

            max = sum > max ? max = sum : max;
        }
        System.out.println("Richest Customer Wealth is : "+max);
    }
}

// 1 2 3
// 4 5 6



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int maximumWealth(int[][] accounts) {
//         int max = 0;
//         for(int i=0;i<accounts.length;i++){
//             int sum = 0;
//             for(int j=0;j<accounts[i].length;j++){
//                 sum = accounts[i][j] + sum;
//             }
            
//             max = sum > max ? max=sum : max;
//         }
//         return max;
//     }
// }