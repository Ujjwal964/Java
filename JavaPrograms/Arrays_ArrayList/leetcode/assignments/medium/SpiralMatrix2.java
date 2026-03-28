//QUES - https://leetcode.com/problems/spiral-matrix-ii/description/

package Arrays_ArrayList.leetcode.assignments.medium;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class SpiralMatrix2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(Arrays.deepToString(findSpiralMatrix2(n)));
    }

    static int[][] findSpiralMatrix2(int n){
        int[][] ans = new int[n][n];
        int[] arr = new int[n*n];
        for(int i=1;i<=n*n;i++){
            arr[i-1] = i; 
        }
        System.out.println(Arrays.toString(arr));

        //OR - no need to have arr , just use int num = 1 and add num++;
        // int num = 1;

        int colStart = 0;
        int colEnd = ans[0].length - 1;
        int rowStart = 0;
        int rowEnd = ans.length - 1;
        int index = 0;

        while(rowStart <= rowEnd && colStart <= colEnd){
            //TOP ROW
            for(int j=colStart;j<=colEnd;j++){
                ans[rowStart][j] = arr[index++];
            }
            rowStart++;

            //RIGHT COL
            for(int j=rowStart;j<=rowEnd;j++){
                ans[j][colEnd] = arr[index++];
            }
            colEnd--;

            //BOTTOM ROW
            if(colStart <= colEnd){
                for(int j=colEnd;j>=colStart;j--){
                    ans[rowEnd][j] = arr[index++];
                }
                rowEnd--;
            }

            //LEFT COL
            if(rowStart <= rowEnd){
                for(int j=rowEnd;j>=rowStart;j--){
                    ans[j][colStart] = arr[index++];
                }
                colStart++;
            }
        }
        return ans;
    }
}

//input - 3
//output - [[1,2,3],[8,9,4],[7,6,5]]

//        index
//arr - [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 ]
// how we make it to look - [[1 2 3]
//                           [8 9 4]
//                           [7 6 5]]



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[][] generateMatrix(int n) {
//         int[][] ans = new int[n][n];
//         int[] arr = new int[n*n];
//         for(int i=1;i<=n*n;i++){
//             arr[i-1] = i; 
//         }

//         int colStart = 0;
//         int colEnd = ans[0].length - 1;
//         int rowStart = 0;
//         int rowEnd = ans.length - 1;
//         int index = 0;

//         while(rowStart <= rowEnd && colStart <= colEnd){
//             //TOP ROW
//             for(int j=colStart;j<=colEnd;j++){
//                 ans[rowStart][j] = arr[index++];
//             }
//             rowStart++;

//             //RIGHT COL
//             for(int j=rowStart;j<=rowEnd;j++){
//                 ans[j][colEnd] = arr[index++];
//             }
//             colEnd--;

//             //BOTTOM ROW
//             if(colStart <= colEnd){
//                 for(int j=colEnd;j>=colStart;j--){
//                     ans[rowEnd][j] = arr[index++];
//                 }
//                 rowEnd--;
//             }

//             //LEFT COL
//             if(rowStart <= rowEnd){
//                 for(int j=rowEnd;j>=rowStart;j--){
//                     ans[j][colStart] = arr[index++];
//                 }
//                 colStart++;
//             }
//         }
//         return ans;
//     }
// }