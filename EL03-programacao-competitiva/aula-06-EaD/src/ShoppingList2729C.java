import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ShoppingList2729C {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		String entrada;
		String[] palavra;
		Set<String> set = new HashSet<String>();
		List<String> lista = new ArrayList<String>();
		n = teclado.nextInt();
		teclado.nextLine();
		for (int i = 1; i <= n; i++) {
			entrada = teclado.nextLine();
			palavra = entrada.split(" ");
			for (String s : palavra) {
				set.add(s);
			}
			for (String s : set) {
				lista.add(s);
			}
			Collections.sort(lista);
			for (int j = 0; j < lista.size(); j++) {
				System.out.print(lista.get(j));
				if (j != lista.size() - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
			set.clear();
			lista.clear();
		}
		teclado.close();
	}
}