package org.example;

import java.util.*;

// These can have duplicate data.
public class ListCollection {
    List<Integer> arrList = new ArrayList<Integer>();
    List<String> linkList = new LinkedList<String>();

    public List<Integer> arrayListTest() {
        arrList.add(1);
        arrList.add(1);
        arrList.add(2);
        return arrList;
    }

    public List<String> linkListTest() {
        linkList.add("Dev");
        linkList.add("Devarghya");
        linkList.add("Tom");
        return linkList;
    }

    public void display(List<Integer> listToDisplay, boolean otherWay) {
        if (!otherWay) {
            for (Integer no :
                    listToDisplay) {
                System.out.println("NUMBER is :" + no);
            }
        } else {
            Iterator iterator = listToDisplay.iterator();
            while (iterator.hasNext()) {
                System.out.println("NEW NUMBER is :" + iterator.next());
            }
        }
    }

    public void displayString(List<String> listToDisplay) {
        Iterator iterator = listToDisplay.iterator();
        while (iterator.hasNext()) {
            System.out.println("NEW String is :" + iterator.next());
        }
    }

}
