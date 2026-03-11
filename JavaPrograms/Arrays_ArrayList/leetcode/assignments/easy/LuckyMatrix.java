//QUES - https://leetcode.com/problems/lucky-numbers-in-a-matrix/
package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class LuckyMatrix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.print("Enter m*n matrix : ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(luckyNumbers(arr));
    }
    
    static List<Integer> luckyNumbers(int[][] arr){
        List<Integer> ans = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minColIndex = -1;
            
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                    minColIndex = j;
                }
            }
            System.out.print(min + " ");
            
            for(int k=0;k<arr.length;k++){
                max = Math.max(arr[k][minColIndex] , max);
            }
            System.out.print(max);
            System.out.println();
            
            if(min == max)
                ans.add(min);
        }
        return ans;
    }
}


//input -    [[3 7 8]        //min row - 3 , max col = 15
//           [9 11 13]       //min row - 9 , max col = 15
//           [15 16 17]]     //min row - 15 , max col = 15 (matched)

//output - 15



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public List<Integer> luckyNumbers(int[][] arr) {
//         List<Integer> ans = new ArrayList<>();

//         for(int i=0;i<arr.length;i++){
//             int min = Integer.MAX_VALUE;
//             int max = Integer.MIN_VALUE;
//             int minColIndex = -1;

//             for(int j=0;j<arr[i].length;j++){
//                 if(arr[i][j] < min){
//                     min = arr[i][j];
//                     minColIndex = j;
//                 }
//             }

//             for(int k=0;k<arr.length;k++){
//                 max = Math.max(arr[k][minColIndex] , max);
//             }

//             if(min == max)
//                 ans.add(min);
//         }
//         return ans;
//     }
// }
