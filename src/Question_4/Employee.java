package Question_4;

import java.util.Objects;

public class Employee {

    private String name;

    private double age;

    private double salary;

    private String designation;

    public Employee(String name, double age, double salary, String designation) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public String getName(){ return name;}


    //Avoid adding duplicate objects
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.age, age) == 0 && Double.compare(employee.salary, salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(designation, employee.designation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, designation);
    }
}
