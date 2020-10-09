package Basics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String args[]){
        List<Integer> list = Arrays.asList(45, 5, 5, 89, 3, 69, 3, 28, 11, 98);
        List sort = list.stream().sorted().collect(Collectors.toList());
        System.out.println(sort);
        List map = list.stream().map(i -> squared(i)).distinct().sorted().collect(Collectors.toList());
        map.forEach(System.out::println);

        IntSummaryStatistics summaryStatistics = list.stream().mapToInt(i -> i).summaryStatistics();
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getAverage());
        System.out.println(summaryStatistics.getMin());
        System.out.println(summaryStatistics.getSum());
    }


    private static int squared(int i){
        return i*i;
    }
}
