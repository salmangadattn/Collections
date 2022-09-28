package Question_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question_2 {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("abhi gupta", 23D, 400000D));
        employees.add(new Employee("abhi sharma", 26D, 200000D));
        employees.add(new Employee("sal khan", 33D, 100000D));
        employees.add(new Employee("sal aam", 29D, 30000D));
        employees.add(new Employee("raj dadar", 33D, 2444400D));

        //Using comparable
        Collections.sort(employees);

        System.out.println("\n Employee sorted by first and last name \n");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        //Using comparator
        Collections.sort(employees, new SalaryComparator());

        System.out.println("\n Employee sorted by salary. \n");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


}
