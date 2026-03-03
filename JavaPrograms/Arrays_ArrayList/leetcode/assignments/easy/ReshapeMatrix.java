//QUES - https://leetcode.com/problems/reshape-the-matrix/
//SOURCE - (https://youtu.be/MKagHnxWjJg?si=gGRZTAL6n9hrYgcU)
package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ReshapeMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[2][2];
        System.out.print("Enter mat array : ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter r for reshape matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter c for reshape matrix : ");
        int c = sc.nextInt();

        System.out.println("Current Given array : "+Arrays.deepToString(mat));
        System.out.println("Reshaped Matrix is : "+Arrays.deepToString(reshapeMatrix(mat , r , c)));
    }

    static int[][] reshapeMatrix(int[][] mat , int r , int c){
        int[][] ans = new int[r][c];
        int row = 0; 
        int col = 0;

        if(mat.length * mat[0].length != r * c)
            return mat;

        else if(mat.length * mat[0].length == r * c){
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    ans[row][col] = mat[i][j];
                    col++;

                    if(col == c){
                        row++;
                        col = 0;
                    }
                }
            }
        }
        return ans;
    }
    
}

//mat = [[1,2],[3,4]] , r=1 , c=4
//output = [[1,2,3,4]]

//mat = [[1,2],[3,4]] , r=2 , c=4
//output = [[1,2],[3,4]] , since invalid r and c given so return original.



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[][] matrixReshape(int[][] mat, int r, int c) {
//         int[][] ans = new int[r][c];
//         int m = mat.length;
//         int n = mat[0].length;
//         int row = 0;
//         int col = 0;

//         if(m * n != r * c)
//             return mat;

//         else if(m * n == r * c){
//             for(int i=0;i<m;i++){
//                 for(int j=0;j<n;j++){
//                     ans[row][col] = mat[i][j];
//                     col++;

//                     if(col == c){
//                         col = 0;
//                         row++;
//                     }
//                 }
//             }
//         }
//         return ans;
//     }
// }