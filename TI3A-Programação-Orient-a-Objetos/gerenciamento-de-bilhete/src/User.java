/**
 * User
 */
public class User {

  private enum userType {
    NORMAL, ESTUDANTE, PROFESSOR
  }

  String name;
  String id;
  userType type;

  public User(String nome, String cpf, userType tipo) {
    this.name = nome;
    this.id = cpf;
    this.type = tipo;
  }

  public String getData() {

    return this.name + this.id + this.type;
  }

}