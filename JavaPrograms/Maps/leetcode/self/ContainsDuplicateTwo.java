//QUES - https://leetcode.com/problems/contains-duplicate-ii/description/
//SOURCE - https://youtu.be/RBxjA_cGr7g?si=8TDMcCn-eyZsZziM

package Maps.leetcode.self;
import java.util.*;

public class ContainsDuplicateTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.print("Enter Array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k : ");
        int k = sc.nextInt();

        System.out.println(containsDuplicateTwo(arr , k));
    }

    //First
    static boolean containsDuplicateTwo(int[] arr , int k){
        boolean ans = false;
        Map<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(Math.abs ( map.get(arr[i]) - i ) <= k){
                    ans = true;
                    break;
                }
            }
            map.put(arr[i] , i);
        }
        return ans;
    }
}

//               i
//input - [1,2,3,1,2,3] , k = 2;
//output - false


// ----------------------------------LEETCODE SOL---------------------------------

//FIRST
// class Solution {
//     public boolean containsNearbyDuplicate(int[] arr, int k) {
//         boolean ans = false;
//         Map<Integer , Integer> map = new HashMap<>();

//         for(int i=0;i<arr.length;i++){
//             if(map.containsKey(arr[i])){
//                 if(Math.abs ( map.get(arr[i]) - i ) <= k){
//                     ans = true;
//                     break;
//                 }
//             }
//             map.put(arr[i] , i);
//         }
//         return ans;
//     }
// }