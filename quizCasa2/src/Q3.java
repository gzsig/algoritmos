public class Q3 {
    public static void main(String[] args) {
        int x[] = { 72, 91, 98, 52, 10, 72, 21, 25, 20, 33 };

        int aux, j, k;



        for(j = 0; j < x.length; j++) {

            for(k = 1; k < x.length; k++) {

                if(x[k] > x[k -1]) {

                    aux = x[k];

                    x[k] = x[k -1];

                    x[k - 1] = aux;

                }

            }

        }
        System.out.println(x[7]);
    }
}
