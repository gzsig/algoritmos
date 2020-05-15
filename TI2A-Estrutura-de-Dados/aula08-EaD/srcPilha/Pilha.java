
public class Pilha<E> {
	private No<E> topo; // as variáveis são automaticamente inicializadas com null

	public void push(E dado) { // classe escrita com letra maiúscula
		No<E> aux = new No<E>(dado); // os campos do NÓ são automaticamente inicializados com null

		if (topo == null) {
			topo = aux; // acontece apenas quando a lista estiver vazia
		} else {
			topo.esq = aux;
			aux.dir = topo;
			topo = aux;
		}
	}

	// método para remover um elemento do topo da pilha (início)
	public E pop() {
		if (topo == null) {
			return null;
		} else {
			No<E> aux = topo;
			topo = aux.dir; // ou topo = topo.dir;
			aux.dir = null;
			topo.esq = null;
			return aux.dado;
		}
	}

	public void imprimir() {
		No<E> aux = topo;
		while (aux != null) {
			System.out.println(aux.dado); // método toString é chamado automaticamente --> aux.dado.toString()
			aux = aux.dir;
		}
	}

	// método para ferificar se a pilha esta vazia
	public boolean isEmpty() {
		return topo == null;
	}

	// método para retornar o elemento que esta no topo da pilha
	public E topItem() {
		return isEmpty() ? null : topo.dado;
	}

}
