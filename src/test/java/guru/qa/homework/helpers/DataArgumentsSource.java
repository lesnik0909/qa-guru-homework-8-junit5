package guru.qa.homework.helpers;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class DataArgumentsSource implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
    return Stream.of(
        Arguments.of("Aurelia Schoen", "talia.lubowitz@hotmail.com"),
        Arguments.of("Loris Johnson", "johna.moen@gmail.com"),
        Arguments.of("Mervin Rau", "carmina.wunsch@gmail.com")
    );
  }

}
