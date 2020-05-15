
//E --> element, T --> type, K --> key

public class No<E> { //letra maiúscula --> Classe --> objeto
	E dado;
	No<E> esq, dir; //padrão NULL (refer�ncia)
	
	public No(E dado) {
		this.dado = dado;
	}
}
