import java.util.Scanner;

public class Branca {
    public static void main(String[] args) {
        int numOfTriangles;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Quantos triangulos voce quer validar?");
        numOfTriangles = keyboard.nextInt();
        if (numOfTriangles < 0) {
            System.out.println("O numero " + numOfTriangles + "não esta dentro das condições solicitadas.");
        }
        for (int i = 0; i < numOfTriangles; i++) {
            getSides(numOfTriangles, keyboard);
        }
        keyboard.close();
    }

    public static void getSides(int triangles, Scanner keyboard) {
        double a, b, c;
        System.out.println("Informe o primeiro lado");
        a = keyboard.nextInt();
        System.out.println("Informe o segundo lado");
        b = keyboard.nextInt();
        System.out.println("Informe o terceiro lado");
        c = keyboard.nextInt();
        if(validate(a, b, c)) {
            System.out.println(getType(a, b, c));
        }
    }

    public static boolean validate(double a, double b, double c) {
        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            System.out.println("Não é um triangulo");
            return false;
        }
    }

    public static String getType(double a, double b, double c) {
        String type = "";

        if (a == b && a == c && b == c) {
            type = "equilatero";
        } else if (a == b || b == c || c == a) {
            type = "isoscelles";
        } else {
            type = "escaleno";
        }

        return type;
    }

}
