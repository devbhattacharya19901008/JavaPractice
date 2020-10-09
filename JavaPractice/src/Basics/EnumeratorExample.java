package Basics;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorExample {
    public static void main(String args[]){
        Enumeration days;
        Vector daysInWeek = new Vector();
        daysInWeek.add("Monday");
        daysInWeek.add("Tuesday");
        daysInWeek.add("Wednesday");
        daysInWeek.add("Thursday");
        daysInWeek.add("Friday");
        daysInWeek.add("Saturday");
        daysInWeek.add("Sunday");
        days = daysInWeek.elements();
        while (days.hasMoreElements())
            System.out.println(days.nextElement());
    }
}
