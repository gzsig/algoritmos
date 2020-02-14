import java.util.Scanner;

public class Nerdilandia {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int candA, candB, candC, branco;
    double porcentagem, cidadaos;

    System.out.println("Quantos votos teve o primeiro candidato?");
    candA = keyboard.nextInt();
    System.out.println("Quantos votos teve o segundo candidato?");
    candB = keyboard.nextInt();
    System.out.println("Quantos votos teve o terceiro candidato?");
    candC = keyboard.nextInt();
    System.out.println("Quantos votos foram brancos?");
    branco = keyboard.nextInt();
    System.out.println("Quantos votos foram brancos?");

    cidadaos = candA +candB + candC + branco;

    porcentagem= branco/cidadaos;

    System.out.println("cidadãos: " + cidadaos);
    System.out.println("porcentagem de votos em branco: " + porcentagem);
    

    keyboard.close();

  }

}