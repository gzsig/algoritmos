import java.util.Scanner;

public class NotaMedia {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numalunos, numativs;
        System.out.println("quantos alunos?");
        numalunos = keyboard.nextInt();
        System.out.println("quantas atividades?");
        numativs = keyboard.nextInt();
        String[] alunos = new String[numalunos];
        int[][] ativs = new int[numalunos][numativs];
        getnames(alunos, keyboard);
        getGrades(alunos, ativs, keyboard);
        arrayPrint(alunos, ativs);
    }

    public static void getnames(String[] alunos, Scanner keyboard) {
        for (int i = 0; i < alunos.length; i++) {
            int num = i + 1;
            System.out.println("nome do " + num + " aluno");
            alunos[i] = keyboard.next();
        }
    }

    public static void getGrades(String[] alunos, int[][] ativs, Scanner keyboard) {
        for (int i = 0; i < alunos.length; i++) {
            for (int j = 0; j < ativs[i].length; j++) {
                int num = j + 1;
                System.out.println("Nota da atividade " + num + " de " + alunos[i]);
                ativs[i][j] = keyboard.nextInt();
            }
        }
    }

    public static void arrayPrint(String[] alunos, int[][] ativs) {
        for (int i = 0; i < alunos.length; i++) {
            System.out.print("\n" + alunos[i] + ": [");
            double sum = 0;
            for (int j = 0; j < ativs[i].length; j++) {
                sum += ativs[i][j];
                System.out.print(ativs[i][j] + " ");
            }
            System.out.print("] media: " + sum/alunos.length);
        }
    }

}
