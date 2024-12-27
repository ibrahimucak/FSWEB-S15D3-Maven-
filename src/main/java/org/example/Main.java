package org.example;

import org.example.entity.Employee;

import java.util.*;

public class Main {

    // findDuplicates: Aynı id'ye sahip çalışanları bulur ve başka bir listeye ekler
    public static List<Employee> findDuplicates(List<Employee> employees) {
        Map<Integer, Employee> uniqueEmployees = new HashMap<>();
        List<Employee> duplicateEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee == null) continue;  // Null kontrolü
            if (uniqueEmployees.containsKey(employee.getId())) {
                duplicateEmployees.add(employee);
            } else {
                uniqueEmployees.put(employee.getId(), employee);
            }
        }

        return duplicateEmployees;
    }

    // findUniques: Tekrar etmeyen çalışanları bulur ve Map'e ekler
    public static Map<Integer, Employee> findUniques(List<Employee> employees) {
        Map<Integer, Employee> uniqueEmployees = new HashMap<>();

        for (Employee employee : employees) {
            if (employee == null) continue;  // Null kontrolü
            uniqueEmployees.putIfAbsent(employee.getId(), employee);
        }

        return uniqueEmployees;
    }

    // removeDuplicates: Aynı id'ye sahip çalışanları siler ve yalnızca benzersiz olanları döndürür
    public static List<Employee> removeDuplicates(List<Employee> employees) {
        Set<Integer> seenIds = new HashSet<>();
        List<Employee> uniqueEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee == null) continue;  // Null kontrolü
            if (!seenIds.contains(employee.getId())) {
                seenIds.add(employee.getId());
                uniqueEmployees.add(employee);
            }
        }

        return uniqueEmployees;
    }

    // Main metodunda örnek liste ile çalıştırılabilir
    public static void main(String[] args) {
//        List<Employee> employees = new LinkedList<>();
//        employees.add(new Employee(1, "Dogancan", "Kinik"));
//        employees.add(new Employee(1, "Dogancan", "Kinik"));
//        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
//        employees.add(new Employee(2, "Seyyit Battal", "Arvas"));
//        employees.add(new Employee(3, "Anil", "Ensari"));
//        employees.add(new Employee(3, "Anil", "Ensari"));
//        employees.add(new Employee(4, "Burak", "Cevizli"));
//        employees.add(null);
//
//        System.out.println("Duplicate Employees: " + findDuplicates(employees));
//        System.out.println("Unique Employees: " + findUniques(employees));
//        System.out.println("Employees after removing duplicates: " + removeDuplicates(employees));


    }
}
