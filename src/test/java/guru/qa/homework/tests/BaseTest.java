package guru.qa.homework.tests;

import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

  @BeforeAll
  public static void setUpAll() {
    Configuration.browserSize = "1920x1080";
  }

  @BeforeEach
  public void setUpEach() {
    open("https://demoqa.com/text-box");
  }

}
