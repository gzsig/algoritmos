import java.util.Scanner;

public class OperadoresAritmetios {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		String operation;

		System.out.println("What is the equation?");
		operation = keyboard.next();

		if (operation.equals("a")) {
			operationA(keyboard);
		} else if (operation.equals("b")) {
			operationB(keyboard);
		} else if (operation.equals("c")) {
			operationC(keyboard);
		} else if (operation.equals("d")) {
			operationD(keyboard);
		} else {
			System.out.println("That is not a valid function");
		}

		keyboard.close();

	}

	static void operationA(Scanner keyboard) {

		System.out.println("What is a?");
		double a = keyboard.nextDouble();

		System.out.println("What is b?");
		double b = keyboard.nextDouble();

		System.out.println("What is c?");
		double c = keyboard.nextDouble();

		double result = (-b - Math.pow(b, 3) - (4 * a * c) + 2 * Math.pow(a, 2)) / (2 * a / (Math.pow((b + 1), 2)));

		System.out.println(result);

		keyboard.close();
	}

	static void operationB(Scanner keyboard) {

		System.out.println("What is x?");
		double x = keyboard.nextDouble();

		double result = Math.pow(x, 1.0 / 3) + Math.pow(x + 2.0, 3.0 / 5);

		System.out.println(result);

		keyboard.close();
	}

	static void operationC(Scanner keyboard) {

		System.out.println("What is a?");
		double a = keyboard.nextDouble();

		System.out.println("What is b?");
		double b = keyboard.nextDouble();

		System.out.println("What is c?");
		double c = keyboard.nextDouble();

		double result = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

		System.out.println(result);

		keyboard.close();
	}

	static void operationD(Scanner keyboard) {

		System.out.println("What is x?");
		double x = keyboard.nextDouble();

		System.out.println("What is y?");
		double y = keyboard.nextDouble();

		double result = (Math.pow(x, 4.0 / 5) / (x - 3)) + (2 / 3.0 * Math.pow(x, 5) / Math.sqrt(x + y));

		System.out.println(result);

		keyboard.close();
	}

}