package basics.assignments.intermediate;
import java.util.*;

// -----------------------------------WITHOUT USING FUNC---------------------------------------------
// public class OddOrEven{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int n = sc.nextInt();

//         if(n<0)
//             System.out.println("Please enter a valid number.");

//         else if(n%2 == 0)
//             System.out.println(n+" is an even number.");

//         else
//             System.out.println(n+" is an odd number.");
//     }
// }


// -----------------------------------WITH USING FUNC---------------------------------------------
public class OddOrEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        if(n < 0){
            System.out.println("Please enter a valid number.");
            return;
        }

        isOddOrEven(n);
    }

    static void isOddOrEven(int n){
        if(n % 2 == 0)
            System.out.println(n+" is an Even Number.");

        else
            System.out.println(n+" is an Odd Number.");
    }
}