public class Tres {
    public static void main(String[] args) {

        int a, b, c, d, e;

        a = 0;

        b = 1;

        e = a + b;

        c = 3;

        for(; c <= 11; ) {

            e = e + (a+b);

            d = a;

            a = b;

            b = b + d;

            c++;

        }
        System.out.println(e);
    }
}
