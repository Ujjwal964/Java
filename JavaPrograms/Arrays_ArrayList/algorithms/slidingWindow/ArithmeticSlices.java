//QUES - https://leetcode.com/problems/arithmetic-slices/description/?envType=problem-list-v2&envId=sliding-window

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class ArithmeticSlices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(findArithmeticSlices(arr));
    }
    
    
    //BRUTE FORCE(T.C - O(N2) | S.C - O(N)) (SELF)✅
    static int findArithmeticSlices(int[] arr){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int diff = arr[j] - arr[j-1];
                set.add(diff);
                
                if(j-i+1 < 3)
                    continue;
                else if(j-i+1 >= 3){
                    if(set.size() == 1)
                        count++;
                }
            }
            set.clear();
        }
        return count;
    }
    
    //OPTIMAL APPROACH (USES DP + SLIDING WINDOW (NOT NOW WILL UNDERSTAND LATER))
    // static int findArithmeticSlices(int[] arr){
    // }
}

//          i 
//              j
//input - [ 1 2 3 4 ]
//output - 3

//                  i
//                    j
//input - [ 1 2 3 4 5 6 ]
//output - 10


// ------------------------------------------LEETCODE SOL-------------------------------------------

//BRUTE FORCE✅
// class Solution {
//     public int numberOfArithmeticSlices(int[] arr) {
//         Set<Integer> set = new HashSet<>();
//         int count = 0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 int diff = arr[j] - arr[j-1];
//                 set.add(diff);
                
//                 if(j-i+1 < 3)
//                     continue;
//                 else if(j-i+1 >= 3){
//                     if(set.size() == 1)
//                         count++;
//                 }
//             }
//             System.out.println(set);
//             set.clear();
//         }
//         return count;
//     }
// }
