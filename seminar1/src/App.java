import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // System.out.println(sum(10));
        task2();

    }

    // Задача 1. Вычислить сумма чисел от 1 до n. Первый способ рекурсией. 
    // Иду от последнего заданного числа и на уменьшение до 1. Второй - через цикл for.
    
    // public static int sum(int n) {
    // if (n==1) return 1;
    // return n+sum(n-1);
    // }

    public static int sum(int n) {
        int sum = 0;
        for (int index = 1; index < n + 1; index++) {
            sum = sum + index;
        }
        return sum;
    }


    // Задача2. Вывести все простые числа от 1 до 1000
    
    private static void task2() {
        System.out.println("Введите положительное число: ");
        Scanner iScanner = new Scanner(System.in);
        int r = iScanner.nextInt();
        iScanner.close();

        for (int j = 2; j <= r; j++) {
            boolean res = false;

            for (int i = 2; i * i <= j; i++) {
                res = (j % i == 0);
                if (res) {
                    break;
                }
            }
            if (!res) {
                System.out.print(j + " ");
            }
        }
    }
}