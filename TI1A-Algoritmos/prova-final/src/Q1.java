import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        double principal = 0, tax, interest;
        int days;
        Scanner keyboard = new Scanner(System.in);
        while (principal != -1) {
            System.out.println("Informe o valor principal do empréstimo (-1 para terminar) -> R$");
            principal = keyboard.nextDouble();
            if(principal != -1) {
                System.out.println("Informe a taxa de juros (valor entre 0 e 1) ->");
                tax = keyboard.nextDouble();
                System.out.println("Informe o prazo do empréstimo em dias ->");
                days = keyboard.nextInt();
                interest = calc(principal, days, tax);
                System.out.println("O valor dos juros é de R$" + interest);
            }
        }
    }
    public static double calc(double principal, int days, double tax){
        return principal * tax * days / 365;
    }
}
