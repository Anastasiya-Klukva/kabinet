/*
Ввести n чисел с консоли.
 Вывести числа в порядке возрастания (убывания) значений их длины.
 */
import java.util.Arrays;
import java.util.Scanner;

public class OptionalTask1t2 {
    public static void main(String[] args) {
        System.out.println("enter quantity of numbers: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("enter " + i + "- number: ");
            arr[i] = scan.nextInt();
            System.out.println();

        }
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (String.valueOf(arr[i]).length() > String.valueOf(arr[i + 1]).length()){
                    int a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                    sorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}