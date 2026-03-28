//QUES - https://leetcode.com/problems/spiral-matrix/
//SOURCE - Nikhil Lohia ()

package Arrays_ArrayList.leetcode.assignments.medium;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class SpiralMatrix1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][4];
        System.out.print("Enter m*n matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findSpiralMatrix(arr));
    }

    static List<Integer> findSpiralMatrix(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();

        int colStart = 0;
        int colEnd = arr[0].length - 1;
        int rowStart = 0;
        int rowEnd = arr.length - 1;

        while(rowStart <= rowEnd && colStart <= colEnd){
            //TOP ROW
            for(int i=colStart;i<=colEnd;i++){
                list.add(arr[rowStart][i]);         // 1 2 3
            }
            rowStart++;

            //RIGHT COLUMN
            for(int i=rowStart;i<=rowEnd;i++){
                list.add(arr[i][colEnd]);           // 1 2 3 6 9
            }
            colEnd--;

            //BOTTOM ROW
            if(rowStart <= rowEnd){
                for(int i=colEnd;i>=colStart;i--){
                    list.add(arr[rowEnd][i]);           //
                }
                rowEnd--;
            }

            //LEFT COLUMN
            if(colStart <= colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    list.add(arr[i][colStart]);
                }
                colStart++;
            }
        }
        return list;
    }
}

//            cS   cE
//input -    [[1 , 2 , 3],  
//            [4 , 5 , 6],  rS
//            [7 , 8 , 9]   rE
//            [10, 11, 12]] 

// output - [1,2,3,6,9,8,7,4,5]


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public List<Integer> spiralOrder(int[][] arr) {
//         ArrayList<Integer> list = new ArrayList<>();

//         int colStart = 0;
//         int colEnd = arr[0].length - 1;
//         int rowStart = 0;
//         int rowEnd = arr.length - 1;

//         while(rowStart <= rowEnd && colStart <= colEnd){
//             for(int i=colStart;i<=colEnd;i++){
//                 list.add(arr[rowStart][i]);         
//             }
//             rowStart++;

//             for(int i=rowStart;i<=rowEnd;i++){
//                 list.add(arr[i][colEnd]);         
//             }
//             colEnd--;

//             if(rowStart <= rowEnd){
//                 for(int i=colEnd;i>=colStart;i--){
//                     list.add(arr[rowEnd][i]);           
//                 }
//                 rowEnd--;
//             }

//             if(colStart <= colEnd){
//                 for(int i=rowEnd;i>=rowStart;i--){
//                     list.add(arr[i][colStart]);
//                 }
//                 colStart++;
//             }
//         }
//         return list;
//     }
// }