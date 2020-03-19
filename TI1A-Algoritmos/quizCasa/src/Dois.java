public class Dois {
    public static void main(String[] args) {
        int n=4, x, conta, contab, exp, resp;

        x = 2;

        resp = x;

        for(conta = 2; conta <= n; conta += 2) {

            exp = x;

            contab = 1;

            for(; contab < conta; contab++) {

                exp *= x;

            }

            resp += exp;

        }

        System.out.println(resp);
    }
}
