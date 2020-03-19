import java.util.Scanner;

public class VerifyInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        recursive(keyboard);
    }

    public static void recursive(Scanner keyboard){
        int x = getNumber(keyboard);
        if(varify(x)){
            System.out.println("boa, seu numero é maior que zero");
            divisor(x);
        } else {
            System.out.println("por favor tente novamente");
            recursive(keyboard);
        }
    }

    public static void divisor(int x){
        for (int i=1; i < x+1; i++){
            if(x % i == 0){
                System.out.println(i);
            }
        }
    }

    public static int getNumber(Scanner keyboard){
        int x = 0;
        System.out.println("digite um valor");
        return x = keyboard.nextInt();
    }

    public static boolean varify(int x){
        if(x > 0) {
            return  true;
        } else {
            return false;
        }
    }
}
