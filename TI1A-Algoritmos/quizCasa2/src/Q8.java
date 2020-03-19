public class Q8 {
    public static void main(String[] args) {

        int x[] = { 72, 91, 98, 52, 10, 72, 21, 25, 20, 33 };

        int aux, j, k;



        for(j = x.length-1; j >= 0; j--) {

            x[j] = x[j];

        }
        System.out.println(x[8]);
    }
}
