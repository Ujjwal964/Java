package basics.practise;
import java.util.*;

public class NestedSwitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        int rollNo = sc.nextInt();
        System.out.print("Enter Branch : ");
        String branch = sc.next();

        // ------------------SWITCH OLD VERSION---------------------

        // switch(rollNo){
        //     case 1:
        //         System.out.println("Student Roll No - 1");
        //         break;
        //     case 2:
        //         System.out.println("Student Roll No - 2");
        //         break;
        //     case 3: {
        //         System.out.println("Student Roll No - 3");
        //         switch(branch){
        //             case "Science":
        //                 System.out.println("Science Branch");
        //                 break;
        //             case "Commerce":
        //                 System.out.println("Commerce Branch");
        //                 break;
        //             case "Arts":
        //                 System.out.println("Arts Branch");
        //                 break;   
        //             default:
        //                 System.out.println("Please enter valid Branch.");     
        //         }
        //         break;
        //     }         
        //     default:
        //         System.out.println("Please enter valid Roll No."); 
        // }


        // ------------------SWITCH ENHANCED VERSION---------------------
        switch(rollNo){
            case 1 -> System.out.println("Student Roll No - 1");
            case 2 -> System.out.println("Student Roll No - 2");
            case 3 -> {
                System.out.println("Student Roll No - 3");
                switch(branch){
                    case "Science" -> System.out.println("Science Branch");
                    case "Commerce" -> System.out.println("Commerce Branch");
                    case "Arts" -> System.out.println("Arts Branch");
                    default -> System.out.println("Please enter valid Branch.");  
                }
            }
            default -> System.out.println("Please enter valid Roll No.");  
        }
    }
}
