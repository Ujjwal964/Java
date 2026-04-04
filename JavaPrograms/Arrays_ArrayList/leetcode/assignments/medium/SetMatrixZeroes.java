//QUES - https://leetcode.com/problems/set-matrix-zeroes/
//SOURCE - Striver (https://youtu.be/N0MgLvceX7M?si=zro-NFPj7NDTT29P) | Nikhil Lohia (https://youtu.be/dSxt3ZCbIqA?si=cJBT5fd7uSrCmDNB)

package Arrays_ArrayList.leetcode.assignments.medium;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

//(BRUTE FORCE) (SELF APPROACH)
// public class SetMatrixZeroes {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[][] arr = new int[3][4];
//         System.out.print("Enter m*n matrix : ");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         setZeroes(arr);
//     }

//     static void setZeroes(int[][] arr){
//         int[][] copy = new int[arr.length][arr[0].length];
//         for(int i=0;i<arr.length;i++){
//             copy[i] = arr[i].clone();
//         }

//         int rowIndex = 0;
//         int colIndex = 0;

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j] == 0){
//                     rowIndex = i;
//                     colIndex = j;
//                     copy = convertToZeroes(copy , rowIndex,colIndex);
//                 }
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j] = copy[i][j];
//             }
//         }
//         System.out.println(Arrays.deepToString(arr));
//     }

//     static int[][] convertToZeroes(int[][] copy ,int rowIndex , int colIndex){
         
//         for(int i=0;i<copy[0].length;i++){
//             copy[rowIndex][i] = 0;
//         }
//         for(int i=0;i<copy.length;i++){
//             copy[i][colIndex] = 0;
//         }
//         return copy;
//     }
// }


// ---------------------------------------
//BETTER APPROACH (Striver + Nikhil Lohia)
//TIME COMPLEXITY ~ O(M*N) & SPACE COMPLEXITY - O(N) + O(M)
// public class SetMatrixZeroes {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[][] arr = new int[3][3];
//         System.out.print("Enter m*n matrix : ");
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         setZeroes(arr);
//     }

//     static void setZeroes(int[][] arr){
//         int[] rowArr = new int[arr.length];
//         int[] colArr = new int[arr[0].length];

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j] == 0){
//                     rowArr[i] = 1;              //imagine a col array on top of columns and row arr on left of rows
//                     colArr[j] = 1;              //whenever we see a 0 we mark that rowArr and colArr as 1 (like a flag for later use)
//                 }
//             }
//         }
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){     //and later on iterating again if we see any 1 mark that as 0.
//                 if(rowArr[i] == 1 || colArr[j] == 1)
//                     arr[i][j] = 0;
//             }
//         }
//         System.out.println(Arrays.deepToString(arr));
//     }
// }    


// ---------------------------------------
//OPTIMAL APPROACH (Striver + Nikhil Lohia)
//TIME COMPLEXITY ~ O(M*N) & SPACE COMPLEXITY - O(1)
public class SetMatrixZeroes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];
        System.out.print("Enter m*n matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        setZeroes(arr);
    }

    static void setZeroes(int[][] arr){
        boolean firstRow = false;
        boolean firstCol = false;

        for(int i=0;i<arr.length;i++){       //first condition, checking that considered row if arr[0][0] = 0 means that 1st row and 1st col needs to be zero too.
            if(arr[i][0] == 0)
                firstCol = true;
        }
        for(int i=0;i<arr[0].length;i++){
            if(arr[0][i] == 0)
                firstRow = true;
        }

        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[i][j] == 0){         //now to reduce space , consider 1st row and 1st col as array do same as better approach.
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[i].length;j++){
                if(arr[0][j] == 0 || arr[i][0] == 0)
                    arr[i][j] = 0;          //and same as better approach and make sure to interate from 1st row and 1st col now by 0 since we are considering 1st row and 1st col as array.
            }
        }
        
        if(firstRow){
            for(int j=0;j<arr[0].length;j++){   //last step, changing considered 1st row n col if there's any zero using our flags.
                arr[0][j] = 0;
            }
        }
        if(firstCol){
            for(int i=0;i<arr.length;i++){  
                arr[i][0] = 0;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}

//input - [[1,1,1],
//         [1,0,1],
//         [1,1,1]]

//output - [[1,0,1],
//          [0,0,0],
//          [1,0,1]]




// ----------------------------------------LEETCODE SOL-----------------------------------------

//BRUTE FORCE (SELF APPROACH)
// class Solution {
//     public void setZeroes(int[][] arr) {
//         int[][] copy = new int[arr.length][arr[0].length];
//         for(int i=0;i<arr.length;i++){
//             copy[i] = arr[i].clone();
//         }

//         int rowIndex = 0;
//         int colIndex = 0;

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j] == 0){
//                     rowIndex = i;
//                     colIndex = j;
//                     copy = convertToZeroes(copy , rowIndex,colIndex);
//                 }
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 arr[i][j] = copy[i][j];
//             }
//         }
//     }

//     static int[][] convertToZeroes(int[][] copy ,int rowIndex , int colIndex){
//         for(int i=0;i<copy[0].length;i++){
//             copy[rowIndex][i] = 0;
//         }
//         for(int i=0;i<copy.length;i++){
//             copy[i][colIndex] = 0;
//         }
//         return copy;
//     }
// }


// ---------------------------------------
//BETTER APPROACH (Striver + Nikhil Lohia)
//TIME COMPLEXITY ~ O(M*N) & SPACE COMPLEXITY - O(N) + O(M)
// class Solution {
//     public void setZeroes(int[][] arr) {
//         int[] rowArr = new int[arr.length];
//         int[] colArr = new int[arr[0].length];
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j] == 0){
//                     rowArr[i] = 1;
//                     colArr[j] = 1;
//                 }
//             }
//         }

//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length;j++){
//                 if(rowArr[i] == 1 || colArr[j] == 1)
//                     arr[i][j] = 0;
//             }
//         } 
//     }
// }


// ---------------------------------------
//OPTIMAL APPROACH (Striver + Nikhil Lohia)
//TIME COMPLEXITY ~ O(M*N) & SPACE COMPLEXITY - O(1)
// class Solution {
//     public void setZeroes(int[][] arr) {
//         boolean firstRow = false;
//         boolean firstCol = false;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i][0] == 0)
//                 firstCol = true;
//         }
//         for(int i=0;i<arr[0].length;i++){
//             if(arr[0][i] == 0)
//                 firstRow = true;
//         }

//         for(int i=1;i<arr.length;i++){
//             for(int j=1;j<arr[i].length;j++){
//                 if(arr[i][j] == 0){         
//                     arr[0][j] = 0;
//                     arr[i][0] = 0;
//                 }
//             }
//         }
//         for(int i=1;i<arr.length;i++){
//             for(int j=1;j<arr[i].length;j++){
//                 if(arr[0][j] == 0 || arr[i][0] == 0)
//                     arr[i][j] = 0;          
//             }
//         }

//         if(firstRow){
//             for(int j=0;j<arr[0].length;j++){
//                 arr[0][j] = 0;
//             }
//         }
//         if(firstCol){
//             for(int i=0;i<arr.length;i++){  
//                 arr[i][0] = 0;
//             }
//         }
//     }
// }