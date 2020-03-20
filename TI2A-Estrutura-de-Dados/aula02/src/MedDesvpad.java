import java.text.DecimalFormat;
import java.util.Random;

public class MedDesvpad {
    public static void main(String[] args) {
        Random rand = new Random();
        DecimalFormat df = new DecimalFormat("###.##");
        int[] array = new int[10];
        double med, desvPad;
        arrayRandomFill(array, rand);
        med = arrayMed(array);
        desvPad = arrayDesvPad(array, med);
        System.out.print("array: ");
        arrayPrint(array);
        System.out.println("\nA média é: " + df.format(med)+ " e o desvio padrão é: " + df.format(desvPad));
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

    public static float arrayMed(int[] array) {
        float med;
        med = arraySum(array)/array.length;
        return  med;
    }

    public static float arraySum(int[] array) {
        float cont = 0;
        for(int i = 0; i < array.length; i++){
            cont += array[i];
        }
        return cont;
    }

    public static double arrayDesvPad(int[] array, double med) {
        double sum = 0, res;
        for (int i = 0; i < array.length; i++) {
            sum+=Math.pow((array[i]-med),2);
        }
        res = sum/array.length-1;
        res = Math.pow(res, 0.5);
        return res;
    }
}
