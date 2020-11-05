import java.util.Scanner;

public class TaskWithN {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int n, q = 170;
        boolean isTrue = false;
        System.out.println(" Enter n num: ");
        n = num.nextInt();
        isTrue = n == 167;

        if (n >= q && isTrue) {
            System.out.println("Num is 10");
            System.out.println("\n");
        } else if (n == 166) {
            System.out.println("Num is equal 166");
        } else {
            System.out.println("Num is lower than" + q);
        }
        switch (n) {
            case 167:
                System.out.println("Num is equal 167");
                break;
            case 100:
                System.out.println("Num is equal 100");
                break;
            case 169:
                System.out.println("Num is equal 169");
                break;
            default:
                System.out.println("Num is equal something");
        }
    }
}