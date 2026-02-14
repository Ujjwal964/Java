//QUES - https://leetcode.com/problems/create-target-array-in-the-given-order/
//here we are given with nums array and index array now we need to create a trageted array where we'll value from
//from this given nums array and these values will go as per index array so nums : [0,1,2,3,4]
// and index : [0,1,2,2,1] then 0 will go on 0th index of new targeted array and so on . since we need to return outpout array type.
// but we'll find the output first in arraylist why? because in arrays, when you insert on same index again
//then it doesnot shift value it replaces it whcih we dont want but in arraylist , it shifts not replace.
//so first finding in arraylist once done , convert it to array by making array and putting values from list into it.

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class TargetArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        int[] index = new int[5];

        System.out.print("Enter numbers : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter numbers : ");
        for(int i=0;i<index.length;i++){
            index[i] = sc.nextInt();
        }

        System.out.println("Target Array is : "+ Arrays.toString(targetArray(nums , index)));
    }

    static int[] targetArray(int[] nums , int[] index){
        ArrayList<Integer> list = new ArrayList<>(nums.length);
        for(int i=0;i<nums.length;i++){
            list.add(index[i] , nums[i]);
            System.out.println(list);
        }

        int[] targetArray = new int[list.size()];
        for(int i=0;i<list.size();i++){
            targetArray[i] = list.get(i);
        }
        return targetArray;
    }
}


//nums - 0 1 2 3 4
//index - 0 1 2 2 1
//output - 0 4 1 3 2


// ----------------------------------------LEETCODE SOL-----------------------------------------


// class Solution {
//     public int[] createTargetArray(int[] nums, int[] index) {
//         ArrayList<Integer> list = new ArrayList<>(nums.length);
//         for(int i=0;i<nums.length;i++){
//             list.add(index[i] , nums[i]);
//         }

//         int[] targetArray = new int[list.size()];
//         for(int i=0;i<list.size();i++){
//             targetArray[i] = list.get(i);
//         }
//         return targetArray;
//     }
// }