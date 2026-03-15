//QUES - https://leetcode.com/problems/fruit-into-baskets/description/
//SOURCE - Aditya Verma (same reference ques).

package Arrays_ArrayList.algorithms.slidingWindow;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class MaxFruitsIntoBasket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[2];
        System.out.print("Enter Fruits array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaxFruits(arr));
    }

    static int findMaxFruits(int[] arr){
        HashMap<Integer , Integer> map = new HashMap<>();
        int max = 0;
        int i = 0;
        int j = 0;

        while(j<arr.length){
            int fruit = arr[j];
            map.put(fruit , map.getOrDefault(fruit , 0) + 1);

            // if(map.size() < 2){
            //     max = (j-i+1) > max ? (j-i+1) : max;
            //     j++;
            // }

            // OR
            
            if(map.size() <= 2){
                max = (j-i+1) > max ? (j-i+1) : max;
                j++;
            }
            else if(map.size() > 2){
                while(map.size() > 2){ 
                    map.put(arr[i] , map.get(arr[i]) - 1);
                    if(map.get(arr[i]) == 0)
                        map.remove(arr[i]);
                    i++;
                }
                j++;
            }
        }
        return max == 0 ? 1 : max;
    }
}

//             i   
//                         j
//input - [1 , 2 , 3 , 2 , 2]       /   [3,3,3,1,2,1,1,2,3,3,4]
//output - 4 (as [2,3,2,2] is max fruits of same type 2 as per condition)  /  5





// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int totalFruit(int[] fruits) {
//         HashMap<Integer , Integer> map = new HashMap<>();
//         int max = 0;
//         int i = 0;
//         int j = 0;

//         while(j<fruits.length){
//             int fruit = fruits[j];
//             map.put(fruit , map.getOrDefault(fruit , 0) + 1);

//             // if(map.size() < 2){
//             //     max = (j-i+1) > max ? (j-i+1) : max;
//             //     j++;
//             // }

//             if(map.size() <= 2){
//                 max = (j-i+1) > max ? (j-i+1) : max;
//                 j++;
//             }
//             else if(map.size() > 2){
//                 while(map.size() > 2){ 
//                     map.put(fruits[i] , map.get(fruits[i]) - 1);
//                     if(map.get(fruits[i]) == 0)
//                         map.remove(fruits[i]);
//                     i++;
//                 }
//                 j++;
//             }
//         }
//         return max == 0 ? 1 : max;
//     }
// }
