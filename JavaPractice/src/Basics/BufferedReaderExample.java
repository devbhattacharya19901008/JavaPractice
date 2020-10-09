package Basics;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


public class BufferedReaderExample {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of the test cases");
        String testcases = br.readLine();
        int intTest = Integer.parseInt(testcases);
        int[] a = new int[intTest];
        System.out.println("Enter the number");
        String numbers = br.readLine();
        String[] number = numbers.trim().split("\\s+");
        for (int i = 0; i < number.length; i++) {
            a[i] = Integer.parseInt(number[i]);
        }
        for (int i = 0; i <= a.length -1; ++i) {
        int index = 1;
            while (index <= a[i]){
                if (index % 3 == 0 && index % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (index % 3 == 0)
                    System.out.println("Fizz");
                else if (index % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(index);

                index++;
            }

        }

    }
}
