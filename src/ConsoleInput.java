import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();
        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.print("Введите ваш рост: ");
        float height = in.nextFloat();
        System.out.printf("Вас зовут %s, вам %d лет, ваш рост %.2f см", name, age, height);
    }
}
