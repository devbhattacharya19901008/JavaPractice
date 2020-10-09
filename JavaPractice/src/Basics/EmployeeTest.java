package Basics;

public class EmployeeTest {
    static Integer[] array = {1,2,3,4,5};
    public static void print(){
        System.out.println("Hello!");
    }
    public static void nonStatic(){
        System.out.println("non-static");
    }
    public static void main(String arg[]){
        Employee employee = new Employee("Dev");
        employee.setDesignation("Software Developer");
        employee.setAge(30);
        employee.setSalary(3000);
        employee.print(array);
        print();
        nonStatic();
    }
}
