/**
 * Java 1. Home work 5
 *
 * @author Trushina Irina
 * @version 23.09.2021
 */
import java.util.Arrays;

public class HomeWork5 {
    public static void main (String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivanov Ivan", "Director", "ivanov@mailbox.com", "89150223548", 100000, 46);
        employeeArray[1] = new Employee("Smirnov Victor", "Manager", "smirnov@mailbox.com", "89175236479", 50000, 39);
        employeeArray[2] = new Employee("Zotova Ann", "Manager", "zotova@mailbox.com", "89105625688", 50000, 41);
        employeeArray[3] = new Employee("Petrova Alice", "Administrator", "petrova@mailbox.com", "89096853214", 35000, 22);
        employeeArray[4] = new Employee("Meshkov Ruslan", "Engineer", "meshkov@mailbox.com", "89196523636", 70000, 34);

        Arrays.stream(employeeArray).forEach(System.out::println);
        System.out.println();

        System.out.println("Employees over 40 years old:");
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                System.out.println(employeeArray[i]);
            }
        }
    }
}