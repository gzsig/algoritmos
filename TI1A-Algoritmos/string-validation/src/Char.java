import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        String charcter;
        Boolean run = true;

        System.out.println("type one letter");
        Scanner keyboard = new Scanner(System.in);

//        if (charcter.equalsIgnoreCase("a") || charcter.equalsIgnoreCase("e") || charcter.equalsIgnoreCase("i") || charcter.equalsIgnoreCase("o") || charcter.equalsIgnoreCase("u") ){
//            System.out.println("vogal");
//        } else {
//            System.out.println("cosoante");
//        }

        while (run) {
            charcter = keyboard.nextLine();
            charcter = charcter.toLowerCase();
            switch (charcter) {
                case "a":
                case "u":
                case "e":
                case "i":
                case "o":
                    System.out.println("vogal");
                    break;
                case "quit":
                    System.out.println("Até logo");
                    run = charcter.contains("quit") ? false : true;
                    break;
                default:
                    System.out.println("nao é uma vogal");
            }

        }
        keyboard.close();
    }

}
