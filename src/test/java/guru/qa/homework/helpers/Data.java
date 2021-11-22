package guru.qa.homework.helpers;

public enum Data {

  FIRST("Aurelia Schoen", "talia.lubowitz@hotmail.com"),
  SECOND("Loris Johnson", "johna.moen@gmail.com"),
  THIRD("Mervin Rau", "carmina.wunsch@gmail.com");

  private final String fullName;
  private final String email;

  Data(String fullName, String email) {
    this.fullName = fullName;
    this.email = email;
  }

  public String getFullName() {
    return fullName;
  }

  public String getEmail() {
    return email;
  }

}
