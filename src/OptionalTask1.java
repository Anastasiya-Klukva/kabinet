/* Ввести n чисел с консоли.
  Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

 */

import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        System.out.println("введите количество чисел: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + i + "-ое число: ");
            arr[i] = scan.nextInt();
            System.out.println();
        }
        solve(arr);
    }

    public static void solve(int[] arr) {
        String minString = arr[0] + "";
        int min = minString.length();
        String maxString = "";
        int max = maxString.length();

        for (int valInt : arr) {
            String val = valInt + "";
            if (val.length() >= max) {
                max = val.length();
                maxString = val;
            } else if (val.length() <= min) {
                min = val.length();
                minString = val;
            }
        }
        System.out.println(" Max длина =:  " + max);
        System.out.println(" Min длина =:  " + min);
        System.out.println(" Самое длинное Число =:  " + maxString);
        System.out.println(" Самое короткое Число =:  " + minString);
    }
}