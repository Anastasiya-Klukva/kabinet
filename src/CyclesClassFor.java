public class CyclesClassFor {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i <= 10 && j >= -10; j--, i++) {
            System.out.println(i + " " + j);
        }
    }
}