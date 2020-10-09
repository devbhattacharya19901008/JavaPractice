package Basics;

public class Employee {
    String name;
    Integer age;
    Integer salary;
    String designation;
    static String date;

    static {
        date = "10/08/1990";
    }
    public Employee(String name){
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void print(Integer[] array){
        System.out.println(" My name: " + name);
        System.out.println(" My age: " + age);
        System.out.println(" My Salary: " + salary);
        System.out.println(" My designation: " + designation);
        System.out.println(date.length());
        for (Integer element: array
        ) {
            System.out.println(element);
        }
    }
}
