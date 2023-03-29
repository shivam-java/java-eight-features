package com.java8features.problemsolving.miscellaneous;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMap {

    public static void main(String[] args) {


        HashMap<String,Integer> hashMap=new HashMap<>();

        hashMap.put("virat",3);
        hashMap.put("rohit",31);
        hashMap.put("dhoni",13);
        hashMap.put("raina",23);
        hashMap.put("yuvi",1);

        ArrayList<Map.Entry<String, Integer>> collect = hashMap.entrySet().stream().collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(collect,(e1, e2)->e1.getValue()>e2.getValue()?1:-1);
        System.out.println(collect);
                  HashMap<String,Integer> sortedMap=new LinkedHashMap<>();
        hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(e->sortedMap.put(e.getKey(), e.getValue()));
        System.out.println("LinkedHashMap "+sortedMap);
        Map<String, Integer> collect1 = hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).
        collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));

        System.out.println("Sorted "+collect1);
    }
}
