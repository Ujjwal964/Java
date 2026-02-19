//QUES - https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MatrixRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];
        int[][] target = new int[3][3];

        System.out.print("Enter mat array : ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter target array : ");
        for(int i=0;i<target.length;i++){
            for(int j=0;j<target[i].length;j++){
                target[i][j] = sc.nextInt();
            }
        }

        System.out.println(equalByRotation(mat , target));
    }
    
    static boolean equalByRotation(int[][] mat , int[][] target){
        boolean isEqual = true;
        int[][] current = mat;
    
        for(int r=0;r<4;r++){
            
            for(int i=0;i<target.length;i++){
                for(int j=0;j<target[i].length;j++){
                    isEqual = current[i][j] == target[i][j] ? true : false;
                    if(isEqual == false)
                        break;
                }
                if(isEqual == false)
                    break;
            }
            if(isEqual == true)
                break;
            
            int[][] rotate = new int[mat.length][mat.length];
            for(int i=0;i<mat.length;i++){
                for(int j=0;j<mat[i].length;j++){
                    rotate[i][j] = current[mat.length-1-j][i];
                }
            }
            System.out.println("After increment : "+Arrays.deepToString(rotate));
            
            current = rotate;
        }
        return isEqual;
    }
}

//mat                               //target
// 0 0 0            1 0 0            1 1 1
// 0 1 0 ---90'---> 1 1 0 ---90'---> 0 1 0
// 1 1 1            1 0 0            0 0 0


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public boolean findRotation(int[][] mat, int[][] target) {
//         boolean isEqual = true;
//         int[][] current = mat;
//         int n = mat.length;
        
//         for(int r=0;r<4;r++){

//             for(int i=0;i<target.length;i++){
//                 for(int j=0;j<target[i].length;j++){
//                     isEqual = (current[i][j] == target[i][j]) ? true : false;
//                     if(isEqual == false)
//                         break;
//                 }
//                 if(isEqual == false)
//                     break;
//             }
//             if(isEqual == true)
//                 break;

//             int[][] rotate = new int[n][n];
//             for(int i=0;i<mat.length;i++){
//                 for(int j=0;j<mat[i].length;j++){
//                     rotate[i][j] = current[n-1-j][i];
//                 }
//             }

//             current = rotate;
//         }
//         return isEqual;
//     }
// }