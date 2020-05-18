import java.math.BigInteger;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BigInteger big = BigInteger.ONE;
        int number = 0;
        number = keyboard.nextInt();
        for (int i = 1; i <= number; i++){
            big = big.multiply(BigInteger.valueOf(i));
        }
        System.out.println("o resultado é: " + big);
    }
}
