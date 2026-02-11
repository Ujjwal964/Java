package basics.practise;
import java.util.*;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit : ");
        String f = sc.next();

        // -------------OLDER SWITCH VERSION----------
        // switch(f){
        //     case "Mango":
        //         System.out.println("King of fruits.");
        //         break;
        //     case "Apple":
        //         System.out.println("Big sweet fruit.");
        //         break;
        //     case "Banana":
        //         System.out.println("Best as Pre-Workout");
        //         break;
        //     default:
        //         System.out.println("Please enter valid fruit.");    
        // }

        // ---------------ENHANCED SWITCH VERSION------------------
        switch(f){
            case "Mango" -> System.out.println("King of fruit.");
            case "Apple" -> System.out.println("Big sweet fruit.");
            default -> System.out.println("Please enter valid fruit."); 
        }
    }
}
