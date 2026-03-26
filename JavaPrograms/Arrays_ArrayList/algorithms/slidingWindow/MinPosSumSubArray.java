//QUES - https://leetcode.com/problems/minimum-positive-sum-subarray/description/?envType=problem-list-v2&envId=sliding-window

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MinPosSumSubArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of list : ");
        int s = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(s);
        System.out.print("Enter integer list : ");
        for(int i=0;i<s;i++){
            list.add(sc.nextInt());
        }
        System.out.print("Enter integer l : ");
        int l = sc.nextInt();
        System.out.print("Enter integer r : ");
        int r = sc.nextInt();
        
        System.out.println(findMinPosSum(list , l , r));
    }
    
    static int findMinPosSum(ArrayList<Integer> list , int l , int r){
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        int j = 0;
        
        for(int k=l;k<=r;k++){  //3
            int size = k;       //3
            
            while(j < list.size()){
                sum = sum + list.get(j);
                
                if(j-i+1 < size)
                    j++;
                else if(j-i+1 == size){
                    if(sum > 0)
                        min = Math.min(sum , min);
                    
                    sum = sum - list.get(i);
                    i++;
                    j++;
                }
            }
            i = 0;
            j = 0;
            sum = 0;
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}


//ques - min sum of subarray whose size is bw l and r.
//         i
//         j
//input - [3  -2  1  4] , l = 2 , r = 3;
//output - 1 (as [3,-2] is min sum as 1 greater than 0)

//possible sub - [3 -2],[3 -2 1],[-2 1],[-2 1 4],[1 4].
//covered - [3 -2],[3 -2 1],[]

// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int minimumSumSubarray(List<Integer> nums, int l, int r) {
//         int min = Integer.MAX_VALUE;
//         int sum = 0;
//         int i = 0;
//         int j = 0;
        
//         for(int k=l;k<=r;k++){  //3
//             int size = k;       //3
            
//             while(j < nums.size()){
//                 sum = sum + nums.get(j);
                
//                 if(j-i+1 < size)
//                     j++;
//                 else if(j-i+1 == size){
//                     if(sum > 0)
//                         min = Math.min(sum , min);
                    
//                     sum = sum - nums.get(i);
//                     i++;
//                     j++;
//                 }
//             }
//             i = 0;
//             j = 0;
//             sum = 0;
//         }
//         return min == Integer.MAX_VALUE ? -1 : min;
//     }
// }