//QUES - https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class GreatestNoOfCandies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] candies = new int[5];

        System.out.print("Enter an array : ");
        for(int i=0;i<candies.length;i++){
            candies[i] = sc.nextInt();
        }

        System.out.print("Enter extra candies : ");
        int n = sc.nextInt();

        System.out.println("Candies Array is : "+Arrays.toString(candies));

        System.out.println("Boolean Array : "+greatestNoCandies(candies , n));
    }

    // ---------------OR-------------------

    // static ArrayList<Boolean> greatestNoCandies(int[] candies , int n){
    //     ArrayList<Boolean> result = new ArrayList<>(candies.length);

    //     for(int i=0;i<candies.length;i++){
    //         int newCandies = n + candies[i];
    //         boolean max = true;

    //         for(int j=0;j<candies.length;j++){
    //             if(candies[j] > newCandies){
    //                 max = false;
    //                 break;
    //             }
    //         }
    //         result.add(max);
    //     }
    //     return result;
    // }

    // ---------------OR-------------------
    static ArrayList<Boolean> greatestNoCandies(int[] candies , int n){
        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        int max = 0;
        for(int i=0;i<candies.length;i++){
            max = candies[i] > max ? candies[i] : max;
        }
        System.out.println("Maximum Value in Array is : "+max);

        for(int i=0;i<candies.length;i++){
            int newCandies = n + candies[i];
            result.add(newCandies >= max ? true : false);
        }
        return result;
    }
}


//1 2 3 4 5
// extra-5
// 6 2 3 4 5


// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//         ArrayList<Boolean> result = new ArrayList<>(candies.length);

//         for(int i=0;i<candies.length;i++){
//             int newCandies = extraCandies + candies[i];
//             boolean max = true;

//             for(int j=0;j<candies.length;j++){
//                 if(candies[j] > newCandies){
//                     max = false;
//                     break;
//                 }
//             }
//             result.add(max);
//         }
//         return result;
//     }
// }



// --------------OR----------------
// class Solution {
//     public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//         ArrayList<Boolean> result = new ArrayList<>(candies.length);
//         int max = 0;
//         for(int i=0;i<candies.length;i++){
//             max = candies[i] > max ? candies[i] : max;
//         }

//         for(int i=0;i<candies.length;i++){
//             int newCandies = extraCandies + candies[i];
//             result.add(newCandies >= max ? true : false);
//         }
//         return result;
//     }
// }