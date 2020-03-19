import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] a = new int[5];

        int[] b = new int[5];

        int x = 0, y = 0;



        while(x < 5) {

            System.out.println("Digite um valor para o vetor A: ");

            a[x] = teclado.nextInt();

            System.out.println("Digite um valor para o vetor B: ");

            b[x] = teclado.nextInt();

            x++;

        }



        for(x = 0, y = 0; x < a.length; x++) {

            y += a[x]*b[x];

        }



        System.out.println(y);

    }
}
