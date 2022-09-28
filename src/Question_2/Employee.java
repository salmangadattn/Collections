package Question_2;

public class Employee implements Comparable<Employee> {

    public String name;

    public Double Age;

    public Double salary;

    public Employee(String name, Double age, Double salary) {
        this.name = name;
        Age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Age=" + Age +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp) {

        return this.name.compareTo(emp.name);

//        int res = this.name.split(" ")[0].compareTo(emp.name.split(" ")[0]);
//        if(res!=0)
//            return res;
//        return this.name.split(" ")[1].compareTo(emp.name.split(" ")[1]);
    }
}
