import java.util.ArrayList;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String elevator;
        int sizeA = 0, sizeB = 0, sizeC = 0, usr = 0, am = 0, av = 0, an = 0, bm = 0, bv = 0, bn = 0, cm = 0, cv = 0,
                cn = 0, m = 0, v = 0, n = 0;
        boolean run = true;

        ArrayList<String> elevA = new ArrayList<String>();
        ArrayList<String> elevB = new ArrayList<String>();
        ArrayList<String> elevC = new ArrayList<String>();

        while (run) {
            System.out.println("O elevador que utiliza com mais frequência");
            elevator = keyboard.next();

            if (elevator.equals("a") || elevator.equals("A")) {
                System.out.println(
                        "O período em que utilizava o elevador (“M” – Matutino, “V” – Vespertino e “N” – Noturno)");
                elevA.add(keyboard.next());
                if (elevA.get(elevA.size() - 1).equals("M") || elevA.get(elevA.size() - 1).equals("m")) {
                    am++;
                } else if (elevA.get(elevA.size() - 1).equals("V") || elevA.get(elevA.size() - 1).equals("v")) {
                    av++;
                } else if (elevA.get(elevA.size() - 1).equals("N") || elevA.get(elevA.size() - 1).equals("n")) {
                    an++;
                }
            } else if (elevator.equals("b") || elevator.equals("B")) {
                System.out.println(
                        "O período em que utilizava o elevador (“M” – Matutino, “V” – Vespertino e “N” – Noturno)");
                elevB.add(keyboard.next());
                if (elevA.get(elevA.size() - 1).equals("M") || elevA.get(elevA.size() - 1).equals("m")) {
                    bm++;
                } else if (elevA.get(elevA.size() - 1).equals("V") || elevA.get(elevA.size() - 1).equals("v")) {
                    bv++;
                } else if (elevA.get(elevA.size() - 1).equals("N") || elevA.get(elevA.size() - 1).equals("n")) {
                    bn++;
                }
            } else if (elevator.equals("c") || elevator.equals("C")) {
                System.out.println(
                        "O período em que utilizava o elevador (“M” – Matutino, “V” – Vespertino e “N” – Noturno)");
                elevC.add(keyboard.next());
                if (elevA.get(elevA.size() - 1).equals("M") || elevA.get(elevA.size() - 1).equals("m")) {
                    cm++;
                } else if (elevA.get(elevA.size() - 1).equals("V") || elevA.get(elevA.size() - 1).equals("v")) {
                    cv++;
                } else if (elevA.get(elevA.size() - 1).equals("N") || elevA.get(elevA.size() - 1).equals("n")) {
                    cn++;
                }
            } else if (elevator.equals("x") || elevator.equals("X")) {
                run = false;
            }
        }

         sizeA = elevA.size();
         sizeB = elevB.size();
         sizeC = elevC.size();

        usr = sizeA + sizeB + sizeC;

        System.out.println("numero de usuarios que responderam a pesquisa :" + usr);

        System.out.println("elevador mais ultilizado: ");

        if (sizeA > sizeB || sizeA > sizeC) {
            System.out.println("elevator A");
            System.out.println("Periodo mais usado:");
            if (am > av || am > an) {
                System.out.println("M");
            } else if (av > am || av > an) {
                System.out.println("V");
            } else if (an > av || an > am) {
                System.out.println("N");
            }
        } else if (sizeB > sizeC || sizeB > sizeA) {
            System.out.println("elevator B");
            System.out.println("Periodo mais usado:");
            if (bm > bv || bm > bn) {
                System.out.println("M");
            } else if (bv > bm || bv > bn) {
                System.out.println("V");
            } else if (bn > bv || bn > bm) {
                System.out.println("N");
            }
        } else if (sizeC > sizeB || sizeC > sizeA) {
            System.out.println("elevator C");
            System.out.println("Periodo mais usado:");
            if (cm > cv || cm > cn) {
                System.out.println("M");
            } else if (cv > cm || cv > cn) {
                System.out.println("V");
            } else if (cn > cv || cn > cm) {
                System.out.println("N");
            }
        }
        m = am + bm + cm;
        v = av + bv + cv;
        n = an + bn + cn;

        System.out.println(" o período mais usado de todos:");

        if (m > v || m > n) {
            System.out.println("M");
        } else if (v > m || v > n) {
            System.out.println("V");
        } else if (n > v || n > m) {
            System.out.println("N");
        }
    }
}
