//Print the elements of an array in the decreasing frequency if 2 numbers have same frequency
// then print the one which came first.

import java.util.*;

public class Ques7 {
    
    
    public static void main(String[] args) {
        int [] inputArray ={1,6,3,2,5,2,3,1,1,2,2,3,4,5,6,7,8};
        Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
        int[] arr = inputArray;
        
        for(int i: arr){
            if(linkedHashMap.containsKey(i)){
                linkedHashMap.put(i,linkedHashMap.get(i)+1);
            }else
                linkedHashMap.put(i,1);
        }
        
        
        List<ValueFrequencyPair> list = new LinkedList<>();
        
        for(Map.Entry<Integer,Integer> e:linkedHashMap.entrySet()){
            list.add(new ValueFrequencyPair(e.getKey(),e.getValue()));
            
        }
        Collections.sort(list, new SortFrequency());
        for(ValueFrequencyPair v: list){
            System.out.println(v.i+"  "+v.value);
        }
        
        
    }
 
}
class ValueFrequencyPair{
    
    int i;
    Integer value;
    
    public ValueFrequencyPair(Integer i, Integer value) {
        this.i = i;
        this.value = value;
    }
}

class SortFrequency implements Comparator<ValueFrequencyPair>{
    
    
    @Override
    public int compare(ValueFrequencyPair v1, ValueFrequencyPair v2) {
        if(v1.value == v2.value){
        return 0;
        }else if(v1.value >v2.value)
        return -1;
        else
            return 1;
    }
}
