package org.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LearnLambda {
    public static void main(String args[]){
        LearnLambda learnLambda = new LearnLambda();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(21);
        arrayList.add(12);

        Consumer<Integer> consumer = (n) -> System.out.println(n);
        arrayList.forEach(consumer);

        arrayList.stream()
                .sorted()
                .filter(n -> n>2)
                .map(n -> n*n)
                .forEach(n -> learnLambda.display(n));

        arrayList.forEach(n -> learnLambda.display(n));

        StringFunction exclaim = s -> s + "!";
        StringFunction ask = s -> s + "?";

        String stringToDisplay = "Hello";
        System.out.println(exclaim.run(stringToDisplay));
        System.out.println(ask.run(stringToDisplay));
    }

    void display(Integer n){
        System.out.println(n);
    }
}
