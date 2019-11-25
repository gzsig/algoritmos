import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double t = 0, x = 0, p = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("quantidade de cafeína ingerida (em mg) ");
        x = keyboard.nextDouble();
        System.out.println("quantidade de horas depois da ingestão para que o programa calcule a quantidade de cafeína ainda restante no corpo");
        t = keyboard.nextDouble();
        p = x * Math.pow(0.85, t);
        System.out.println(p);
    }
}
