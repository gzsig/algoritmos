import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        int n, sum, cont;
        double med;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Informe o valor de N:");
        n = keyboard.nextInt();


        sum = 0;
        cont = 0;
        for(int i = 1; i < n; i++){
            if (i % 2 == 1){
                System.out.println(i);
                sum += i;
                cont++;
            }
        }
        System.out.println(sum/cont);
    }
}
