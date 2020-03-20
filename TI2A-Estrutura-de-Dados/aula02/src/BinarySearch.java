import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        int [] array = new int[10];
        int num;
        arrayRandomFill(array, rand);
        arraySort(array);
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

    public static void arraySort(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static boolean includes(int[] array, int num){
        int l = 0;
        int r = array.length - 1;
        while (l <= r){
            int m = (l+r)/2;
            if(array[m]<num){
                l = m+1;
            } else if(array[m]> num){
                r = m-1;
            } else {
                return true;
            }
        }
        return false;
    }
}
