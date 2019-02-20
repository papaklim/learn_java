import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число кратное 10 в диапазоне 10-100: ");
        int t = in.nextInt();
        int x = 10;
        int y = 50;
        int z = 100;
        if(t == x || t == y || t == z)
            System.out.println("Данное значение соответствует одной из констант: X = 10; Y = 50; Z = 100");
        else
            System.out.println("Такой константы нет!");
    }
}
