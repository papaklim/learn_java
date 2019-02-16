import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = input.nextInt();
        System.out.println("Таблица умножения x10 для числа " + x + ":");
        System.out.printf("%d * 1 = " + x + "\n", x );
        System.out.printf("%d * 2 = " + x * 2 + "\n", x);
        System.out.printf("%d * 3 = " + x * 3 + "\n", x);
        System.out.printf("%d * 4 = " + x * 4 + "\n", x);
        System.out.printf("%d * 5 = " + x * 5 + "\n", x);
        System.out.printf("%d * 6 = " + x * 6 + "\n", x);
        System.out.printf("%d * 7 = " + x * 7 + "\n", x);
        System.out.printf("%d * 8 = " + x * 8 + "\n", x);
        System.out.printf("%d * 9 = " + x * 9 + "\n", x);
        System.out.printf("%d * 10 = " + x * 10 + "\n", x);
    }
}
