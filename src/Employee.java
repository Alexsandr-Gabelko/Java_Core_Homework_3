public class Employee {

    protected String name;
    protected int year;
    protected int month;
    protected int day;
    protected int salary;

    public Employee(String name, int year, int month, int day) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getSalary() {
        return salary;
    }

    public static int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        // Преобразуем даты в числовые значения
        int date1 = year1 * 10000 + month1 * 100 + day1;
        int date2 = year2 * 10000 + month2 * 100 + day2;
        return Integer.compare(date1, date2);
    }

    public static Employee[] raiseSalary(Employee[] employee, int percent){
        for (Employee i : employee){
            i.salary = i.salary * percent;
        }

        return employee;
    }
}
