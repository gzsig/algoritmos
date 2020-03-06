import java.util.Random;
import java.util.Scanner;

public class Includes {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int [] array = new int[10];
        int num;
        arrayRandomFill(array, rand);
        System.out.print("Array: ");
        arrayPrint(array);
        System.out.println("\nQual valor você gostaria de validar?");
        num = keyboard.nextInt();
        if(includes(array, num)){
            System.out.println("presente");
        } else {
            System.out.println("nao present");
        }

    }

    public static void arrayRandomFill(int[] array, Random rand){
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
        }
    }

    public static void arrayPrint(int[] array){
        System.out.print("[");
        for(int i=0; i < array.length; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }

    public static boolean includes(int[] array, int num){
        boolean state = false;
        for (int i = 0; i < array.length ; i++) {
            state = array[i] == num ? true :state;
        }
        return state;
    }
}
