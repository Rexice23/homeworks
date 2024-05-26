package otus.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> sequence = generateSequenceNumbers(5, 10);
        System.out.println("Последовательные значения от 1 до 10: " + sequence);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 8, 2));
        int sum = sumGreaterThanFive(numbers);
        System.out.println("Сумма элементов больше 5: " + sum);

        replaceAllWithNumber(10, numbers);
        System.out.println("Каждый элемент заменён на указанное число:" + numbers);

        increaseEachElementByNumber(10, numbers);
        System.out.println("Список элементов после увеличения на указанное число:" + numbers);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Сергей", 30));
        employees.add(new Employee("Михаил", 18));
        employees.add(new Employee("Семён", 24));
        employees.add(new Employee("Алексей", 22));

        List<String> names = getEmployeeNames(employees);
        System.out.println("Список сотрудников" + names);

        List<Employee> olderEmployees = getEmployeesOlderOrEqualToAge(employees, 24);
        System.out.println("Список сотрудников старше или равных указанному возрасту" + olderEmployees);

        System.out.println("Превышает средний возраст сотрудников заданное минимальное значение: " + checkAverageAgeGreaterThan(employees, 10));

        System.out.println("Самый молодой сотрудник: " + getYoungestEmployee(employees));
    }

    public static List<Integer> generateSequenceNumbers(int min, int max) {
        List<Integer> sequence = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            sequence.add(i);
        }
        return sequence;
    }

    public static int sumGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    public static void replaceAllWithNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    public static void increaseEachElementByNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }

    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    public static List<Employee> getEmployeesOlderOrEqualToAge(List<Employee> employees, int minAge) {
        List<Employee> appropriateEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                appropriateEmployees.add(employee);
            }
        }
        return appropriateEmployees;
    }

    public static boolean checkAverageAgeGreaterThan(List<Employee> employees, double minAvgAge) {
        double totalAge = 0;
        for (Employee employee : employees) {
            totalAge += employee.getAge();
        }
        double avgAge = totalAge / employees.size();
        if (avgAge > minAvgAge) {
            return true;
        }
        return false;
    }

    public static Employee getYoungestEmployee(List<Employee> employees) {
        Employee youngest = null;
        for (Employee employee : employees) {
            if (youngest == null || employee.getAge() < youngest.getAge()) {
                youngest = employee;
            }
        }
        return youngest;
    }
}
