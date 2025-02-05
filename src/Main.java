import java.util.Scanner;

/*
    1. сложение
    2. вычитание
    3. умножение
    4. деление
    0. выход из системы
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        startMessage();

        int a = scanner.nextInt();
        int b, c;
        double result;

        while (a != 0) {
            System.out.println("Введите первое число");
            b = scanner.nextInt();
            System.out.println("Введите второе число");
            c = scanner.nextInt();

            switch (a) {
                case 1:
                    result = addition(b, c);
                    message(a, result);
                    break;
                case 2:
                    result = subtraction(b, c);
                    message(a, result);
                    break;
                case 3:
                    result = multiplication(b, c);
                    message(a, result);
                    break;
                case 4:
                    if (c == 0) {
                        System.out.println("Делить на нуль НЕЛЬЗЯ!!!");
                        break;
                    }
                    result = divisoin(b, c);
                    message(a, result);
                    break;
                default:
                    System.out.println("Выбрана не верная операция");
            }

            startMessage();
            a = scanner.nextInt();
        }
    }

    public static double addition(int a, int b) {
        return a + b;
    }

    public static double subtraction(int a, int b) {
        return a - b;
    }

    public static double multiplication(int a, int b) {
        return a * b;
    }

    public static double divisoin(int a, int b) {
        return (double) a / b;
    }

    public static void message(int a, double b) {
        switch (a) {
            case 1:
                System.out.println("Результат сложения = " + b);
                break;
            case 2:
                System.out.println("Результат вычитания = " + b);
                break;
            case 3:
                System.out.println("Результат умножения = " + b);
                break;
            case 4:
                System.out.println("Результат деления = " + b);
                break;
        }
    }

    public static void startMessage() {
        System.out.println("_________________________________________________________");
        System.out.println("Что вы хотите выполнить");
        System.out.println("""
                    1. сложение\s
                    2. вычитание\s
                    3. умножение\s
                    4. деление\s
                    0. выход из системы\s
                    """);
    }
}