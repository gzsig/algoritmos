import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        int choice;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Digite 1 se deseja cenverter de Celsius para Réaumur ou 2 se deseja cenverter de Réaumur para Celsius.");
        choice = keyboard.nextInt();
        if (choice == 1){
            celToRea(keyboard);
        } else if (choice == 2){
            reaToCel(keyboard);
        } else {
            System.out.println("A operação desejada não existe!");
        }
        keyboard.close();
    }

    static void celToRea(Scanner keyboard){
        int tempI, tempF;
        System.out.println("informe a temperatura inicial em Celsius");
        tempI = keyboard.nextInt();
        tempF = keyboard.nextInt();

        for (int i = tempI; i <= tempF; i ++){
            System.out.println("Celsius: " + i + " Réaumur: " + i * 0.8);
        }

    }

    static void reaToCel(Scanner keyboard){
        int tempI, tempF;
        System.out.println("informe a temperatura inicial em Réaumur");
        tempI = keyboard.nextInt();
        tempF = keyboard.nextInt();

        for (int i = tempI; i <= tempF; i ++){
            System.out.println("Réaumur: " + i + " Celsius: " + i * 1.25);
        }
    }
}
