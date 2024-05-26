package otus.java.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        // 1. Генерация списка последовательных значений
        List<Integer> sequence = generateSequenceNumbers(5, 10);
        System.out.println("Последовательные значения от 1 до 10: " + sequence);

        // 2. Подсчет суммы элементов списка, больших 5
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 4, 8, 2));
        int sum = sumGreaterThanFive(numbers);
        System.out.println("Сумма элементов больше 5: " + sum);

        // 3. Замена всех элементов списка на указанное число
        replaceAllWithNumber(10, numbers);
        System.out.println("Каждый элемент заменён на указанное число:" + numbers);

        // 4. Увеличение элементов списка на указанное число
        increaseEachElementByNumber(10, numbers);
        System.out.println("Список элементов после увеличения на указанное число:" + numbers);

        // 5-6. Создание сотрудников и получение имен сотрудников
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Сергей", 30));
        employees.add(new Employee("Михаил", 18));
        employees.add(new Employee("Семён", 24));
        employees.add(new Employee("Алексей", 22));

        List<String> names = getEmployeeNames(employees);
        System.out.println("Список сотрудников" + names);

        // 7. Получение списка сотрудников старше равных указанному возрасту
        List<Employee> olderEmployees = getEmployeesOlderOrEqualToAge(employees, 24);
        System.out.println("Список сотрудников старше или равных указанному возрасту" + olderEmployees);

        // 8. Проверка, что средний возраст превышеает указанное значение
        System.out.println("Превышает средний возраст сотрудников заданное минимальное значение: " + checkAverageAgeGreaterThan(employees, 10));

        // 9. Получение ссылки на самого молодого сотрудника
        System.out.println("Самый молодой сотрудник: " + getYoungestEmployee(employees));
    }

    // 1. Метод для генерации списка последовательных значений
    public static List<Integer> generateSequenceNumbers(int min, int max) {
        List<Integer> sequence = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            sequence.add(i);
        }
        return sequence;
    }

    // 2. Метод для подсчета суммы элементов списка, больших 5
    public static int sumGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num > 5) {
                sum += num;
            }
        }
        return sum;
    }

    // 3. Метод для замены всех элементов списка на указанное число
    public static void replaceAllWithNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
    }

    // 4. Метод для увеличения каждого элемента списка на указанное число
    public static void increaseEachElementByNumber(int number, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + number);
        }
    }
    // 5. Создан класс сотрудник - Employee.

    // 6. Метод, принимающий в качестве аргумента список сотрудников и возвращающий список их имён
    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee employee : employees) {
            names.add(employee.getName());
        }
        return names;
    }

    // 7. Метод для получения списка сотрудников старше или равных указанному возрасту
    public static List<Employee> getEmployeesOlderOrEqualToAge(List<Employee> employees, int minAge) {
        List<Employee> appropriateEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAge() >= minAge) {
                appropriateEmployees.add(employee);
            }
        }
        return appropriateEmployees;
    }

    // 8. Метод, проверяющий что средний возраст сотрудников превышает указанный аргумент
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

    // 9. Метод, возвращающий ссылку на самого молодого сотрудника
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
