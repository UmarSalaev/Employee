package lesson20.task1;

import java.util.Comparator;

public class ComparatorDepartment implements Comparator<Employee>{
	
	
	public int compare(Employee o1, Employee o2) {
		
		return o1.getDepartment().compareTo(o2.getDepartment());
	}
}
