import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите значение X: ");
        int x = in.nextInt();

        System.out.print("Введите значение Y: ");
        int y = in.nextInt();

        System.out.print("Введите значение Z: ");
        int z = in.nextInt();

        int average = (x+y+z)/3;
        int delaverage = average/2;
        System.out.println("--------------------------------");
        System.out.printf("Среднее арифметическое чисел %d, %d, %d: %d\n", x, y, z, average);
        System.out.printf("Деление результата среднего арифметического на 2 без остатка: %d\n", delaverage);
        System.out.println("--------------------------------");
        if (delaverage>3)
        System.out.printf("Программа выполнена корректно: %d > 3", delaverage);
        else
        System.out.printf("Программа выполнена некорректно: %d < 3", delaverage);
    }
}
