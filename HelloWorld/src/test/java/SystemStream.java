import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SystemStream {

  protected static ByteArrayOutputStream getOutput() {
    final var out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));
    return out;
  }

  protected static void writeToInput(final String input) {
    final var in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);
  }
}
