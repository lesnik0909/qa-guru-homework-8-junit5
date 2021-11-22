package guru.qa.homework.helpers;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class TestData {

  public static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of("Aurelia Schoen", "talia.lubowitz@hotmail.com"),
        Arguments.of("Loris Johnson", "johna.moen@gmail.com"),
        Arguments.of("Mervin Rau", "carmina.wunsch@gmail.com")
    );
  }

}
