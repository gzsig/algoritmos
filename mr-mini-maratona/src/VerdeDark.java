import java.util.Scanner;

public class VerdeDark {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double a, f, x;
        a = 1.50;
        f = 1.10;
        x = 0;
        do {
            a = a + 0.02;
            f = f + 0.03;
            x = x + 1;
        } while (a > f);
        System.out.println("A número de anos é: " + x);
    }
}
