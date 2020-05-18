import java.util.Scanner;

public class Fibonacci1029 {
    static int count = 0;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int times, fat;
        times = keyboard.nextInt();
        for (int i = 0; i < times; i++) {
            count = -1;
            int res = 0;
            fat = keyboard.nextInt();
            res = fib(fat);
            System.out.println("fib(" + fat + ") = " + count + " calls = " + res);
        }
        keyboard.close();
    }

    public static int fib(int n) {
        count++;
        if (n == 0) {
            return 0;

        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
