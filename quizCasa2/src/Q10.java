public class Q10 {
    public static void main(String[] args) {
        int x[] = { 33, 14, 5, 12, 90, 72, 21, 1, 10, 30 };
        int aux;
        for(int i = 0; i < x.length; i++) {

            for(int j = 0; j < x.length-i-1; j++) {

                if(x[j] < x[j+1]) {

                    aux = x[j];

                    x[j] = x[j+1];

                    x[j+1] = aux;

                }

            }

        }

        for(int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }

    }
}

