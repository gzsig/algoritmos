public class Dez {
    public static void main(String[] args) {
        int a, b, c, i;

        a = 2;

        b = 0;

        c = 0;

        for(i = 1; i <= 5; i += 1) {

            b += 2*a+i;

            c += 3*a-i;

        }
        System.out.println(b+c);
    }
}
