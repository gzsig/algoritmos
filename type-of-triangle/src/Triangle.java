import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Double a, b, c;
        Scanner keyboard = new Scanner(System.in);
        a = keyboard.nextDouble();
        b = keyboard.nextDouble();
        c = keyboard.nextDouble();
        if (validate(a,b,c)){
            System.out.println( getType(a,b,c));
        } else {
            System.out.println("not a triangle");
        }
        keyboard.close();
    }

    public static String getType(Double a, Double b, Double c){
       String type = "";

       if(a == b && a == c && b == c){
           type = "equilatero";
       } else if(a == b || b == c || c ==a){
           type = "isoscelles";
        } else {
           type = "escalano";
       }

       return type;
    }

    public static boolean validate(Double a, Double b, Double c){
        if(a+b > c && b+c > a && a+c > b){
            return true;
        } else {
            return false;
        }
    }

}
