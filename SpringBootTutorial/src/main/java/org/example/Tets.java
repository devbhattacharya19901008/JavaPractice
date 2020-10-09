package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Tets {

    public boolean find(ArrayList<Integer> numbers, Integer sum){
        Iterator iterator = numbers.iterator();
        while(iterator.hasNext()){
            Integer numberToFind = sum - (Integer) iterator.next();
            if(numbers.contains(numberToFind)){
                return true;
            }
        }
        return false;
    }
}
