import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

	@Test
	public void TestMain(){
		var out = SystemStream.getOutput();

		HelloWorld.main(new String[]{});

		Assertions.assertEquals("""
				Hello, World
				""", out.toString());
	}
}
