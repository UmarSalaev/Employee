package lesson20.task1;

import java.util.Objects;

public class Employee extends Company implements Comparable<Employee> {

	private int employeeId;
	private String name;
	private String department;
	private int salary;

	public Employee() {
	}

	public Employee(int employeeId, String name, String department, int salary) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(department, employeeId, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(department, other.department) && employeeId == other.employeeId
				&& Objects.equals(name, other.name) && salary == other.salary;
	}

	@Override
	public int compareTo(Employee o) {

		return (this.salary - o.salary);
	}

	@Override
	public String toString() {
		return "Сотрудник:[Id Сотрудника=" + employeeId + ", Имя: " + name + ", Отдел= " + department + ", Зарплата= "
				+ salary + "]";
	}

}
