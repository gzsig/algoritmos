import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {
    public static void main(String[] args) {
        int cont = 0;
        ArrayList randNumbers = new ArrayList();
        ArrayList betNumbers = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();

        for (int i = 0; i < 6; i++) {
            System.out.println("informe o numero apostado:");
            betNumbers.add(keyboard.nextInt());
            randNumbers.add(generator.nextInt(60)+1);
        }
        for (int i = 0; i < betNumbers.size(); i++ ){
            if(randNumbers.contains(betNumbers.get(i))){
                cont++;
            }
        }
        System.out.println(betNumbers);
        System.out.println(randNumbers);
        System.out.println("correct numbers: " + cont);
    }
}
