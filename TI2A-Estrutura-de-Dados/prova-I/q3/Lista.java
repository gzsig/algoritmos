import java.lang.reflect.Array;

/**
 * Lista
 */
public class Lista<E> {
  No<E> inicio, fim;
  E[] array;

  public Lista() {
    this.inicio = null;
    this.fim = null;
  }

  // insere um elemento no início da lista
  public void inserirInicio(E elemento) {
    No<E> tmp = new No<E>(elemento);
    if (this.inicio == null) {
      this.inicio = this.fim = tmp;
    } else {
      this.inicio.esq = tmp;
      tmp.dir = this.inicio;
      this.inicio = tmp;
    }
  }

  // insere um elemento no final da lista
  public void inserirFinal(E elemento) {
    No<E> tmp = new No<E>(elemento);
    if (this.inicio == null) {
      this.inicio = this.fim = tmp;
    } else {
      this.fim.dir = tmp;
      tmp.esq = this.fim;
      this.fim = tmp;
    }
  }

  // pesquisa um elemento na lista
  // se o elemento estiver, retorna sua referência (endereço) //se não estiver,
  // retorna null
  // public E pesquisar(E elemento) {
  // }

  public int size() {
    No<E> tmp = this.inicio;
    int cont = 0;
    while (tmp != null) {
      cont++;
      tmp = tmp.dir;
    }
    return cont;
  }

  public E[] cpToArray() {
    No<E> tmp = this.inicio;
    this.array = (E[]) new Object[size()];
    for (int i = 0; i < size(); i++) {
      array[i] = tmp.elemento;
      tmp = tmp.dir;
    }
    return array;
  }

  public void print() {
    No<E> tmp = this.inicio;
    if (tmp == null) {
      System.out.println("Empty");
    } else {
      System.out.print("[ ");
      while (tmp != null) {
        if (tmp == this.fim) {
          System.out.print(tmp.elemento);
        } else {
          System.out.print(tmp.elemento + ", ");
        }
        tmp = tmp.dir;
      }
      System.out.println(" ]");
    }
  }
}