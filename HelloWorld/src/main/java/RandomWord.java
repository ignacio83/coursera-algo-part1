import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    String champion = null;
    for (var i = 0; !StdIn.isEmpty(); i++) {
      final var word = StdIn.readString();
      final var ok = StdRandom.bernoulli(1 / (i + 1.0));
      if (ok) {
        champion = word;
      }
    }
    StdOut.println(champion);
  }
}
