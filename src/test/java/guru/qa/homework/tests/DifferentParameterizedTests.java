package guru.qa.homework.tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import guru.qa.homework.helpers.Data;
import guru.qa.homework.helpers.DataArgumentsSource;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class DifferentParameterizedTests extends BaseTest {

  @Tag("ValueSource")
  @Story("Parameterized test with source 'ValueSource'")
  @ValueSource(strings = {"Aurelia Schoen", "Loris Johnson", "Mervin Rau"})
  @ParameterizedTest(name = "Fill the form with fullName \"{0}\"")
  public void valueSourceTest(String fullName) {
    $("#userName").setValue(fullName);
    $("#userEmail").setValue("talia.lubowitz@hotmail.com");
    $("#submit").click();
    $("#name").shouldHave(text(fullName));
    $("#email").shouldHave(text("talia.lubowitz@hotmail.com"));
  }

  @Tag("MethodSource")
  @Story("Parameterized test with source 'MethodSource'")
  @MethodSource("guru.qa.homework.helpers.TestData#data")
  @ParameterizedTest(name = "Fill the form with fullName \"{0}\" and email \"{1}\"")
  public void methodSourceTest(String fullName, String email) {
    $("#userName").setValue(fullName);
    $("#userEmail").setValue(email);
    $("#submit").click();
    $("#name").shouldHave(text(fullName));
    $("#email").shouldHave(text(email));
  }

  @Tag("EnumSource")
  @Story("Parameterized test with source 'EnumSource'")
  @EnumSource(Data.class)
  @ParameterizedTest(name = "Fill the form with person \"{0}\"")
  public void enumSourceTest(Data data) {
    $("#userName").setValue(data.getFullName());
    $("#userEmail").setValue(data.getEmail());
    $("#submit").click();
    $("#name").shouldHave(text(data.getFullName()));
    $("#email").shouldHave(text(data.getEmail()));
  }

  @Tag("ArgumentSource")
  @Story("Parameterized test with source 'ArgumentsSource'")
  @ArgumentsSource(DataArgumentsSource.class)
  @ParameterizedTest(name = "Fill the form with fullName \"{0}\" and email \"{1}\"")
  public void argumentSourceTest(String fullName, String email) {
    $("#userName").setValue(fullName);
    $("#userEmail").setValue(email);
    $("#submit").click();
    $("#name").shouldHave(text(fullName));
    $("#email").shouldHave(text(email));
  }

  @Tag("CsvSource")
  @Story("Parameterized test with source 'CsvSource'")
  @CsvSource({"Aurelia Schoen, talia.lubowitz@hotmail.com", "Loris Johnson, johna.moen@gmail.com", "Mervin Rau, carmina.wunsch@gmail.com"})
  @ParameterizedTest(name = "Fill the form with fullName \"{0}\" and email \"{1}\"")
  public void csvSourceTest(String fullName, String email) {
    $("#userName").setValue(fullName);
    $("#userEmail").setValue(email);
    $("#submit").click();
    $("#name").shouldHave(text(fullName));
    $("#email").shouldHave(text(email));
  }

  @Tag("CsvFileSource")
  @Story("Parameterized test with source 'CsvFileSource'")
  @CsvFileSource(resources = "/data.csv", numLinesToSkip = 1)
  @ParameterizedTest(name = "Fill the form with fullName \"{0}\" and email \"{1}\"")
  public void csvFileSourceTest(String fullName, String email) {
    $("#userName").setValue(fullName);
    $("#userEmail").setValue(email);
    $("#submit").click();
    $("#name").shouldHave(text(fullName));
    $("#email").shouldHave(text(email));
  }

}
