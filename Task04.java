package tasks;


import java.util.Scanner;

public class Task04 {

    /**
     * Написать программу, которая играет с вами в угадай число.
     * Сначала программа печатает: "Введи нижную и верхнюю границы"
     * Пользователь вводит.
     * Программа проверяет, что нижняя граница меньше верхней.
     * Иначе выводит в консоль сообщение об ошибке и завершается.
     *
     * Далее программа пытается угадать какое число загадал пользователь
     * в введенном отрезке.
     * Тактика может быть любая: random, перебор, бин поиск.
     * Программа выводит своё предположение.
     * Пользователь должен ввести "yes", если программа угадал.
     * Программа завершается.
     * Иначе любое другое сообщение. Тогда программа продолжает угадывать.
     *
     * Пример:
     * Введи границы
     * 0 10
     * Это 1?
     * no
     * Это 3?
     * no
     * Это 5?
     * yes
     * Отличная игра(завершение)
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи нижную и верхнюю границы:");
        int lower_border = scanner.nextInt();
        int upper_border = scanner.nextInt();
        scanner.nextLine();
        if (lower_border > upper_border) {
            System.out.println("Incorrect input");
        } else {
            for (int i = lower_border; i < upper_border; ++i){
                System.out.println("Это " + i + "?");
                String line = scanner.nextLine();
                if (line.equals("yes")) {
                    System.out.println("Отличная игра");
                    break;
                }
            }
        }
    }

}
