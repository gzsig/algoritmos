public class Q9 {
    public static void main(String[] args) {



        int x[] = { 33, 14, 5, 12, 90, 72, 21, 1, 10, 30 };

        int aux, j, k;



        for (j = 0; j < x.length; j++) {

            for (k = 0; k < x.length - 1; k++) {

                if (x[k] < x[k + 1]) {

                    aux = x[k];

                    x[k] = x[k + 1];

                    x[k + 1] = aux;

                }

            }

        }
        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

    }
}
