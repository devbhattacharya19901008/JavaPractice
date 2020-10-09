package Basics;

public class GenericsExample<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println("Element: " + element);
        }
    }
     public static void main(String args[]){
            GenericsExample<Integer> intExample = new GenericsExample<Integer>();
            GenericsExample<String> stringExample = new GenericsExample<String>();
            intExample.add(10);
            stringExample.add("Deva");
            System.out.println("Integer: " + intExample.get());
            System.out.println("String: " + stringExample.get());
            Integer[] intArray = {1,2,3,4,5};
            String[] strngArray = {"dev","devarghya"};
            printArray(intArray);
            printArray(strngArray);
        }
}
