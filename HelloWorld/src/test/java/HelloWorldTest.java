import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

	@Test
	public void TestMain(){
		var out = SystemStream.getOutput();

		HelloWorld.main(new String[]{});

		assertEquals("""
				Hello, World
				""", out.toString());
	}
}
