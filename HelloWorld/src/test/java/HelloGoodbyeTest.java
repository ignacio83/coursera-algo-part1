import org.junit.jupiter.api.Test;

public class HelloGoodbyeTest {

	@Test
	public void TesTwoNames(){
		HelloGoodbye.main(new String[]{"Kevin", "Bob"});
	}

	@Test
	public void TesThreeNames(){
		HelloGoodbye.main(new String[]{"Kevin", "Bob", "John"});
	}
}
