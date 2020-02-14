import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int birthYear, startYear, age, workingYears;
        String name;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Informe o nome do funcionario");
        name = keyboard.nextLine();
        System.out.println("Informe o ano de nascimento do funcionario:");
        birthYear = keyboard.nextInt();
        System.out.println("Informe o ano de seu ingresso na empresa:");
        startYear = keyboard.nextInt();

        age = 2019 - birthYear;
        workingYears = 2019 - startYear;

        if (age > 64 || workingYears > 29 || (age > 59 && workingYears > 24)) {
            System.out.println(
                    "O " + name + " tem " + age + " e ja trabalhou " + workingYears + " ano(s) assim, Requerer aposentadoria");
        } else {
            System.out.println("O " + name + " tem " + age + " anos e ja trabalhou " + workingYears
                    + " ano(s) assim, nao Requerer aposentadoria");
        }

        keyboard.close();

    }
}
