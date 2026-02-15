//QUES - https://leetcode.com/problems/flipping-an-image/

package Arrays_ArrayList.leetcode.assignments.easy;
import java.util.*;

// ----------------------------------------PERSONAL VSCODE-----------------------------------------

public class FlipImage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[][] image = new int[3][3];
        System.out.print("Enter an image : ");
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j] = sc.nextInt();
            }
        }

        // OUTPUT OPTION 1 for 2D Arrays : 

        // int[][] result = flipImage(image);
        // System.out.println("Result Image is : ");
        // for(int[] a : result){
        //     System.out.println(Arrays.toString(a));
        // }

        // OUTPUT OPTION 2 for 2D Arrays : 

        System.out.println("Result Image : "+Arrays.deepToString(flipImage(image)));

    }

    // -------------OR------------
    static int[][] flipImage(int[][] image){
        // int[][] result = new int[image.length][image.length];

        // for(int i=0;i<image.length;i++){                     //new array updating,preserving old, space complexity increases.
        //     for(int j=0;j<image[i].length;j++){
        //         result[i][j] = image[i][image[i].length-1-j];
        //     }
        // }

        for(int i=0;i<image.length;i++){                        //2 Pointer Approach, updating given array, space complexity 1 :use two pointer(said in ques also).
            int start = 0;
            int end = image[i].length-1;
            while(end > start){
                int temp = image[i][start];
                image[i][start] = image[i][end];
                image[i][end] = temp;
                start++;
                end--;
            }
        }

        System.out.println("Reversed each row, Array is : ");
        for(int[] a : image){
            System.out.println(Arrays.toString(a));
        }

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[i].length;j++){
                image[i][j] = image[i][j] == 1 ? 0 : 1;
            }
        }
        return image;
    }

    // -------------OR------------
    // static int[][] flipImage(int[][] image){

    //     for(int i=0;i<image.length;i++){                        //2 Pointer Approach, updating given array, space complexity 1 :use two pointer(said in ques also).
    //         int start = 0;
    //         int end = image[i].length-1;
    //         while(end >= start){
    //             int temp = image[i][start];
    //             image[i][start] = image[i][end] == 1 ? 0 : 1;
    //             image[i][end] = temp == 1 ? 0 : 1;
    //             start++;
    //             end--;
    //         }
    //     }
    //     return image;
    // }

}

// ----------------------------------------LEETCODE SOL-----------------------------------------

// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
//         for(int i=0;i<image.length;i++){
//             int start = 0;
//             int end = image[i].length-1;

//             while(end>start){
//                 int temp = image[i][start];
//                 image[i][start] = image[i][end];
//                 image[i][end] = temp;
//                 start++;
//                 end--;
//             }
//         }

//         for(int i=0;i<image.length;i++){
//             for(int j=0;j<image[i].length;j++){
//                 image[i][j] = image[i][j] == 1 ? 0 : 1;
//             }
//         }
//         return image;
//     }
// }


// ----------OR-----------

// class Solution {
//     public int[][] flipAndInvertImage(int[][] image) {
//         for(int i=0;i<image.length;i++){
//             int start = 0;
//             int end = image[i].length-1;

//             while(end>=start){
//                 int temp = image[i][start];
//                 image[i][start] = image[i][end] == 1 ? 0 : 1;
//                 image[i][end] = temp == 1 ? 0 : 1;
//                 start++;
//                 end--;
//             }
//         }
//
//         return image;
//     }
// }