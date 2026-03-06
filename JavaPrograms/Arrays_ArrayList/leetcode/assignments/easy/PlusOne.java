//QUES https://leetcode.com/problems/plus-one/
//SOURCE - LOGIC HELP (https://youtu.be/Qf2uv_thzs0?si=T5HX-niBx9hWgqIj)

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class PlusOne {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] digits = new int[3];
        System.out.print("Enter digits array : ");
        for(int i=0;i<digits.length;i++){
            digits[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(incrementByOne(digits)));
    }

    //WORKING APPROACH (LITTLE CARRY ALSO) - working for all values
    static int[] incrementByOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] == 9)                  //suppose input is 9 9 9 , starting from last index.
                digits[i] = 0;                  //if we get 9, change that place as 0
            else{
                digits[i]++;                    //if not 9 then just increment that number by 1.
                return digits;
            }
        }

        int[] newArr = new int[digits.length+1];        //if we complete loop and came here means all digits were 9.
        newArr[0] = 1;                                  //creating new array of just 1 size big and 1st index will be 1;
        for(int i=1;i<newArr.length;i++){               //then adding all earlier array values to new array.
            newArr[i] = digits[i-1];
        }
        return newArr;

        //OR
        // digits = newArr;         //now this make digits array point to newArr reference , digits array earlier will be lost.
        // return digits;
    }


    //SELF APPROACH - Not working for 100,1000 integer digits value
    // static int[] incrementByOne(int[] digits){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int number = 0;

    //     for(int i=0;i<digits.length;i++){
    //         number = number * 10 + digits[i];
    //     }

    //     int incrementNo = number + 1;

    //     while(incrementNo > 0){
    //         int rem = incrementNo % 10;
    //         list.add(0 , rem);
    //         incrementNo = incrementNo / 10;
    //     }

    //     int[] ans = new int[list.size()];
    //     for(int i=0;i<list.size();i++){
    //         ans[i] = list.get(i);
    //     }

    //     return ans;
    // }
}

//input - digits : [1,2,9]      |OR|    [9,9,9] 
//outpit - increment by 1 : [1,3,0]   |OR|  [1,0,0,0]



// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[] plusOne(int[] digits) {
//         for(int i=digits.length-1;i>=0;i--){
//             if(digits[i] == 9)
//                 digits[i] = 0;
//             else{
//                 digits[i]++;
//                 return digits;
//             }
//         }

//         int[] ans = new int[digits.length+1];
//         ans[0] = 1;
//         for(int i=1;i<ans.length;i++){
//             ans[i] = digits[i-1];
//         }
//         return ans;
//     }
// }