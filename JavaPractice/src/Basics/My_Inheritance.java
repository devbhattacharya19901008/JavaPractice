package Basics;

class Inheritance {
    Integer x;
    Integer y;
    public Inheritance(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public Integer add(){
        return x + y;
    }
    public Integer subtract(Integer x, Integer y){
        return x-y;
    }
}

public class My_Inheritance extends Inheritance implements PersonalDetails{
    public My_Inheritance(){
        super(5,8);
    }
    @Override
    public Integer getAgeInMonths(Integer age) {
        return 12*age;
    }
    @Override
    public String getNameInReverse(String name) {
        StringBuilder builder = new StringBuilder();
        builder.append(name);
        return builder.reverse().toString();
    }
    public static void main(String args[]){
        My_Inheritance my_inheritance = new My_Inheritance();
        System.out.println("5 + 8 = " + my_inheritance.add());
        System.out.println("8 - 5 = " + my_inheritance.subtract(8,5));
        System.out.println(my_inheritance.getAgeInMonths(50));
        System.out.println(my_inheritance.getNameInReverse("Dev"));
    }
}

