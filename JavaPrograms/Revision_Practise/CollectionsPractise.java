package Revision_Practise;
import java.util.*;

public class CollectionsPractise {
    public static void main(String[] args){
        sortUsingCollections();
        removeDuplicatesFromArray();
        reverseListWithoutCollections();
        sortStringByLength();
        sortMapByValues();
        sortByFrequency();
        sortByFrequencyTieBreaker();
        topKFrequentElements();
        topKFrequentElementsMinHeap();
        topKFrequentElementsMaxHeap();
        firstNonRepeatChar();
        firstNonRepeatCharQueue();
        groupAnagrams();
        
    }

    static void sortUsingCollections(){
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,7,5,2,9));
        List<Integer> list2 = Arrays.asList(4,2,7,9,1);
        System.out.println("List before sorting : "+list1);
        Collections.sort(list1);
        System.out.println("List after sorting Asc : "+list1);
        Collections.sort(list2 , Collections.reverseOrder());
        System.out.println("List after sorting desc : "+list2);
    }

    static void removeDuplicatesFromArray(){
        Integer[] arr = {1,1,3,4,5,6,6,7,8,8,9};
        Set<Integer> ans = new HashSet<>();
        for(int a : arr){
            ans.add(a);
        }
        System.out.printf("Unique Elements : %s",ans);
    }

    static void reverseListWithoutCollections(){
        // List<Integer> list = [1,2,3,4,5,6,7,8];❌
        // List<Integer> list = new ArrayList<>([1,2,3,4,5,6,7]);❌
        // List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println("List is : "+list);


        //One - Brute force - T.C - O(N) | S.C - O(N)
        // List<Integer> ans = new ArrayList<>(list.size());
        // for(int i=list.size()-1 ; i>=0;i--){
        //     ans.add(list.get(i));
        // }
        // System.out.println("Reverse List is : "+ans);


        //Two - 2 pointer approach - T.C - O(N) | S.C - O(1)
        int start = 0;
        int end = list.size()-1;
        while(end > start){
            int temp = list.get(start);
            list.set(start++ , list.get(end));
            list.set(end-- , temp);
        }
        System.out.println("Reverse List is : "+list);
    }

    static void sortStringByLength(){
        List<String> list = new ArrayList<>(Arrays.asList("apple", "bat", "banana", "cat"));
        System.out.printf("Def list : %s \n",list);
        
        Collections.sort(list);
        System.out.printf("No Comparator sort list : %s \n",list);
        
        Collections.sort(list , (a,b)-> a.length()-b.length());
        System.out.printf("Custom comparator lambda sort : %s \n",list);
        
        Collections.sort(list , new Comparator<String>(){
            @Override
            public int compare(String a , String b){
                return a.length() - b.length();
            }
        });
        System.out.printf("Full comparator method Sort : %s",list);
    }

    static void sortMapByValues(){
        Map<Character,Integer> map = new HashMap<>(Map.ofEntries(
            Map.entry('a',3),
            Map.entry('b',1),
            Map.entry('c',2)
        ));
        System.out.printf("Map given is : %s \n",map);

        //BRUTE FORCE❌
        // List<Integer> list = new ArrayList<>();
        // for(int value : map.values()){
        //     list.add(value);
        // }
        // System.out.printf("Converted values to list : %s \n",list);
        // Collections.sort(list);
        // System.out.printf("Sorted values : %s \n",list);
        // Map<Character,Integer> ans = new HashMap<>(map.size());
        // for(Map.Entry<Character,Integer> entry : map.entrySet()){
        //     Character key = entry.getKey();
        //     Integer value = entry.getValue();
        //     for(int i=0;i<list.size();i++){
        //         if(map.containsValue(list.get(i)))
        //             map.put()
        //     }
        // }
        // System.out.println(map);


        //Collections Approach
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
        System.out.printf("Converted map to list : %s \n",list);
        
        Collections.sort(list , (a,b) -> a.getValue() - b.getValue());
        System.out.println("Sorted list as per values : "+list);
        
        Map<Character,Integer> ans = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> entry : list){
            ans.put(entry.getKey() , entry.getValue());
            
            //OR
            // Character key = entry.getKey();
            // Integer value = entry.getValue();
            // ans.put(key , ans.getOrDefault(key , 0)+value);
        }
        System.out.println(ans);
    }

    static void sortByFrequency(){
        int[] arr = new int[]{1, 1, 2, 2, 2, 3};

        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a , map.getOrDefault(a,0)+1);
        }
        System.out.println("Converted Array to map : "+map);
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        System.out.println("Converted to list : "+list);
        
        Collections.sort(list , new Comparator<Map.Entry<Integer,Integer>>(){
            @Override
            public int compare(Map.Entry<Integer,Integer> a , Map.Entry<Integer,Integer> b){
                return a.getValue() - b.getValue();
            }
        });
        //OR
        // Collections.sort(list , (a,b) -> a.getValue() - b.getValue());
        System.out.println("Sorted list by values : "+list);
        
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : list){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            for(int i=0;i<value;i++){
                arr[index++] = key;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    static void sortByFrequencyTieBreaker(){
        int[] arr = new int[]{4, 4, 1, 1, 2, 2, 3};
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a , map.getOrDefault(a , 0) + 1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        // Collections.sort(list , new Comparator<Map.Entry<Integer,Integer>>(){
        //     @Override
        //     public int compare(Map.Entry<Integer,Integer> a , Map.Entry<Integer,Integer> b){
        //         return (a.getValue() == b.getValue() ? a.getKey() - b.getKey() : a.getValue() - b.getValue());
        //     }
        // });
        
        //OR
        Collections.sort(list , (a,b) -> a.getValue().equals(b.getValue()) ? a.getKey() - b.getKey() : a.getValue() - b.getValue());
        System.out.println("Sorted list as per tie breaker condition : "+list);
        
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : list){
            for(int i=0;i<entry.getValue();i++){
                arr[index++] = entry.getKey();
            }
        }
        System.out.println("Tie Breaker Freq Sort : "+Arrays.toString(arr));
    }

    //USING MAP + LIST + COMPARATOR (T.C - O(NLogN) | S.C - O(N) )
    static void topKFrequentElements(){
        int[] arr = new int[]{1,1,1,2,2,3};
        int k = 2;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a , map.getOrDefault(a , 0) + 1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());
        
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = list.get(i).getKey();
        }
        System.out.println("Top K Freq Elements : "+Arrays.toString(ans));
    }

    //USING MAP + PRIORITYQUEUE + COMPARATOR(MIN HEAP) (T.C - O(NLogK) | S.C - O(N) )
    static void topKFrequentElementsMinHeap(){
        int[] arr = new int[]{1,1,1,2,2,3};
        int k = 2;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a , map.getOrDefault(a,0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>( (a,b) -> a.getValue() - b.getValue());
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size() > k) minHeap.poll();
        }
        System.out.println("Min Heap PriorityQueue is : "+minHeap);
        
        int[] ans = new int[k];
        int index = 0;
        while(! minHeap.isEmpty()){
            ans[index++] = minHeap.poll().getKey();
        }
        System.out.println("Top K using priority queue : "+Arrays.toString(ans));
    }

    static void topKFrequentElementsMaxHeap(){
        int[] arr = new int[]{1,1,1,2,2,3};
        int k = 2;
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int a : arr){
            map.put(a , map.getOrDefault(a,0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> maxHeap = new PriorityQueue<>( (a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            maxHeap.offer(entry);
        }
        System.out.println("Max Heap PriorityQueue is : "+maxHeap);
        
        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = maxHeap.poll().getKey();
        }
        System.out.println("Top K using priority queue : "+Arrays.toString(ans));
    }

    //USING HASHMAP ONLY
    static void firstNonRepeatChar(){
        String s = "leetcode";
        
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.trim().toLowerCase().charAt(i);
            map.put(ch , map.getOrDefault(ch,0) + 1);
        }
        System.out.println("Map : "+map);
        
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println("Non-Repeat Char : "+entry.getKey());
                System.out.println("Index is : "+s.indexOf(entry.getKey()));
                break;
            }
        }
    }

    //USING HASHMAP + QUEUE
    static void firstNonRepeatCharQueue(){
        String s = "leetcode";
        char[] arr = s.toCharArray();
        
        Map<Character,Integer> map = new LinkedHashMap<>();
        Queue<Character> queue = new LinkedList<>();
        for(char c : arr){
            if(map.containsKey(c)){
                map.put(c , map.get(c)+1);
                if(queue.contains(c))
                    queue.remove(c);
            }
            else{
                map.put(c , 1);
                queue.offer(c);
            }
        }
        System.out.println("Map : "+map);
        System.out.println("Queue  : "+queue);
        System.out.println("Non - Repeat Char : "+queue.peek());
        System.out.println("Non - Repeat Char Index : "+s.indexOf(queue.poll()));
    }

    static void groupAnagrams(){
        String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};

        Map<String , List<String>> map = new HashMap<>();
        
        for(String s : arr){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String s1 = new String(ch);
            
            if(map.containsKey(s1))
                map.get(s1).add(s);
            else{
                List<String> temp = new ArrayList<>();
                temp.add(s);
                map.put(s1 , temp);
            }
        }
        System.out.println("Map is : "+map);
        System.out.println(map.values());
    }
}
