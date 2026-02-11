package Arrays_ArrayList.practise;
import java.util.*;

public class ArrayListBasics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        // ------------ARRAYLIST 1D HARD INPUT-----------
        // ArrayList<Integer> list = new ArrayList<>();

        // // list.add(1);
        // // list.add(2);
        // // list.add(3);
        // // list.add(4);
        // // list.add(5);

        // // System.out.println(list);

        // // ------------ARRAYLIST 1D USER INPUT-----------
        // for(int i=0;i<5;i++){
        //     list.add(sc.nextInt());
        // }
        // System.out.println(list);

        // // ------------ARRAYLIST OPERATIONS-----------
        // System.out.println("ArrayList contains 3 ? : "+list.contains(3));   //searching/checking element.

        // System.out.println("Current List : "+list);
        // list.set(0,99);                 //updating element.
        // System.out.println("Updated List : "+list);

        // list.remove(0);                         //deleting element.
        // System.out.println("Deleted from List : "+list);

        // for(int i=0;i<4;i++){
        //     System.out.print(list.get(i) + " ");        //getting element, here we don't do list[index] that's in arrays, here we do .get(index).
        // }



        // ------------ARRAYLIST 2D USER INPUT-----------
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<3;i++){                       //initialization
            list.add(new ArrayList<>());
        }

        System.out.print("Add Numbers : ");
        for(int i=0;i<3;i++){                       //adding elements
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);

    }
}

