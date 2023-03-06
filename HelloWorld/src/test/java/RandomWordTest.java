import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomWordTest {
	@Test
	public void TestMain(){
		SystemStream.writeToInput("heads tails");

		var out = SystemStream.getOutput();

		RandomWord.main(new String[]{});

		final var champion = out.toString();
		assertTrue("heads\n".equals(champion) || "tails\n".equals(champion));
	}
}
