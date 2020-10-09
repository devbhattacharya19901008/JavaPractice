package Basics;

import java.util.*;

public class LambdaExample {
    interface MathOperation{
        int operation(int a, int b);
    }
    public static void main(String args[]) {
        MathOperation addition = (a,b) -> a+b;
        MathOperation subtraction = (int a, int b) -> a - b;
        MathOperation multiply = (int a, int b) -> {return a*b;};

        LambdaExample lambdaExample = new LambdaExample();
        System.out.println("5 + 3: " +lambdaExample.operate(5,3,addition));
        System.out.println("5 - 3: " +lambdaExample.operate(5,3,subtraction));
        System.out.println("5 * 3: " +lambdaExample.operate(5,3,multiply));

    }

    private int operate(int a, int b, MathOperation math){
        return math.operation(a,b);
    }
}
