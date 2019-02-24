import java.util.Arrays;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите количество элементов в массиве: ");
        int s = input.nextInt();
        int [] myArray = new int[s];
        for (int i = 0; i < myArray.length; i++){
            System.out.printf("Введите %d элемент массива: ", i);
            int number = input.nextInt();
            myArray[i] = number*2;}
        System.out.println("Массив из введённых элементов, умноженных на 2: " + Arrays.toString(myArray));
        }


    }