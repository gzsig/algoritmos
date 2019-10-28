import java.util.Scanner;

public class Azul {
    public static void main(String[] args) {
        double x, y;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Informe o valor de x");
        x = keyboard.nextDouble();
        System.out.println("Informe o valor de y");
        y = keyboard.nextDouble();

        if(y == 0 && x==0){
            System.out.println("origem");
        } else if (y == 0){
            System.out.println("Eixo X");
        } else if (x == 0 ){
            System.out.println("Eixo Y");
        } else if(y > 0 && x > 0){
            System.out.println("Quadante 1");
        } else if(x > 0 && y < 0){
            System.out.println("Quadante 2");
        } else if(y < 0 && x < 0){
            System.out.println("Quadante 3");
        } else if (y < 0 && x > 0){
            System.out.println("Quadante 4");
        }
    }
}

