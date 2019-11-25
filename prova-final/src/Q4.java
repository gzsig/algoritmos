import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Scanner keyboard = new Scanner(System.in);
        int min, max;
        System.out.println("o menor valor possivel");
        min = keyboard.nextInt();
        System.out.println("o maior valor possivel");
        max = keyboard.nextInt();

        for(int i = 0; i < 10; i++){
            numbers.add(getRandomNumber(min, max));
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println("maior valor" + numbers.get(9));
        System.out.println("segundo maior valor" + numbers.get(8));
    }

    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
