import java.util.Scanner;

public class Task_4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в двоичном формате: ");
        String binary = in.nextLine();
        int binary2int = Integer.parseInt(binary, 2);
        System.out.printf("Результат перевода двоичного числа \"%s\" в десятичную систему: %d", binary, binary2int);

    }
}
