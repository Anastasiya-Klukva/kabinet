/*
Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль
 */

public class Main {
    public static void main(String[] args) {
        int s = 0, p = 1;
        for (int i = 0; i < args.length; i++) {
            int gazelia = Integer.parseInt(args[i]);
            s = s + gazelia;
            p = p * gazelia;
        }
        System.out.println("Sum = " + s);
        System.out.println("Product = " + p);

    }
}
