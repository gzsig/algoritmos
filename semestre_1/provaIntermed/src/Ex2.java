import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int a, b, c, w, l, branco, total;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe a quantidade de votos da chapa A");
        a = keyboard.nextInt();
        numbers.add(a);

        System.out.println("Informe a quantidade de votos da chapa B");
        b = keyboard.nextInt();
        numbers.add(b);

        System.out.println("Informe a quantidade de votos da chapa C");
        c = keyboard.nextInt();
        numbers.add(c);

        System.out.println("Informe a quantidade de votos em branco");
        branco = keyboard.nextInt();
        numbers.add(branco);

        Collections.sort(numbers);

        total = a + b + c + branco;

        System.out.println("Total de alunos que votaram: " + total);

        w = numbers.get(3);
        l = numbers.get(0);

        if (w == a) {
            System.out.println("Chapa vencedora: A");
        } else if (w == b) {
            System.out.println("Chapa vencedora: B");
        } else if (w == c) {
            System.out.println("Chapa vencedora: C");
        } else {
            System.out.println("A maior parte dos alunos votaram em branco");
        }

        if (l == a) {
            System.out.println("Chapa que ficou em última colocação: A");
        } else if (l == b) {
            System.out.println("Chapa que ficou em última colocação: B");
        } else if (l == c) {
            System.out.println("Chapa que ficou em última colocação: C");
        } else {
            System.out.println("A menor parte dos alunos votaram em branco");
        }

        keyboard.close();

    }
}
