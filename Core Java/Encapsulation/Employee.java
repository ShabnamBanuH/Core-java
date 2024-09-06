package Encapsulation;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public double getSalary(){
        return this.salary;
    }
}
