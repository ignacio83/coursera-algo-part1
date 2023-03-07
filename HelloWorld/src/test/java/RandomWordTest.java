import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomWordTest {

	@Test
	public void TestEmpty() {
		var out = SystemStream.getOutput();
		SystemStream.writeToInput("");
		RandomWord.main(new String[]{});

		final var output = out.toString();
		assertEquals("null\n", output);
	}

	@Test
	public void TestOneWord() {
		var out = SystemStream.getOutput();
		SystemStream.writeToInput("unique");
		RandomWord.main(new String[]{});

		final var output = out.toString();
		assertEquals("unique\n", output);
	}

	@Test
	public void TestTwoWords() {
		var out = SystemStream.getOutput();
		SystemStream.writeToInput("heads tails");
		RandomWord.main(new String[]{});

		final var output = out.toString();
		assertTrue(output.equals("heads\n") || output.equals("tails\n"));
	}
}
