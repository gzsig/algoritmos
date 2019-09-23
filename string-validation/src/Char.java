import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        String charcter;

        System.out.println("type one letter");
        Scanner keyboard = new Scanner(System.in);

        charcter = keyboard.nextLine();
        charcter = charcter.toLowerCase();

        if (charcter.equalsIgnoreCase("a") || charcter.equalsIgnoreCase("e") || charcter.equalsIgnoreCase("i") || charcter.equalsIgnoreCase("o") || charcter.equalsIgnoreCase("u") ){
            System.out.println("vogal");
        } else {
            System.out.println("cosoante");
        }

        keyboard.close();
    }

}
