package Arrays_ArrayList.practise;
import java.util.*;

public class ArraysBasics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // ----------------2D ARRAY HARD INPUT----------------
        int[][] arr1 = {
            {1,2,3},
            {4,5},
            {6,7}
        };
        
        // ----------------2D ARRAY OUTPUT----------------
        //1 way
        // for(int row=0;row<arr1.length;row++){
        //     System.out.print(Arrays.toString(arr1[row]));
        //     System.out.println();
        // }
        
        //2 way
        // for(int row=0;row<arr1.length;row++){
        //     for(int col=0;col<arr1[row].length;col++){
        //         System.out.print(arr1[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        
        //3 way
        // for(int[] a : arr1){
        //     System.out.println(Arrays.toString(a));
        // }

        //4 way
        // System.out.println("Result Image : "+Arrays.deepToString(flipImage(arr1)));
        
        
        // ----------------2D ARRAY USER INPUT----------------
        int[][] arr2 = new int[3][3];
        
        System.out.println("Enter numbers : ");
        for(int row=0;row<arr2.length;row++){
            for(int col=0;col<arr2[row].length;col++){
                arr2[row][col] = sc.nextInt();
            }
        }
        
        // ----------------2D ARRAY OUTPUT----------------
        //1 way
        // for(int row=0;row<arr2.length;row++){
        //     for(int col=0;col<arr2[row].length;col++){
        //         System.out.print(arr2[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        
        //2 way
        for(int[] a : arr2){
            System.out.println(Arrays.toString(a));
        }
        
        //3 way
        // for(int row=0;row<arr2.length;row++){
        //     System.out.println(Arrays.toString(arr2[row]));
        // }

        //4 way
        // System.out.println("Result Image : "+Arrays.deepToString(flipImage(arr2)));
    }
}




















