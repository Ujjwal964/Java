//QUES - SORTING MAP VALUES (USES COMPARATOR + LIST)
package Collections.basicsPractise;
import java.util.*;


public class MapValuesSorting{
    public static void main(String[] args){
        // Map<Character , Integer> map = new HashMap<>(Map.of(
        //     'a',3,
        //     'b',1,
        //     'c',2
        // )); 
        //mutable - Map.of() limits max 10 entries.
            
        // Map<Character,Integer> map = Map.of('a',3,'b',1,'c',2);
        //Immutable map - can't add/remove etc.
        
        Map<Character,Integer> map = new HashMap<>(Map.ofEntries(
            Map.entry('a',3),
            Map.entry('b',1),
            Map.entry('c',2)
        )); 
        //mutable - Map.ofEntries(Map.entry()) unlimited entries.
            
        System.out.println(map);
        map.putIfAbsent('d',4);
        System.out.println(map);
        
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("Converted map to list : "+list);
        
        //ASCENDING
        // Collections.sort(list,(e1,e2) -> e1.getValue() - e2.getValue());
        
        //DESCENDING
        Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
            @Override
            public int compare(Map.Entry<Character,Integer> e1 , Map.Entry<Character,Integer> e2){
                return e2.getValue() - e1.getValue();
            }
        });
        System.out.println("Sorted list as per values : "+list);
        
        Map<Character,Integer> ans = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry : list){
            ans.put(entry.getKey() , entry.getValue());
        }
        System.out.println("Sorted map as per values : "+ans);
    }
}