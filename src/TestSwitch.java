import java.util.Scanner;

public class TestSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int x = input.nextInt();
        switch (x) {
            case 1:
                System.out.println("Вы ввели 1");

        }
    }
}