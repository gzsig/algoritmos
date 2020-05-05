/**
 * DoublyLinkedList
 */
public class Playlist {

  Node first;
  Node last;
  Song[] top5 = new Song[6];

  public void push(Song instance) {
    Node tmp = new Node();
    tmp.data = instance;
    if (first == null) {
      first = last = tmp;
    } else {
      last.right = tmp;
      tmp.left = last;
      last = tmp;
    }
    alphabetical();
  }

  public Node search(String title) {
    Node searching = first;
    while (searching != null) {
      if (searching.data.title.equals(title)) {
        return searching;
      }
      searching = searching.right;
    }
    return searching;
  }

  public void play(String title) {
    Node song = search(title);
    if (song != null) {
      System.out.println("Escutando: ");
      System.out.print("Titulo: " + song.data.title + " – ");
      System.out.print("Artista: " + song.data.artist + " – ");
      System.out.print("Genero: " + song.data.genre + " – ");
      System.out.println("Vezes tocada: " + song.data.playTimes + "\n");
      song.data.playTimes++;
    } else {
      System.out.println("Xii, não encontrei essa ai");
    }
  }

  public boolean remove(String title) {
    Node song = search(title);
    if (song != null) {
      if (song.left == null && song.right == null) {
        first = null;
        last = null;
        return true;
      } else if (song.left == null) {
        song.right.left = null;
        first = song.right;
        return true;
      } else if (song.right == null) {
        song.left.right = null;
        last = song.left;
        return true;
      } else {
        Node songPrev = song.left;
        Node songright = song.right;
        songPrev.right = song.right;
        songright.left = song.left;
        return true;
      }
    } else {
      System.out.println("Xii, não encontrei essa ai");
      return false;
    }
  }

  public void topSongs() {
    Node iterate = first;
    while (iterate != null) {

      int i;
      for (i = 0; i < top5.length - 1; i++) {
        if (top5[i] == null || top5[i].playTimes < iterate.data.playTimes)
          break;
      }
      for (int k = top5.length - 2; k >= i; k--) {
        top5[k + 1] = top5[k];
      }
      top5[i] = iterate.data;
      top5[5] = null;

      iterate = iterate.right;
    }
    printTopSongs(top5);
  }

  void printTopSongs(Song arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      if (arr[i] != null) {
        System.out.print("Top " + (i + 1) + " -> ");
        System.out.print("Titulo: " + arr[i].title + " – ");
        System.out.print("Artista: " + arr[i].artist + " – ");
        System.out.print("Genero: " + arr[i].genre + " – ");
        System.out.println("Vezes tocada: " + arr[i].playTimes + "\n");
        System.out.println();
      }
    }
    cleanArray(arr);
  }

  public void cleanArray(Song[] arr) {
    int n = arr.length;
    for (int i = 0; i < n; ++i) {
      arr[i] = null;
    }
  }

  public void alphabetical() {
    for (int i = 0; i < size() - 1; i++) {
      for (int j = 0; j < size() - i - 1; j++) {
        if (get(j).data.title.compareToIgnoreCase(get(j + 1).data.title) > 0) {
          swap(get(j), get(j + 1));
        }
      }
    }
  }

  public void swap(Node swap1, Node swap2) {
    Song tmp = swap1.data;
    swap1.data = swap2.data;
    swap2.data = tmp;
  }

  public int size() {
    Node count = first;
    int cont = 0;
    while (count != null) {
      cont++;
      count = count.right;
    }
    return cont;
  }

  public Node get(int index) {
    Node atIndex = first;
    for (int i = 0; i < index; i++) {
      atIndex = atIndex.right;
    }
    return atIndex;
  }

  public void print() {
    Node toPrint = first;
    while (toPrint != null) {
      System.out.print("Titulo: " + toPrint.data.title + " – ");
      System.out.print("Artista: " + toPrint.data.artist + " – ");
      System.out.print("Genero: " + toPrint.data.genre + " – ");
      System.out.println("Vezes tocada: " + toPrint.data.playTimes + "\n");
      toPrint = toPrint.right;
    }
  }

}