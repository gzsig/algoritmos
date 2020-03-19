public class Nove {
    public static void main(String[] args) {
        int i, j;

        int n=10, m=8, cont=0;

        i = 1;

        int x = 0;

        while(i <= n) {

            j = 2;

            while(j < m) {

                // CALCULA
                cont++;

                        j = j + 2;

            }

            i++;

        }
        System.out.println(cont);
    }
}
