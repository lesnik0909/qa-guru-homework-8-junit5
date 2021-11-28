package guru.qa.homework.helpers;

public enum Data {

  FIRST("Aurelia Schoen", "aurelia.schoen@gmail.com"),
  SECOND("Loris Johnson", "loris.johnson@gmail.com"),
  THIRD("Mervin Rau", "mervin.rau@gmail.com");

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
