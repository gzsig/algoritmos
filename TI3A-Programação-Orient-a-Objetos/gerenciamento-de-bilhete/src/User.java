/**
 * User
 */
public class User {

  public enum userType {
    NORMAL, ESTUDANTE, PROFESSOR
  };

  private String name;
  private String id;
  private userType type;

  public User(String nome, String cpf, userType tipo) {
    this.name = nome;
    this.id = cpf;
    this.type = tipo;
  }

  public String getId() {
    return this.id;
  }

  public String getData() {
    return this.name + " " + this.id + " " + this.type;
  }

}