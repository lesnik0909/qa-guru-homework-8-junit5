package guru.qa.homework.helpers;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class DataArgumentsSource implements ArgumentsProvider {

  @Override
  public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
    return Stream.of(
        Arguments.of("Aurelia Schoen", "aurelia.schoen@gmail.com"),
        Arguments.of("Loris Johnson", "loris.johnson@gmail.com"),
        Arguments.of("Mervin Rau", "mervin.rau@gmail.com")
    );
  }

}
