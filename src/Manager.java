public class Manager extends Employee {

    public Manager(String name, int salary) {
        super(name, salary);
    }

    public static void raiseSalary(Employee[] employees, int percent) {
        for (Employee i : employees) {
            if (!(i instanceof Manager)) {
                int newSalary = (int)(i.getSalary() * (1 + percent / 100.0));
                i.setSalary(newSalary);
            }
        }
    }
}
