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
        Manager manager = new Manager("Boss", 90000);
        Employee[] employees = {employee1, employee2, employee3, manager};

        // Выводим зарплаты до повышения
        System.out.println("До повышения зарплат:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        // Повышаем зарплаты
        Manager.raiseSalary(employees, percent);

        // Выводим зарплаты после повышения
        System.out.println("\nПосле повышения зарплат:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

}
