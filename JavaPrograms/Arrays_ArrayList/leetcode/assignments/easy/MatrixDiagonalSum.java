//QUES - https://leetcode.com/problems/matrix-diagonal-sum/description/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MatrixDiagonalSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix : ");
        int s = sc.nextInt();

        int[][] arr = new int[s][s];
        System.out.print("Input Array : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Given Matrix is : "+Arrays.deepToString(arr));
        System.out.println("Diagonals Sum : "+diagonalsSum(arr));
    }

    // ---------OR - O(N2)---------
    static int diagonalsSum(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i;j++){          //primary sum
                sum = arr[i][j] + sum;
            }
            for(int k=arr.length-1-i;k>=arr.length-1-i;k--){    //secondary sum
                sum = arr[i][k] + sum;
            }
        }

        int n = arr.length / 2;
        sum = ( arr.length % 2 != 0 ) ? sum - arr[n][n] : sum;

        return sum;
    }

    // ---------OR - O(N)---------
    // static int diagonalsSum(int[][] arr){
    //     int sum = 0;
    //     for(int i=0;i<arr.length;i++){
    //         sum += arr[i][i];       //primary sum
    //         sum += arr[i][arr.length-1-i];
    //     }

    //     int n = arr.length / 2;
    //     sum = (arr.length % 2 != 0) ? sum - arr[n][n] : sum;

    //     return sum;
    // }
}

//1 2 3
//4 5 6
//7 8 9

// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int sum = 0;

//         for(int i=0;i<mat.length;i++){
//             for(int j=i;j<=i;j++){
//                 sum += mat[i][j];
//             }
//             for(int k=mat.length-1-i;k>=mat.length-1-i;k--){
//                 sum += mat[i][k];
//             }
//         }

//         int n = mat.length / 2;
//         sum = (mat.length % 2 != 0) ? sum-mat[n][n] : sum;
        
//         return sum;
//     }
// }