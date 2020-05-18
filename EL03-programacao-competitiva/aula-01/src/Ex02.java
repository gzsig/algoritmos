import java.math.BigInteger;
import java.util.Scanner;

public class Ex02 {
    // https://www.urionlinejudge.com.br/judge/en/problems/view/1161
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BigInteger bigm, bign, big;
        int m = 0, n = 0;
        while (keyboard.hasNext()){
            bigm = BigInteger.ONE;
            bign = BigInteger.ONE;
            big = BigInteger.ZERO;
            m = keyboard.nextInt();
            n = keyboard.nextInt();
            for (int i = 1; i <= m; i++){
                bigm = bigm.multiply(BigInteger.valueOf(i));
            }
            for (int i = 1; i <= n; i++){
                bign = bign.multiply(BigInteger.valueOf(i));
            }
            big = big.add(bigm);
            big = big.add(bign);
            System.out.println("o resultado m é: " + bigm);
            System.out.println("o resultado n é: " + bign);
            System.out.println("o resultado é: " + big);
            System.out.println(big);
        }
    }
}
