/**
 * DoublyLinkedList
 */
public class Playlist {

  Node first;
  Node last;

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
    Song top1 = null, top2 = null, top3 = null, top4 = null, top5 = null;
    int play1 = 0, play2 = 0, play3 = 0, play4 = 0, play5 = 0;
    while (iterate != null) {
      if (iterate.data.playTimes > play1) {
        play1 = iterate.data.playTimes;
        top1 = iterate.data;
        iterate = iterate.right;
        continue;
      } else if (iterate.data.playTimes > play2) {
        play2 = iterate.data.playTimes;
        top2 = iterate.data;
        iterate = iterate.right;
        continue;
      } else if (iterate.data.playTimes > play3) {
        play3 = iterate.data.playTimes;
        top3 = iterate.data;
        iterate = iterate.right;
        continue;
      } else if (iterate.data.playTimes > play4) {
        play4 = iterate.data.playTimes;
        top4 = iterate.data;
        iterate = iterate.right;
        continue;
      } else if (iterate.data.playTimes > play5) {
        play5 = iterate.data.playTimes;
        top5 = iterate.data;
        iterate = iterate.right;
        continue;
      }
      iterate = iterate.right;
    }
    if (top1 == null && top2 == null && top3 == null && top4 == null && top5 == null){
      System.out.println("Nenhuma musica foi tocada :/");
    }
    if (top1 != null) {
      System.out.print("TOP 1 – Titulo: " + top1.title + " – ");
      System.out.print("Artista: " + top1.artist + " – ");
      System.out.print("Genero: " + top1.genre + " – ");
      System.out.println("Vezes tocada: " + top1.playTimes + "\n");
    }
    if (top2 != null) {
      System.out.print("TOP 2 – Titulo: " + top2.title + " – ");
      System.out.print("Artista: " + top2.artist + " – ");
      System.out.print("Genero: " + top2.genre + " – ");
      System.out.println("Vezes tocada: " + top2.playTimes + "\n");
    }
    if (top3 != null) {
      System.out.print("TOP 3 – Titulo: " + top3.title + " – ");
      System.out.print("Artista: " + top3.artist + " – ");
      System.out.print("Genero: " + top3.genre + " – ");
      System.out.println("Vezes tocada: " + top3.playTimes + "\n");
    }
    if (top4 != null) {
      System.out.print("TOP 4 – Titulo: " + top4.title + " – ");
      System.out.print("Artista: " + top4.artist + " – ");
      System.out.print("Genero: " + top4.genre + " – ");
      System.out.println("Vezes tocada: " + top4.playTimes + "\n");
    }
    if (top5 != null) {
      System.out.print("TOP 5 – Titulo: " + top5.title + " – ");
      System.out.print("Artista: " + top5.artist + " – ");
      System.out.print("Genero: " + top5.genre + " – ");
      System.out.println("Vezes tocada: " + top5.playTimes + "\n");
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