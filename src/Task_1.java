//Написать прототип компаратора - метод внутри класса сотрудника,
//сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд,
//без использования условного оператора.

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task_1 {
    public static void task_1(){
        int result;
        Map<Integer, String> resultMap = new HashMap<>();
        resultMap.put(-1, "Первая дата позже второй");
        resultMap.put(0, "Дата равны");
        resultMap.put(1, "Первая дата раньше второй");
        Random random = new Random();
        Employee employee1 = new Employee("Bill",2024,10, random.nextInt(1, 31));
        Employee employee2 = new Employee("John",2024,10,random.nextInt(1, 31));
        result = Employee.compareDates(employee1.getYear(), employee1.getMonth(), employee1.getDay(),
            employee2.getYear(), employee2.getMonth(), employee2.getDay());
        System.out.println("Результат сравнения дат: ");
        System.out.println("Первая дата: " + employee1.getYear() + "-" + employee1.getMonth() + "-" +
            employee1.getDay());
        System.out.println("Вторая дата: " + employee2.getYear() + "-" + employee2.getMonth() + "-" +
            employee2.getDay());
        System.out.printf(resultMap.get(result) + "\n\n");
    }
}
