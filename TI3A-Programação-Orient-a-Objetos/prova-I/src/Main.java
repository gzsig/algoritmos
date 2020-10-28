import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Main {
  static List<Reservation> reservations = new ArrayList<Reservation>();
  static int MAX_TABLES = 6;

  public static void main(String[] args) {

    String rawOp = "";
    int op = 0;
    while (op != 6) {
      try {
        rawOp = JOptionPane.showInputDialog(null,
            "Restaurante SABOR SOFISTICADO \n1: Reservar mesa.\n2: Pesquisar reserva. \n3: Imprimir reservas. \n4: Imprimir lista de espera. \n5: Cancelar reserva. \n6: Finalizar.");
        if (rawOp == null) {
          op = 6;
        } else {
          op = Integer.parseInt(rawOp);
        }
        if (op > 6) {
          JOptionPane.showMessageDialog(null, "Opção invalida");
        }
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Você deve digitar um numero inteiro.");
        op = 0;
      } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(null, e);
        op = 0;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        op = 0;
      }

      program(op);

    }
  }

  public static void program(int op) {
    switch (op) {
      case 1:
        bookTable();
        break;
      case 2:
        lookForReservation();
        break;
      case 3:
        showReservations();
        break;
      case 4:
        showWaitingList();
        break;
      case 5:
        cancelReservation();
        break;

      default:
        return;
    }
  }

  public static void bookTable() {
    int type;
    String[] options = { "A vista", "Parcelado" };

    Client newCliente = createClient();
    if (newCliente == null) {
      return;
    }
    type = optionDialog(options, "Forma de pagamento");

    if (type == -1) {
      return;
    }

    Reservation ap = new Reservation(newCliente, type == 0 ? (true) : (false));
    if (reservations.size() >= MAX_TABLES) {
      dialog("O restaurante esta lotado, você é o numero " + (reservations.size() - MAX_TABLES + 1)
          + " na lista de espera");
    }
    reservations.add(ap);
  }

  public static void lookForReservation() {
    String id = inputDialog("Digito o CPF ou CNPJ do cliente");

    if (id == null) {
      return;
    }
    try {
      Reservation currentReservation = findReservationByClientId(id);
      int i = reservations.indexOf(currentReservation);

      if (i < MAX_TABLES) {
        dialog(reservations.get(i).getClient().getName() + " tem mesa reservada.");
        return;
      } else {
        dialog(reservations.get(i).getClient().getName() + " é " + (i - MAX_TABLES + 1) + " na lista de espera.");
        return;
      }
    } catch (Exception e) {
      dialog("Esse CPF ou CNPJ não possui reserva para o jantar.");
      return;
    }

  }

  public static void showReservations() {
    String formattedReservations = "";
    Client currentClient;

    for (int i = 0; i < reservations.size(); i++) {
      if (i >= MAX_TABLES)
        break;
      currentClient = reservations.get(i).getClient();
      formattedReservations += "Tipo: " + currentClient.getType() + " – Nome: " + currentClient.getName()
          + " – Forma de pagamento: " + reservations.get(i).getPaymentType() + "\n";
    }
    if (formattedReservations.equals("")) {
      dialog("A lista de reserva esta vazia.");
    } else {
      dialog(formattedReservations);
    }
  }

  public static void showWaitingList() {
    String formattedReservations = "";
    Client currentClient;

    for (int i = MAX_TABLES; i < reservations.size(); i++) {
      currentClient = reservations.get(i).getClient();
      formattedReservations += "Tipo: " + currentClient.getType() + " – Nome: " + currentClient.getName()
          + " – Forma de pagamento: " + reservations.get(i).getPaymentType() + " – Posição no lista de espera: "
          + (i - MAX_TABLES + 1) + "\n";
    }
    if (formattedReservations.equals("")) {
      dialog("A lista de espera esta vazia.");
    } else {
      dialog(formattedReservations);
    }
  }

  public static void cancelReservation() {
    String id = inputDialog("Informe o CPF ou CNPJ para realizar a pesquisa da reserva.");
    Reservation currentReservation = findReservationByClientId(id);
    if (currentReservation != null) {
      reservations.remove(currentReservation);
    } else {
      dialog("Reserva não encontrada com esse documento");
    }
  }

  public static Client createClient() {
    String[] options = { "PJ", "PF" };
    String name = "";
    String id = "";
    int type;

    type = optionDialog(options, "Tipo de cliente");
    if (type == -1) {
      return null;
    }
    name = inputDialog("Nome do cliente");

    if (type == 0) {
      id = inputDialog("CNPJ do cliente");
      Pj pj = new Pj(name, id);
      return pj;
    } else {
      id = inputDialog("CPF do cliente");
      Pf pf = new Pf(name, id);
      return pf;
    }
  }

  public static Reservation findReservationByClientId(String id) {
    for (int i = 0; i < reservations.size(); i++) {
      if (reservations.get(i).getClient().getId().equals(id)) {
        return reservations.get(i);
      }
    }
    return null;
  }

  public static void dialog(String text) {
    JOptionPane.showMessageDialog(null, text);
  }

  public static String inputDialog(String text) {
    String str = "";
    int loop = 0;
    while (loop == 0) {
      try {
        str = JOptionPane.showInputDialog(null, text);
        loop = 1;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        loop = 0;
      }
    }
    return str;
  }

  public static int optionDialog(String[] options, String text) {
    int option = -1;
    int loop = 0;
    while (loop == 0) {
      try {
        option = JOptionPane.showOptionDialog(null, text, null, JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE, null, options, null);
        loop = 1;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        loop = 0;
      }
    }
    return option;
  }

}