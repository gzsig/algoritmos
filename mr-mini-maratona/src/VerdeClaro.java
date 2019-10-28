import java.util.Scanner;

public class VerdeClaro {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int usrIn, div = 1;
        double res = 0;
        System.out.println("Numero de frações?");
        usrIn = keyboard.nextInt();
        for (int i = 0; i < usrIn; i++) {
            res += (1 / Math.pow(div, 3));
            div = div + 2;
        }
        System.out.println(res);
    }
}
