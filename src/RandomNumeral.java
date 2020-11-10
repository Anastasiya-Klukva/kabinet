/*
 Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
 */

public class RandomNumeral {
        public static void main(String[] args) {

            //( Math.random() * (b-a) ) + a
            int a = 0; // Basic range - "from"
            int b = 250; // End range - "until"
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                int random_number1 = a + (int) (Math.random() * b);
                System.out.println(random_number1);
            }
        }
    }
