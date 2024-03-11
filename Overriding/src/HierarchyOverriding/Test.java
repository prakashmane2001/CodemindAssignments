package HierarchyOverriding;

public class Test {

	public static void main(String[] args) {
        Employee k1 = new Employee();
        Developer k2 = new Developer();
        Manager k3 = new Manager();

        k1.Salary = "400000"; 
        k1.IncrementSalary();
        k2.IncrementSalary();
        k3.IncrementSalary();
    }
}