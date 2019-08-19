import java.util.Scanner;

public class Operations {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		double firstInput, secondInput, thirdInput, result;
		
		System.out.println("What is the first grade of the operation?");	
		firstInput = keyboard.nextDouble();
		System.out.println("What is the second grade of the operation?");	
		secondInput = keyboard.nextDouble();
		System.out.println("What is the third grade of the operation?");	
		thirdInput = keyboard.nextDouble();
		
		result = firstInput + secondInput + thirdInput;
		
		System.out.println("The median of these two arguments is :" + result/3.0);
		
		keyboard.close();
		
	}

}
