//QUES - SORTING USING COLLECTIONS + COMPARATOR

package Collections.basicsPractise;
import java.util.*;

public class ComparatorSorting{
    public static void main(String[] args){
        List<String> list = new ArrayList<>(Arrays.asList("aa", "b", "cccc", "ddd"));
        System.out.println("Before : "+list);
        Collections.sort(list , new Comparator<String>(){
            @Override
            public int compare(String a , String b){
                return a.length() - b.length();
            }
        });
        System.out.println("Sort By Comparator : "+list);
    }
}