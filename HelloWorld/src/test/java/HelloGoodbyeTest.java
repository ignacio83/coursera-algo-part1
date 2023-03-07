import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloGoodbyeTest {

  @Test
  public void Test() {
    var out = SystemStream.getOutput();

    HelloGoodbye.main(new String[] {"Kevin", "Bob"});

    assertEquals("""
				Hello Kevin and Bob.
				Goodbye Bob and Kevin.
				""", out.toString());
  }
}
