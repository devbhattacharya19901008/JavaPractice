package org.example;

import java.util.*;

//No duplicates.
public class SetCollection {
    Set hashSet = new HashSet<>();
    Set linkedHashSet = new LinkedHashSet<>();
    Set treeSet = new TreeSet<>();

    public Set returnHashSet (){
        hashSet.add("Dev");
        hashSet.add("Toto");
        hashSet.add("Devarghya");
        return hashSet;
    }

    public Set returnLinkHashSet (){
        linkedHashSet.add("Dev");
        linkedHashSet.add("Toto");
        linkedHashSet.add("Devarghya");
        return linkedHashSet;
    }

    public Set returnTreeSet (){
        treeSet.add("Dev");
        treeSet.add("Toto");
        treeSet.add("Devarghya");
        return treeSet;
    }

    public void display(Set<String> list){
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println("Names are: " + iterator.next());
        }
    }
}
