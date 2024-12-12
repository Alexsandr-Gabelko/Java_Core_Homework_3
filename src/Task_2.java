//Опишите класс руководителя, наследник от сотрудника.
//Перенесите статический метод повышения зарплаты в класс руководителя,
//модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем,
//кроме руководителей. В основной программе создайте руководителя и поместите
//его в общий массив сотрудников. Повысьте зарплату всем сотрудникам и проследите,
//чтобы зарплата руководителя не повысилась.

public class Task_2 {
    public static void task_2(){
        int percent = 40;
        Employee employee1 = new Employee("Bill",30000);
        Employee employee2 = new Employee("John",20000);
        Employee employee3 = new Employee("Smith",20000);
        Employee manager = new Employee("Boss", 90000);
        Employee[] employee = {employee1, employee2, employee3, manager};
        Employee.raiseSalary(employee, percent);
    }
}
