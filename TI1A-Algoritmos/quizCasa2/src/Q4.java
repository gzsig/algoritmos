public class Q4 {
    public static void main(String[] args) {
        int x[] = { 72, 91, 98, 52, 10, 72, 21, 25, 20, 33 };
        for(int j = 0; j < 10; j++) {

            for(int k = 0; k < 10-j; k++) {

                System.out.print(x[k]+" - ");

            }

            System.out.println();

        }
        replica();
    }
    public static void replica() {
        int x[] = { 72, 91, 98, 52, 10, 72, 21, 25, 20, 33 };
        int j = 0;

        while(j < 10) {

            int k = 0;

            do {

                System.out.print(x[k]+" - ");

                k++;

            }while(k < 10-j);

            System.out.println();

            j++;

        }


    }
}
