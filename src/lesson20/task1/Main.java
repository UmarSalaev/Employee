package lesson20_task1;

import java.util.TreeSet;



public class Main {

	public static void main(String[] args) {

		TreeSet<Employee> employees = new TreeSet<>();
		employees.add(new Employee(1, "Юля", "Бухгалтерия", 2300));
		employees.add(new Employee(2, "Наташа", "Кухня", 4250));
		employees.add(new Employee(3, "Петя", "Ремонт", 1500));
		employees.add(new Employee(4, "Миша", "Офис", 12000));
		System.out.println("До сортировки---");
		print(employees);
		
		TreeSet<Employee> employees1 = new TreeSet<Employee>(new ComparatorName());
		employees1.addAll(employees);
		System.out.println("После сортировки по имени---");
		print(employees1);
		
		TreeSet<Employee> employees2 = new TreeSet<Employee>(new ComparatorId());
		employees2.addAll(employees);
		System.out.println("После сортировки по ID---");
		print(employees2);
		
		TreeSet<Employee> employees3 = new TreeSet<Employee>(new ComparatorDepartment());
		employees3.addAll(employees);
		System.out.println("После сортировки по Отделу---");
		print(employees3);
		
	}

	public static void print(TreeSet<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		System.out.println();
	}
}
