import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        double m, i, c, t;
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" valor inicial aplicado?");
        c = keyboard.nextDouble();

        System.out.println("taxa de juros aplicada");
        i = keyboard.nextDouble();

        System.out.println("tempo total da aplicação (em meses)");
        t = keyboard.nextDouble();

        i = i / 100;

        m = c * Math.pow((1 + i), t);

        System.out.println(m);
        keyboard.close();
    }
}
