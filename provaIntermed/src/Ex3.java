import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double fabricationCost, finalCost;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Informe o valor do carro");
        fabricationCost = keyboard.nextDouble();
        if (fabricationCost < 12000) {
            finalCost = getPrice(fabricationCost, 5, 0);
        } else if (fabricationCost > 25000) {
            finalCost = getPrice(fabricationCost, 15, 20);
        } else {
            finalCost = getPrice(fabricationCost, 10, 15);
        }
        System.out.println("custo ao consumidor: " + finalCost);
        keyboard.close();
    }

    static double getPrice(double cost, int dis, int tax) {
        double disCost, taxCost;
        disCost = dis / 100.0 * cost;
        taxCost = tax / 100.0 * cost;
        return cost + disCost + taxCost;
    }
}
