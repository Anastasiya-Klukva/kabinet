/*
  Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class NumeralClass {
    public static void main(String[] args) {
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(" " + args[i]);
        }
    }
}
