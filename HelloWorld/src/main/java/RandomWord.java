import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
	public static void main(String[] args) {
		while (!StdIn.isEmpty()) {
			var word = StdIn.readString();
			if (StdRandom.bernoulli()) {
				StdOut.println(word);
				break;
			}
		}
	}
}
