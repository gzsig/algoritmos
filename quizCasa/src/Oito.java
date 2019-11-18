import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y, i, j, cont = 0;

        System.out.println("Informe um valor entre 1 e 20");

        x = teclado.nextInt();

        System.out.println("Informe outro valor entre 1 e 20");

        y = teclado.nextInt();



        i = 1;

        while(i <= y) {

            j = 1;

            while(j <= x) {

                System.out.print("@");
                cont++;

                j++;

            }

            System.out.println();

            i++;

        }
        System.out.println(cont);
    }
}
