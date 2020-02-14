package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("first number?");
        numbers.add(keyboard.nextInt());
        System.out.println("second number?");
        numbers.add(keyboard.nextInt());
        System.out.println("third number?");
        numbers.add(keyboard.nextInt());

        Collections.sort(numbers);

        System.out.println(numbers.get(0));

        keyboard.close();
    }
}
