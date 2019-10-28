import java.util.Scanner;

public class Vermelho {
    public static void main(String[] args) {
        int a, b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Valor do primeiro numero:");
        a = keyboard.nextInt();
        System.out.println("Valor do segundo numero:");
        b = keyboard.nextInt();
        if (validate(a, b)){
            System.out.println("getting primes");
            getPrimeNumbers(a,b);
        } else {
            System.out.println("Os numeros " + a + " e" + b + " não esta dentro das condições solicitadas.");
        }
    }
    public static boolean validate(int a, int b){
        if(a > 0 && b > 0 && a < b ){
            return true;
        } else {
            return  false;
        }
    }
    public static void getPrimeNumbers(int a, int b){
        for (int i = a; i < b; i++){
            int cont = 0;
            double res = 0;
            for (int j = i; j > 0; j--){
//                System.out.println("testing:" + i);
                res = i % j;
//                System.out.println( i +"/" + j);
//                System.out.println("res: "+ res);
                if (res == 0.0){
                    cont ++;
                }
                if (cont > 2){
                    j = 1;
                }
                if(cont < 3 && j == 1 && i != 1){
                    System.out.println("PRIME:"+i);
                }
            }

        }
    }
}
