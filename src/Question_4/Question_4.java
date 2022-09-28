package Question_4;

import java.util.HashMap;
import java.util.Map;

public class Question_4 {

    public static void main(String[] args) {

        Map<Employee, Double> map = new HashMap<Employee, Double>();

        Employee emp1 = new Employee("Sal", 23, 200000, "SDE");
        Employee emp2 = new Employee("Sal", 23, 200000, "SDE");
        Employee emp3 = new Employee("Joe", 23, 345967, "SDE");
        Employee emp4 = new Employee("Park", 23, 230000, "SDET");
        Employee emp5 = new Employee("Sim", 23, 234566, "SDE");

        map.put(emp1, emp1.getSalary());
        map.put(emp2, emp2.getSalary());
        map.put(emp3, emp3.getSalary());
        map.put(emp4, emp4.getSalary());
        map.put(emp5, emp5.getSalary());


        for (Map.Entry<Employee, Double> e : map.entrySet()) {
            System.out.println("Name : " + e.getKey().getName() + " Salary : " + e.getValue());
        }
    }


}
