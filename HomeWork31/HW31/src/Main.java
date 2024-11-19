/*
Создать класс Employee c полями id, name, age, salary.
Сделать его Comparable по salary (по зарплате)
Создайте массив объектов Employee и отсортируйте его по зарплате
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = {
                new Employee(1,"Jack", 33,3300.40),
                new Employee(2,"Nick", 23, 3200.40),
                new Employee(3,"Ira", 34, 4200.50),
                new Employee(4,"Igor", 34,1890.70),
                new Employee(5,"John", 31, 3890.70)
        };
        printArray(employees);
        Arrays.sort(employees);
        printArray(employees);
    }

    public static void printArray(Employee[] employees){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }
}