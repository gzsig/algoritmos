import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valor, aux, temp = 10000;



        System.out.println("Informe um valor inteiro");

        valor = teclado.nextInt();

        while(valor > 0) {

            aux = valor / temp;

            switch(aux) {

                case 1:

                case 2:

                case 3:

                    System.out.print("nas montanhas ");

                    break;

                case 4:

                    System.out.print("Frodo ");

                case 5:

                    System.out.print("vive ");

                    break;

                case 6:

                case 7:

                case 8:

                    System.out.print("eternamente ");

                    break;

                default:

                    System.out.print(" - ");

            }

            valor = valor % temp;

            temp = temp / 10;

        }
    }
}
