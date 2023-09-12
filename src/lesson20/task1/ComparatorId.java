package lesson20.task1;

import java.util.Comparator;

public class ComparatorId implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeId() - o2.getEmployeeId();
	}
}