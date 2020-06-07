/**
 * No
 */
public class No<E> {

  E elemento;
  No<E> esq, dir;

  public No(E elemento) {
    this.elemento = elemento;
    this.esq = null;
    this.dir = null;
  }
}