import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    try {
      int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 1"));
      int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor 2"));
      int res = x / y;
      JOptionPane.showInternalMessageDialog(null, res);
    } catch (Exception e) {
      JOptionPane.showMessageDialog(null, e);
    }
  }
}
