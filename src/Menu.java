import java.util.Scanner;

public class Menu {
    public static void menu(){

        Scanner scanner = new Scanner(System.in);
        int number;
        while (true) {
            System.out.println("\nВыберети задание ");
            System.out.println("1 - задание №_1");
            System.out.println("2 - задание №_2");
            System.out.println("0 - Выход");
            number = scanner.nextInt();
            if (number == 1) {
                Task_1.task_1();
            } else if (number == 2) {
                Task_2.task_2();
            } else if (number == 0) {
                break;
            } else {
                System.out.println("Вы ввели неверное значение!");
            }
        }
    }
}
