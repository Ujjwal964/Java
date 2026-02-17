// //QUES - https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MatrixOddCellValues{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] indices = { {1,1},{0,0} };
        
        System.out.println("Odd Cells are : "+oddCells(indices, 2, 3));
    }
    
    static int oddCells(int[][] indices , int m , int n){
        int[][] arr = new int[m][n];
        int odd =0;
        
        for(int i=0;i<indices.length;i++){
            int r = indices[i][0];
            int c = indices[i][1];
            
            for(int j=0;j<n;j++){
                arr[r][j]++;
            }
            for(int k=0;k<m;k++){
                arr[k][c]++;
            }
        }
        System.out.println("Final Matrix : "+Arrays.deepToString(arr));
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                odd += ( arr[i][j] % 2 != 0 ) ? 1 : 0;
            }
        }
        return odd;
    }
}


// ----------------------------------------LEETCODE SOL-----------------------------------------
// class Solution {
//     public int oddCells(int m, int n, int[][] indices) {
//         int[][] arr = new int[m][n];
//         int odd = 0;

//         for(int i=0;i<indices.length;i++){
//             int r = indices[i][0];
//             int c = indices[i][1];

//             for(int j=0;j<n;j++){
//                 arr[r][j]++;
//             }
//             for(int k=0;k<m;k++){
//                 arr[k][c]++;
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 odd += (arr[i][j] % 2 != 0) ? 1 : 0;
//             }
//         }
//         return odd;
//     }
// }