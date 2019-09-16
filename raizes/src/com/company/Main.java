package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int  x, y, z, menor;

        System.out.println("first number?");
        x = keyboard.nextInt();
        System.out.println("second number?");
        y = keyboard.nextInt();
        System.out.println("third number?");
        z = keyboard.nextInt();

        menor = x;

        if (x != z && x != y && z != y){
            if (z < menor){
                menor = z;
            }
            if (y < menor){
                menor = y;
            }
            System.out.println(menor);
        }
        else {
            System.out.println("the there are matching numbers!");
        }

        keyboard.close();
    }
}
