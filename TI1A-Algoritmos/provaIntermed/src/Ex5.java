import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int a, b, c, d;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Primeiro valor");
        a = keyboard.nextInt();
        numbers.add(a);

        System.out.println("Segundo valor");
        b = keyboard.nextInt();
        numbers.add(b);

        System.out.println("Terceiro valor");
        c = keyboard.nextInt();
        numbers.add(c);

        System.out.println("Quarto valor");
        d = keyboard.nextInt();
        numbers.add(d);

        Collections.sort(numbers);

        if (numbers.get(0) == a && numbers.get(1) == b && numbers.get(2) == c && numbers.get(3) == d) {
            System.out.println("os valores estão em ordem crescente");
        } else if (numbers.get(3) == a && numbers.get(2) == b && numbers.get(1) == c && numbers.get(0) == d) {
            System.out.println("os valores estão em ordem decrescente");
        } else {
            System.out.println("os valores não estão em ordem");
        }

        keyboard.close();

    }
}
