package guru.qa.homework.helpers;

import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class TestData {

  public static Stream<Arguments> data() {
    return Stream.of(
        Arguments.of("Aurelia Schoen", "aurelia.schoen@gmail.com"),
        Arguments.of("Loris Johnson", "loris.johnson@gmail.com"),
        Arguments.of("Mervin Rau", "mervin.rau@gmail.com")
    );
  }

}
