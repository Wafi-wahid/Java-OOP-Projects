package project001;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>(
                List.of(
                        new Employee("John", "Smith", "jdoe", 1000.0),
                        new Employee("Jane", "Williams", "jane", 2000.0),
                        new Employee("Joe", "Johnson", "joe", 3000.0),
                        new Employee("Jill", "Anderson", "jill", 4000.0),
                        new Employee("Jim", "Brown", "jim", 5000.0),
                        new Employee("Jenny", "Taylor", "jenny", 6000.0),
                        new Employee("Jen", "Clark", "jen", 7000.0),
                        new Employee("Jenny", "Thomas", "jenny", 8000.0),
                        new Employee("Jen", "Wilson", "jen", 9000.0)

                )
        );

        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
