package Basics;

import java.util.*;

public class HashMapExample {
    enum Level{
        HIGH,
        LOW,
        MEDIUM
    }
    public static void main(String args[]){
        for (Level level:
             Level.values()) {
            System.out.println(level);
        }
        LinkedHashMap hashMap = new LinkedHashMap();
        hashMap.put("Dev", 29);
        hashMap.put("Shubho", 42);
        hashMap.put("Mou", 45);
        hashMap.put("Jojo", 31);

        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("KEY is: " + entry.getKey());
            System.out.println("VALUE is: " + entry.getValue());
        }
    }
}
