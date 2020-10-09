package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        App app = new App();
        SpringApplication.run(App.class, args);
        HelloWorld helloWorld = new HelloWorld();

        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(11);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(2);

       /* arrayList.stream()
                .sorted()
                .filter(n -> n % 2 != 0)
                .map(n -> n*n)
                .forEach(n -> app.disp(n));*/

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Dev");
        hashSet.add("Toto");
        hashSet.add("Devarghya");

        hashSet.stream()
                .sorted()
                .filter(s -> s.startsWith("D"))
                .forEach(s -> System.out.println(s));

    }

    void disp(String string){
        System.out.println(string);
    }
}