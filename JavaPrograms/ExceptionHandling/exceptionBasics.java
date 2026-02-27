//Understanding Java Exception Handling
//SOURCE - ENGINEERING DIGEST (https://youtu.be/IZu5rZTN7PI?si=cVmlWCeapWJPaT09)

//IMP POINTS : 
// 3 types of errors : syntax , logical , runtime errors
// we can catch exception using try catch block.
// to throw we have 2 ways, either we use throw + try-catch (handling inside that respective method).
// or to throw and then adding method signature as throws Exception (need to be handled by caller).
//if using try then compulsory to use either catch / finally and can also be both.
//finally runs everytime even if try / catch have return written in it.
// finally will get only in 2 conditions if we write : 
//Exception follows Heirarchy : like ArithmeticException -> RunTimeExcep -> Exception -> Throwable -> Object.
//Checked (compile time) and unchecked (runtime) exception.
//checked means Exception ( but not runtime). (need to do either using try catch or throws).
//unchecked are basically only all runtime exceptions. (no need of throws or try catch , directly catch in caller method.).
//when we throw means it's a checked so we need to handle it first (either using try-catch+throws or throw+throws) otherwise compile error.
//we can also have multiple catch blocks buss keep in mind heirarchy.
// we can pass multiple exception inside one catch block , buss keep in mind heirarchy.
// Try With Resource : handles auto closing means try(what inside this will close by default when try syntax ends.){}
//Custom Exceptions are done by making new exception class like: public class InsufficentFundsException extends Exception{}.
// in this we make constructor like public InsufficentFundsException(String message){ super(message) }.
//then we can use this exception whereever we want to.


package ExceptionHandling;
import java.util.*;

// ----------------------------------HANDLING EXCEPTION USING TRY CATCH BLOCK--------------------------

// public class exceptionBasics {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] a = {10 , 20 , 30 , 40};
//         int[] b = {2 , 5 , 0 , 5};

//         for(int i=0;i<a.length;i++){
//             System.out.println(divide(a[i] , b[i]));
//         }

//         System.out.println("Program Completed :)");
//     }

//     static int divide(int a , int b){
//         try{
//             return a/b;
//         }catch(ArithmeticException e){
//             System.out.println(e);      //prints complete error trace
//             // System.out.println(e.getMessage());          //prints only main cause of error.
//             return -1;
//         }
//     }
// }


// -------------------------HANDLING CHECKED EXCEPTION USING TRY CATCH + THROW------------------------------

// public class exceptionBasics {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] a = {10 , 20 , 30 , 40};
//         int[] b = {2 , 5 , 0 , 5};

//         for(int i=0;i<a.length;i++){
//             System.out.println(divide(a[i] , b[i]));
//         }

//         System.out.println("Program Completed :)");
//     }

//     static int divide(int a , int b){
//         try{
//             if(b == 0)
//                 throw new Exception("b cannot be zero.");  //CHECKED EXCEPTION
//             return a/b;
//         }
//         catch(Exception e){
//             System.out.println(e);
//             return -1;
//         }
//     }
// }



// --------------------------HANDLING CHECKED EXCEPTION USING THROW + THROWS)-----------------------

// public class exceptionBasics {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] a = {10 , 20 , 30 , 40};
//         int[] b = {2 , 5 , 0 , 5};

//         for(int i=0;i<a.length;i++){
//             try{
//                 System.out.println(divide(a[i] , b[i]));
//             }catch(Exception e){
//                 System.out.println(e);
//             }
//         }

//         System.out.println("Program Completed :)");
//     }

//     static int divide(int a , int b) throws Exception{          //now caller will handle exception.
//         if(b == 0)
//             throw new Exception("b cannot be zero.");  //CHECKED EXCEPTION
//         return a/b;
//     }
// }


// --------------------HANDLING UNCHECKED EXCEPTION (no need of USING try-catch / throws)-------------------

// public class exceptionBasics {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] a = {10 , 20 , 30 , 40};
//         int[] b = {2 , 5 , 0 , 5};

//         for(int i=0;i<a.length;i++){
//             try{
//                 System.out.println(divide(a[i] , b[i]));
//             }catch(ArithmeticException e){
//                 System.out.println(e);
//             }
//         }

//         System.out.println("Program Completed :)");
//     }

//     static int divide(int a , int b){
//         if(b == 0)
//             throw new ArithmeticException("b cannot be zero.");   //UNCHECKED EXCEPTION
//         return a/b;
//     }
// }


// ----------------------------HANDLING EXCEPTION USING TRY CATCH FINALLY BLOCK-----------------------

// public class exceptionBasics {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] a = {10 , 20 , 30 , 40};
//         int[] b = {2 , 5 , 0 , 5};

//         for(int i=0;i<a.length;i++){
//             System.out.println(divide(a[i] , b[i]));
//         }

//         System.out.println("Program Completed :)");
//     }

//     static int divide(int a , int b){
//         try{
//             return a/b;
//         }catch(ArithmeticException e){
//             System.out.println(e);      //prints complete error trace
//             return -1;
//         }
//         finally{
//             System.out.print("Answer : ");
//         }
//     }
// }


// ----------------------------HANDLING EXCEPTION USING MULTIPLE CATCH BLOCKS-----------------------

public class exceptionBasics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = {10 , 20 , 30 , 40};
        int[] b = {2 , 5 , 0 , 5};

        for(int i=0;i<10;i++){
            try{
                System.out.println(divide(a[i] , b[i]));
            }catch(IndexOutOfBoundsException ie){
                // ie.printStackTrace();           //print trace means complete error stack.
                System.out.println(ie);
            }
        }

        System.out.println("Program Completed :)");
    }

    static int divide(int a , int b){
        try{
            return a / b;
        }
        catch(ArithmeticException ae){
            System.out.println("b cannot be zero.");
            return -1;
        }
        catch(Exception e){
            System.out.println(e);
            return -1;
        }
    }
}