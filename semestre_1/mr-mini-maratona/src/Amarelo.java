import java.util.Scanner;

public class Amarelo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d, f, g, h;

        System.out.println("Informe o primeiro número: ");
        a = teclado.nextInt();

        System.out.println("Informe o segundo número: ");
        b = teclado.nextInt();

        System.out.println("Informe o terceiro número: ");
        c= teclado.nextInt();

        System.out.println("Informe o quarto número: ");
        d= teclado.nextInt();

        f = c + d;
        g = a + b;
        h = a%2;


        if (b>c && d>a && f>g && h == 0) {

            System.out.println("Valores aceitos");

        } else {

            System.out.println("Valores não aceitos");

        }

    }
}
