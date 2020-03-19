public class Q6 {
    public static void main(String[] args) {

        int[] ia = {1, 3, 5, 7, 9};

        for(int x = 0; x < ia.length; x++) {

            for(int j = 0; j < 3; j++) {

                if(ia[x] <= 4 || ia[x] >= 8) {

                    System.out.print(ia[x]+" ");

                }

                if(j == 1) {

                    break;

                }

            }

        }



    }
}
