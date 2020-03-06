import java.util.Random;

public class ArrayManipulation {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] array = new int[10];
        arrayRandomFill(array, rand);
        System.out.print("Original: ");
        arrayPrint(array);
        arraySort(array);
        System.out.print("\nOrdenada: ");
        arrayPrint(array);

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
}
