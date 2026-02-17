//QUES - https://leetcode.com/problems/transpose-matrix/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class TransposeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.print("Enter 2D input : ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Tranpose of given matrix is : "+Arrays.deepToString(transpose(matrix)));
    }

    static int[][] transpose(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int[][] ans = new int[c][r];

        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}

//original       transpose
// 1 2 3        1 4 7
// 4 5 6 ---->  2 5 8
// 7 8 9        3 6 9


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[][] transpose(int[][] matrix) {
//         int r = matrix.length;
//         int c = matrix[0].length;
//         int[][] ans = new int[c][r];

//         for(int i=0;i<ans.length;i++){
//             for(int j=0;j<ans[i].length;j++){
//                 ans[i][j] = matrix[j][i];
//             }
//         }
//         return ans;
//     }
// }