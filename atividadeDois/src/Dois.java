import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        int n, temp;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o valor de N.");
        n = keyboard.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("digite o proximo valor:");
            temp = keyboard.nextInt();
            numbers.add(temp);
        }
        Collections.sort(numbers);
        System.out.println(numbers.get(n-1) - numbers.get(0));
        System.out.println(numbers);
    }
}
