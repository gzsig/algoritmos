import java.util.Scanner;

public class OtimizarNotas {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int preco, cem, cinquenta, vinte, dez, cinco, dois, um;
    preco = keyboard.nextInt();
    cem = 0;
    cinquenta = 0;
    vinte = 0;
    dez = 0;
    cinco = 0;
    dois = 0;
    um = 0;
    cem = preco / 100;
    preco = preco % 100;
    cinquenta = preco / 50;
    preco = preco % 50;
    vinte = preco / 20;
    preco = preco % 20;
    dez = preco / 10;
    preco = preco % 10;
    cinco = preco / 5;
    preco = preco % 5;
    dois = preco / 2;
    preco = preco % 2;
    um = preco / 1;
    preco = preco % 1;
    System.out.println("resto: " + preco);
    System.out.println("cem: " + cem);
    System.out.println("cinquenta: " + cinquenta);
    System.out.println("vinte: " + vinte);
    System.out.println("dez: " + dez);
    System.out.println("cinco: " + cinco);
    System.out.println("dois: " + dois);
    System.out.println("um: " + um);
    keyboard.close();
  }
}