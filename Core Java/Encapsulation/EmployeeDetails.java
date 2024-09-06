package Encapsulation;

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();
        e1.setName("Hadi");
        e1.setAge(45);
        e1.setSalary(40000);

        e2.setName("Shakire");
        e2.setAge(35);
        e2.setSalary(100000);

        e3.setName("Shabnam");
        e3.setAge(23);
        e3.setSalary(300000);

        System.out.println("\t================EMPLOYEES DETAILS================\n");
        System.out.println("Name\t\t" + "Age\t\t" + "Salary");
        System.out.println("----------------------------------------------------");
        System.out.println(e1.getName() + "\t\t" + e1.getAge() + "\t\t" + e1.getSalary());
        System.out.println(e2.getName() + "\t\t" + e2.getAge() + "\t\t" + e2.getSalary());
        System.out.println(e3.getName() + "\t\t" + e3.getAge() + "\t\t" + e3.getSalary());

    }
}
